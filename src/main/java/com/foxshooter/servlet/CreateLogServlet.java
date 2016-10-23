package com.foxshooter.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateLogServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String logCountStr = request.getParameter("logCount");
		createLogFile(Integer.valueOf(logCountStr));
		PrintWriter writer = response.getWriter();
		writer.write("succeed");
		writer.flush();
		writer.close();
	}

	/**
	 * 1405589311828|shijie|127.0.0.8|4
	 * 
	 * @param logCount
	 */
	private void createLogFile(int logCount) {
		try {
			File file = new File("/foo/flumeSpool/" + UUID.randomUUID().toString().replace("-", "") + ".txt");
			file.createNewFile();
			FileOutputStream out = new FileOutputStream(file, true);
			for (int i = 0; i < logCount; i++) {
				StringBuffer sb = new StringBuffer();
				sb.append(new Date().getTime());
				sb.append("|");
				sb.append(randomName());
				sb.append("|");
				sb.append(randomIP());
				sb.append("|");
				sb.append(randomOrgId());
				out.write(sb.toString().getBytes());
				out.write("\r\n".getBytes());
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String randomName() {
		String[] names = new String[] { "zhangsan", "wangwu", "lilei", "hanmeimei", "wanglong" };
		return names[new Random().nextInt(5)];
	}

	private String randomIP() {
		String[] ips = new String[] { "182.92.163.227", "123.57.38.171", "182.92.163.139", "182.92.149.48" };
		return ips[new Random().nextInt(4)];
	}

	private String randomOrgId() {
		String[] orgIds = new String[] { "1", "2", "3", "4", "5" };
		return orgIds[new Random().nextInt(5)];
	}

}
