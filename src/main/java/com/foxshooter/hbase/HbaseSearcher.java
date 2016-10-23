package com.foxshooter.hbase;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

import com.foxshooter.bean.Log;

public class HbaseSearcher {

	public org.apache.commons.logging.Log logger = LogFactory.getLog(getClass());

	public static final String TABLE_NAME = "log";
	public static final String COLUMN_FAMILY = "info";

	public Configuration hbaseConf = getConfiguration();

	public Configuration getConfiguration() {
		Configuration HBASE_CONFIG = new Configuration();
		HBASE_CONFIG.set("hbase.zookeeper.quorum", "master,slaver1,slaver2");
		HBASE_CONFIG.set("hbase.zookeeper.property.clientPort", "2181");
		Configuration cfg = HBaseConfiguration.create(HBASE_CONFIG);
		return cfg;
	}

	public Log getLogByRowKey(String rowkey) throws IOException {
		HTable table = new HTable(hbaseConf, TABLE_NAME);
		Get get = new Get(rowkey.getBytes());
		Result r = table.get(get);
		return buildLog(r);
	}

	private Log buildLog(Result r) throws UnsupportedEncodingException {
		Log log = new Log();
		for (KeyValue kv : r.list()) {
			String row = Bytes.toString(kv.getQualifier());
			String value = Bytes.toString(kv.getValue());
			if ("logId".equals(row)) {
				log.logId = value;
			}
			if ("operateTime".equals(row)) {
				log.operateTime = new Date(Long.valueOf(value));
			}
			if ("personName".equals(row)) {
				log.personName = value;
			}
			if ("clientIp".equals(row)) {
				log.clientIp = value;
			}
			if ("level2OrgId".equals(row)) {
				log.level2OrgId = value;
			}
			if ("level2OrgName".equals(row)) {
				log.level2OrgName = value;
			}
			if ("standardizeTime".equals(row)) {
				log.standardizeTime = new Date(Long.valueOf(value));
			}
			if ("indexTime".equals(row)) {
				log.indexTime = new Date(Long.valueOf(value));
			}
		}
		return log;
	}

}
