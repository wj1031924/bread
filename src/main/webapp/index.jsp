<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Have a bread!</title>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript">
	function createLog(id) {
		var logCount = $(id).val();
		$.ajax({
			type : "GET",
			url : "createLog?logCount=" + logCount,
			success : function(data) {
				alert(data);
			}
		});
	}
	function queryLog(id) {
		var queryString = $(id).val();
		var url = "searchLog?queryString=" + queryString;
		$("#logDetail").attr("src", url);
	}
</script>
</head>
<body>
	<center>
		<b><font size="5">日志实时处理系统模型</font></b>
	</center>
	<center>
		<table>
			<tr>
				<td><select id="logCount">
						<option>100</option>
						<option>500</option>
						<option>1000</option>
						<option>3000</option>
						<option>5000</option>
						<option>10000</option>
						<option>100000</option>
				</select>条&nbsp;&nbsp;</td>
				<td><input type="button" onclick="createLog('#logCount');"
					value="生成日志(模拟)"
					style="border: 1px #38f solid; cursor: pointer; font-size: 16px;" />
				</td>
			</tr>
			<tr>
				<td><input type="text" id="queryString" style="width:500px"
					value="*:*  AND createTime:[2014-11-21T03:40:55.62Z TO 2014-11-21T03:50:55.62Z]" /></td>
				<td><input type="button" onclick="queryLog('#queryString');"
					value="查询"
					style="border: 1px #38f solid; cursor: pointer; font-size: 16px;" /></td>
			</tr>

		</table>
		<iframe id="logDetail" src="search.jsp"
			style="width: 90%; height: 500px"> </iframe>
	</center>
</body>
</html>