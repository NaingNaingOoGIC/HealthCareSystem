<%@ include file="inc/common.jsp"%>
<html>
<head>
<title>Framework Home Page</title>
<link href="css/library.css" rel="stylesheet" type="text/css">
</head>
<body>
<h3 align="center">Book Detail</h3>
<hr>
<table border="1" width="100%">
	<%@ include file="inc/logout.jsp"%>
	<tr>
		<%@ include file="inc/left_menu.jsp"%>
		<td>
		<h3 align="center">Frame Work Lectures</h3>
		<html:form action="/displayDetailPath">
			<table align="center" border="1">
				<tr>
					<td>Book Name:</td>
					<td>${SearchDisplayFormBean.frmPrjBooksDetail.bookName}
					</td>
				</tr>
				<tr>
					<td>Version:</td>
					<td>${SearchDisplayFormBean.frmPrjBooksDetail.bookVersion}</td>
				</tr>
				<tr>
					<td>Author:</td>
					<td>${SearchDisplayFormBean.frmPrjBooksDetail.bookAuthor}
					</td>
				</tr>
				<tr>
					<td>Publisher:</td>
					<td>
					${SearchDisplayFormBean.frmPrjBooksDetail.bookPublisher}</td>
				</tr>
				<tr>
					<td>Publish Date:</td>
					<td>
					${SearchDisplayFormBean.frmPrjBooksDetail.bookPublishedDate}</td>
				</tr>
				<tr>
					<td>Description:</td>
					<td>
					${SearchDisplayFormBean.frmPrjBooksDetail.bookDescription}</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><html:submit property="btnOk"
						value="OK"></html:submit></td>
				</tr>
			</table>
		</html:form></td>
	</tr>
</table>
<%@ include file="inc/footer.jsp"%>
</body>
</html>