<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
					<table border="0" cellspacing="0" cellpadding="0" style="width:100%">
				        <tr >
				        	<td width="25%">logId</td>
				        	<td width="25%" style="padding-left: 40px">用户</td>
				        	<td width="25%" style="padding-left: 40px">操作时间</td>
				        	<td width="25%" style="padding-left: 40px">处理完成时间</td>
						</tr>
						<c:forEach items="${logs}"  var="log" varStatus="status">
				        <tr >
				        	<td width="25%">${log.logId}</td>
				        	<td width="25%" style="padding-left: 40px">${log.personName}</td>
				        	<td width="25%" style="padding-left: 40px"><fmt:formatDate value="${log.operateTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				        	<td width="25%" style="padding-left: 40px"><fmt:formatDate value="${log.indexTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
						</tr>
				        </c:forEach>
					</table>