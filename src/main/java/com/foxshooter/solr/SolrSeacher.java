package com.foxshooter.solr;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.logging.LogFactory;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

import com.foxshooter.bean.Log;
import com.foxshooter.hbase.HbaseSearcher;

public class SolrSeacher {

	private org.apache.commons.logging.Log logger = LogFactory.getLog(getClass());

	private static final String SOLR_URL = "http://182.92.149.48:8983/solr/log";

	public SolrDocumentList search(String queryString) throws SolrServerException {
		SolrServer solrServer = new HttpSolrServer(SOLR_URL);
		queryString = queryString == null ? "*:*" : queryString;
		SolrQuery solrQuery = new SolrQuery(queryString);
		solrQuery.setSort("logId", ORDER.desc);
		QueryResponse resp = solrServer.query(solrQuery);
		return resp.getResults();
	}

	public List<Log> searchLogs(String queryString) throws SolrServerException, IOException {
		List<Log> logs = new ArrayList<Log>();
		SolrDocumentList list = search(queryString);
		HbaseSearcher hs = new HbaseSearcher();
		for (SolrDocument doc : list) {
			String logId = (String) doc.getFieldValue("logId");
			Log log = hs.getLogByRowKey(logId);
			logs.add(log);
		}
		return logs;
	}

	public Log parseLog(SolrDocument doc) {
		Log log = new Log();
		log.logId = (String) doc.getFieldValue("logId");
		log.operateTime = (Date) doc.getFieldValue("operateTime");
		log.personName = (String) doc.getFieldValue("personName");
		return log;
	}

	public static String formatDate(Date date) {
		TimeZone UTC = TimeZone.getTimeZone("UTC");
		SimpleDateFormat tmp = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
		tmp.setTimeZone(UTC);
		return tmp.format(date);
	}

}
