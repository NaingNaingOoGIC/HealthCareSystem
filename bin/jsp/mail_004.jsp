<%@ include file="inc/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Frame Mail</title>
<link href="css/library.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h3 align="center">Mail Testing</h3>
	<hr>
	<table border="1" width="100%">
		<%@ include file="inc/logout.jsp"%>
		<tr>
			<%@ include file="inc/left_menu.jsp"%>
			<td><html:form action="/mailPath">
					<table align="center">
						<tr>
							<td>Name:</td>
							<td><html:text property="frmMailName"></html:text>
							<html:errors property="frmMailName"/>
							</td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><html:text property="frmMailAdd"></html:text> <html:errors
									property="frmMailAdd" /></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><html:submit
									property="btnSend" value="Send Mail">
								</html:submit> 
							<html:cancel value="Cancel"></html:cancel>
						</tr>
					</table>
					<font color="green">${MailFormBean.frmMailMessage}</font>
				</html:form></td>
		</tr>
	</table>
</body>
</html>