package com.foxshooter.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.solr.client.solrj.SolrServerException;

import com.foxshooter.bean.Log;
import com.foxshooter.solr.SolrSeacher;

public class SearchLogServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String queryString = request.getParameter("queryString");
		System.out.println(queryString);
		SolrSeacher search = new SolrSeacher();
		List<Log> logs = new ArrayList<Log>();
		// Log log = new Log();
		// log.logId = "swwwwwwwwwwww";
		// log.operateTime = new Date();
		// log.personName = "egawe";
		// logs.add(log);
		try {
			logs = search.searchLogs(queryString);
		} catch (SolrServerException e) {
			e.printStackTrace();
		}
		request.setAttribute("logs", logs);
		request.getRequestDispatcher("search.jsp").forward(request, response);
	}

}
