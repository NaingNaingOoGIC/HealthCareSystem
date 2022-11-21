<%@ include file="inc/common.jsp"%>
<html>
<head>
<title>Framework file Upload/Download</title>
<link href="css/library.css" rel="stylesheet" type="text/css">
</head>
<body>
<h3 align="center">Framework Home Page</h3>
<hr>
<table border="1" width="100%">
	<%@ include file="inc/logout.jsp"%>
	<tr>
		<%@ include file="inc/left_menu.jsp"%>
		<td>
		<h3 align="center">File Upload/Download</h3>
		<html:form action="/filePath" method="post"
			enctype="multipart/form-data">
			<table align="center">
				<tr>
					<td>Select your file type:</td>
					<td><html:radio property="frmFileType" value="0" />Image Type
					<html:radio property="frmFileType" value="1" />Other File Type</td>
				</tr>
				<tr>
					<td>File</td>
					<td><html:file property="frmUploadFile" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><html:submit
						property="btnUpload" value="Upload" /> <html:submit
						property="btnCancel" value="Cancel" /></td>
				</tr>
			</table>
			<br></br>
			<logic:notEmpty name="FileFormBean" property="frmViewFile">
				<html:img src="${FileFormBean.frmViewFile}" height="100" width="100" />
			</logic:notEmpty>
			<logic:notEmpty property="frmFileList" name="FileFormBean">
				<table border="1" align="center" width="75%">
					<tr>
						<td>File Name</td>
						<td></td>
						<td></td>
					</tr>
					<c:forEach var="i" begin="${FileFormBean.begin}"
						end="${FileFormBean.end}" step="1">
						<tr>
							<td>${FileFormBean.frmFileList[i-1].fileName}</td>
							<td><a
								href="fileDownloadPath.do?frmFileId=${FileFormBean.frmFileList[i-1].id}">
							Download </a></td>
							<td><c:if
								test="${FileFormBean.frmFileList[i-1].fileType==0}">
								<a href="fileViewPath.do?frmFileId=${FileFormBean.frmFileList[i-1].id}">
								View</a>
							</c:if></td>
						</tr>
					</c:forEach>
				</table>
			</logic:notEmpty>
		</html:form></td>
	</tr>
</table>
<%@ include file="inc/footer.jsp"%>
</body>
</html>
