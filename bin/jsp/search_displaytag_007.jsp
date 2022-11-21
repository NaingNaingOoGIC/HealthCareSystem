<%@ include file="inc/common.jsp"%>
<html>
<head>
<title>Book Search by Display Tag</title>
<link href="css/library.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h3 align="center">Book Search by Display Tag</h3>
	<hr>
	<table border="1" width="100%">
		<%@ include file="inc/logout.jsp"%>
		<tr>
			<%@ include file="inc/left_menu.jsp"%>
			<td>
				<h3 align="center">Frame Work Lectures</h3> 
				<html:form	action="/displayPathFirst">
				<% int i=1;%>
					<display:table export="true" id="data" 
						name="sessionScope.SearchDisplayFormBean.frmPrjBooksList"
						pagesize="2" requestURI="/displayPath.do">
						<display:setProperty name="export.pdf" value="true">
						</display:setProperty>
						<display:setProperty name="export.csv.filename"
							value="PrjBook.csv">
						</display:setProperty>
						<display:setProperty name="export.excel.filename"
							value="PrjBook.xls">
						</display:setProperty>
						<display:setProperty name="export.pdf.filename"
							value="PrjBook.pdf">
						</display:setProperty>
						<display:column title="No" sortable="true" value="<%=i++ %>"></display:column>
						<display:column property="bookName" title="Book Name"
							sortable="true" />							
						<display:column property="bookVersion"
							title="Book Ver" sortable="true">
						</display:column>
						
						<display:column title="Detail" paramId="frmDetailBookId"
							paramProperty="id" href="displayDetailPath.do?frmControl=2">
              Detail</display:column>
					</display:table>
				</html:form>
			</td>
		</tr>
	</table>
	<%@ include file="inc/footer.jsp"%>
</body>
</html>
