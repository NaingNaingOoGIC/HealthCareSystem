<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="inc/common.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JFree Chart</title>
<link href="css/library.css" rel="stylesheet" type="text/css">
</head>
<body>
	<img src="images/2.jpg" width="100%"  height="200">
	<hr>
	<table border="1" width="100%">
		<%@ include file="inc/logout.jsp"%>
		<tr>
			<%@ include file="inc/left_menu.jsp"%>
			<td><html:form action="/jfreeChartPath">
					<table align="center">
						<tr>
							<td>Year:</td>
							<td><html:select property="year">
									<html:option value="0">Select</html:option>
									<html:option value="2021">2021</html:option>
									<html:option value="2022">2022</html:option>
									<html:option value="2023">2023</html:option>
									<html:option value="2024">2024</html:option>
								</html:select>
							</td>
						</tr>
						<tr>
							<td>Ticket Center:</td>
							<td><html:select property="ticket">
									<html:option value="0">Select</html:option>
									<html:option value="GIC">GIC</html:option>
									<html:option value="JICA">JICA</html:option>
									<html:option value="Columbus">Columbus</html:option>
								</html:select></td>
						</tr>
						<tr>
							<td>Chart Type:</td>
							<td><html:select property="chart">
									<html:option value="0">Select </html:option>
									<html:option value="1">Bar Chart</html:option>
									<html:option value="2">Pie Chart</html:option>
									<html:option value="3">Line Chart</html:option>
								</html:select> <html:errors property="charterror" /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><html:submit
									property="btnSend" value="Show"></html:submit> <html:submit
									property="btnCancel" value="Cancel"></html:submit>
							</td>
						</tr>
						<tr>
							<td><html:errors property="chartError" /> <html:errors
									property="listerror" />
							</td>
						<tr>
							
					
					</table>
					
					<table align="center"><tr><td>
					<c:if test="${JFreeChartFormBean.frmControl==1}">
						<img src="images/BarChartServlet.png" height="300"
						width="500" />					
					</c:if>
					
					<c:if test="${JFreeChartFormBean.frmControl==2}">
						<img src="images/PieChart.png" height="300"
						width="300"/>
					</c:if>
					<c:if test="${JFreeChartFormBean.frmControl==3}">
						<img src="images/LineChart.png" height="300"
						width="300"/>
					</c:if>
					</td></tr>
					</table>
					
				</html:form></td>
		</tr>
	</table>
	<%@ include file="inc/footer.jsp"%>
</body>
</html>