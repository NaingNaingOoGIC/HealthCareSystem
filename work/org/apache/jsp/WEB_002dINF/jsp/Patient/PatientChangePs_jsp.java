/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-10-10 04:18:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.Patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PatientChangePs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(11);
    _jspx_dependants.put("jar:file:/D:/Training/J2EE/HealthCareSystem/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-logic.tld", Long.valueOf(1172892492000L));
    _jspx_dependants.put("/WEB-INF/lib/struts-taglib-1.3.8.jar", Long.valueOf(1657812018750L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1657812018744L));
    _jspx_dependants.put("/WEB-INF/jsp/Common/StyleLink.jsp", Long.valueOf(1665242462116L));
    _jspx_dependants.put("/WEB-INF/jsp/Patient/PatientSideBar.jsp", Long.valueOf(1665149010436L));
    _jspx_dependants.put("/WEB-INF/lib/displaytag-1.2.jar", Long.valueOf(1657842206242L));
    _jspx_dependants.put("jar:file:/D:/Training/J2EE/HealthCareSystem/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098687690000L));
    _jspx_dependants.put("jar:file:/D:/Training/J2EE/HealthCareSystem/WEB-INF/lib/displaytag-1.2.jar!/META-INF/displaytag.tld", Long.valueOf(1230365746000L));
    _jspx_dependants.put("/WEB-INF/jsp/Common/TagLib.jsp", Long.valueOf(1663398602553L));
    _jspx_dependants.put("jar:file:/D:/Training/J2EE/HealthCareSystem/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-html.tld", Long.valueOf(1172892492000L));
    _jspx_dependants.put("jar:file:/D:/Training/J2EE/HealthCareSystem/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-bean.tld", Long.valueOf(1172892492000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" href=\"/HealthCareSystem/Images/hospital-regular.svg\"\r\n");
      out.write("	type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/7a6fbe510d.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Patient Change Password</title>\r\n");
      out.write("<style>\r\n");
      out.write("label.error {\r\n");
      out.write("	color: red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".swal-text {\r\n");
      out.write("	background-color: #FEFAE3;\r\n");
      out.write("	padding: 17px;\r\n");
      out.write("	border: 1px solid #F0E1A1;\r\n");
      out.write("	display: block;\r\n");
      out.write("	margin: 22px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	color: #61534e;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".swal-modal {\r\n");
      out.write("	width: 300px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"gradient-skyblue\">\r\n");
      out.write("	<div class=\"container-fluid overflow-hidden\">\r\n");
      out.write("		<div class=\"row vh-100 overflow-auto\">\r\n");
      out.write("			");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" href=\"/HealthCareSystem/Images/hospital-regular.svg\"\r\n");
      out.write("	type=\"image/x-icon\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/7a6fbe510d.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.3/font/bootstrap-icons.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-white\">\r\n");
      out.write("	<div\r\n");
      out.write("		class=\"col-12 col-sm-3 col-xl-2 px-sm-2 px-0 bg-white d-flex sticky-top\">\r\n");
      out.write("		<div\r\n");
      out.write("			class=\"d-flex flex-sm-column flex-row flex-grow-1 align-items-center align-items-sm-start px-3 pt-2 text-white\">\r\n");
      out.write("			<a href=\"#\"\r\n");
      out.write("				class=\"d-flex align-items-center pb-sm-3 mb-md-0 me-md-auto text-black text-decoration-none\">\r\n");
      out.write("				<span class=\"fs-5 d-none d-md-inline text-primary\">Welcome,<br>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PatientForm.loginPatient.patientName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("			</a>\r\n");
      out.write("			<ul\r\n");
      out.write("				class=\"nav nav-pills flex-sm-column flex-row flex-nowrap flex-shrink-1 flex-sm-grow-0 flex-grow-1 mb-sm-auto mb-0 justify-content-center align-items-center align-items-sm-start\"\r\n");
      out.write("				id=\"menu\">\r\n");
      out.write("				<li class=\"nav-item\"><a href=\"PatientHome.do\"\r\n");
      out.write("					class=\"nav-link px-sm-0 px-2\"><i class=\"fa-solid fa-house\"></i><span\r\n");
      out.write("						class=\"ms-1 d-none d-sm-inline\">Home</span></a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a href=\"Progress.do\"\r\n");
      out.write("					class=\"nav-link px-sm-0 px-2\"><i class=\"fa-solid fa-list-check\"></i><span\r\n");
      out.write("						class=\"ms-1 d-none d-sm-inline\">Medical Record</span></a></li>\r\n");
      out.write("				<li><a href=\"Appointment.do\" class=\"nav-link px-sm-0 px-2\"><i\r\n");
      out.write("						class=\"fa-solid fa-calendar-check\"></i><span\r\n");
      out.write("						class=\"ms-1 d-none d-sm-inline\">Appointment</span> </a></li>\r\n");
      out.write("				<li><a href=\"PatientSearchDoctor.do\"\r\n");
      out.write("					class=\"nav-link px-sm-0 px-2\"><i\r\n");
      out.write("						class=\"fa-solid fa-user-doctor\"></i><span\r\n");
      out.write("						class=\"ms-1 d-none d-sm-inline\">Search Doctor</span> </a></li>\r\n");
      out.write("				<li class=\"dropdown\"><a href=\"#\"\r\n");
      out.write("					class=\"nav-link dropdown-toggle px-sm-0 px-1\" id=\"dropdown\"\r\n");
      out.write("					data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> <i\r\n");
      out.write("						class=\"fa-solid fa-user-tie\"></i><span\r\n");
      out.write("						class=\"ms-1 d-none d-sm-inline\">Profile</span>\r\n");
      out.write("				</a>\r\n");
      out.write("					<ul class=\"dropdown-menu dropdown-menu-dark text-small shadow\"\r\n");
      out.write("						aria-labelledby=\"dropdown\">\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"PatientProfile.do\">Your\r\n");
      out.write("								Profile</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"PatientChangePs.do\">Change\r\n");
      out.write("								Password</a></li>\r\n");
      out.write("						<li>\r\n");
      out.write("							<hr class=\"dropdown-divider\">\r\n");
      out.write("						</li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"logout.do\"><i\r\n");
      out.write("								class=\"fa-solid fa-arrow-right-from-bracket\"></i>Logout</a></li>\r\n");
      out.write("					</ul></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("			<div class=\"col d-flex flex-column h-sm-100 gradient-skyblue\">\r\n");
      out.write("				<main class=\"row overflow-auto\">\r\n");
      out.write("					<div class=\"col pt-4 text-center\">\r\n");
      out.write("						<h2 class=\"text-center mt-3\">Change Password</h2>\r\n");
      out.write("						<hr>\r\n");
      out.write("						");
      //  html:form
      org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.get(org.apache.struts.taglib.html.FormTag.class);
      boolean _jspx_th_html_005fform_005f0_reused = false;
      try {
        _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
        _jspx_th_html_005fform_005f0.setParent(null);
        // /WEB-INF/jsp/Patient/PatientChangePs.jsp(39,6) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_html_005fform_005f0.setAction("/PatientChangePs");
        // /WEB-INF/jsp/Patient/PatientChangePs.jsp(39,6) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_html_005fform_005f0.setStyleId("myForm");
        int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
        if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("							");

							String showalert = "notshow";
							
            out.write("\r\n");
            out.write("							");
            //  logic:equal
            org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
            boolean _jspx_th_logic_005fequal_005f0_reused = false;
            try {
              _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
              // /WEB-INF/jsp/Patient/PatientChangePs.jsp(43,7) name = name type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f0.setName("PatientChangePsForm");
              // /WEB-INF/jsp/Patient/PatientChangePs.jsp(43,7) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f0.setProperty("changePs");
              // /WEB-INF/jsp/Patient/PatientChangePs.jsp(43,7) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_logic_005fequal_005f0.setValue("true");
              int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
              if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("								");

								showalert = "show";
								
                  out.write("\r\n");
                  out.write("							");
                  int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
              _jspx_th_logic_005fequal_005f0_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_logic_005fequal_005f0, _jsp_getInstanceManager(), _jspx_th_logic_005fequal_005f0_reused);
            }
            out.write("\r\n");
            out.write("							<div id=\"successPs\" hidden=");
            out.print(showalert);
            out.write("></div>\r\n");
            out.write("							<div class=\"row mb-2 mt-md-2\">\r\n");
            out.write("\r\n");
            out.write("								<label class=\"offset-md-3 form-label col-md-2\"><span\r\n");
            out.write("									class=\"h5\">Current Password </span><span class=\"text-danger\">*</span></label>\r\n");
            out.write("								<div class=\"col-md-3\">\r\n");
            out.write("									");
            if (_jspx_meth_html_005ferrors_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("									");
            if (_jspx_meth_html_005fpassword_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("								</div>\r\n");
            out.write("							</div>\r\n");
            out.write("							<div class=\"row mb-2 mt-md-2\">\r\n");
            out.write("								<label class=\"offset-md-3 form-label col-md-2\"><span\r\n");
            out.write("									class=\"h5\">New Password </span><span class=\"text-danger\">*</span></label>\r\n");
            out.write("								<div class=\"col-md-3\">\r\n");
            out.write("									");
            if (_jspx_meth_html_005fpassword_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("								</div>\r\n");
            out.write("							</div>\r\n");
            out.write("							<div class=\"row mb-2 mt-md-2\">\r\n");
            out.write("								<label class=\"offset-md-3 form-label col-md-2\"><span\r\n");
            out.write("									class=\"h5\">Confirm Password </span><span class=\"text-danger\">*</span></label>\r\n");
            out.write("								<div class=\"col-md-3\">\r\n");
            out.write("									");
            if (_jspx_meth_html_005fpassword_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
              return;
            out.write("\r\n");
            out.write("								</div>\r\n");
            out.write("							</div>\r\n");
            out.write("							<button name=\"submit\" type=\"submit\"\r\n");
            out.write("								class=\"mb-3 btn btn-outline-primary\">Save</button>\r\n");
            out.write("						");
            int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fhtml_005fform_0026_005fstyleId_005faction.reuse(_jspx_th_html_005fform_005f0);
        _jspx_th_html_005fform_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_html_005fform_005f0_reused);
      }
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</main>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js\"></script>\r\n");
      out.write("	<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("	<script src=\"/HealthCareSystem/js/ChangePs.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_005ferrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_005ferrors_005f0 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    boolean _jspx_th_html_005ferrors_005f0_reused = false;
    try {
      _jspx_th_html_005ferrors_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/Patient/PatientChangePs.jsp(55,9) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ferrors_005f0.setProperty("wrongPassword");
      int _jspx_eval_html_005ferrors_005f0 = _jspx_th_html_005ferrors_005f0.doStartTag();
      if (_jspx_th_html_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
      _jspx_th_html_005ferrors_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ferrors_005f0, _jsp_getInstanceManager(), _jspx_th_html_005ferrors_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_005fpassword_005f0 = (org.apache.struts.taglib.html.PasswordTag) _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    boolean _jspx_th_html_005fpassword_005f0_reused = false;
    try {
      _jspx_th_html_005fpassword_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/Patient/PatientChangePs.jsp(56,9) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f0.setProperty("password");
      // /WEB-INF/jsp/Patient/PatientChangePs.jsp(56,9) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f0.setStyleClass("form-control");
      // /WEB-INF/jsp/Patient/PatientChangePs.jsp(56,9) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f0.setStyleId("currentPs");
      int _jspx_eval_html_005fpassword_005f0 = _jspx_th_html_005fpassword_005f0.doStartTag();
      if (_jspx_th_html_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_html_005fpassword_005f0);
      _jspx_th_html_005fpassword_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005fpassword_005f0, _jsp_getInstanceManager(), _jspx_th_html_005fpassword_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005fpassword_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_005fpassword_005f1 = (org.apache.struts.taglib.html.PasswordTag) _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    boolean _jspx_th_html_005fpassword_005f1_reused = false;
    try {
      _jspx_th_html_005fpassword_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005fpassword_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/Patient/PatientChangePs.jsp(64,9) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f1.setProperty("newPassword");
      // /WEB-INF/jsp/Patient/PatientChangePs.jsp(64,9) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f1.setStyleClass("form-control");
      // /WEB-INF/jsp/Patient/PatientChangePs.jsp(64,9) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f1.setStyleId("newPs");
      int _jspx_eval_html_005fpassword_005f1 = _jspx_th_html_005fpassword_005f1.doStartTag();
      if (_jspx_th_html_005fpassword_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_html_005fpassword_005f1);
      _jspx_th_html_005fpassword_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005fpassword_005f1, _jsp_getInstanceManager(), _jspx_th_html_005fpassword_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005fpassword_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_005fpassword_005f2 = (org.apache.struts.taglib.html.PasswordTag) _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    boolean _jspx_th_html_005fpassword_005f2_reused = false;
    try {
      _jspx_th_html_005fpassword_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005fpassword_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/Patient/PatientChangePs.jsp(72,9) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f2.setProperty("confirmPassword");
      // /WEB-INF/jsp/Patient/PatientChangePs.jsp(72,9) name = styleClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f2.setStyleClass("form-control");
      // /WEB-INF/jsp/Patient/PatientChangePs.jsp(72,9) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fpassword_005f2.setStyleId("confirmPs");
      int _jspx_eval_html_005fpassword_005f2 = _jspx_th_html_005fpassword_005f2.doStartTag();
      if (_jspx_th_html_005fpassword_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005fpassword_0026_005fstyleId_005fstyleClass_005fproperty_005fnobody.reuse(_jspx_th_html_005fpassword_005f2);
      _jspx_th_html_005fpassword_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005fpassword_005f2, _jsp_getInstanceManager(), _jspx_th_html_005fpassword_005f2_reused);
    }
    return false;
  }
}
