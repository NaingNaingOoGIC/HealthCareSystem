/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-26 09:51:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.Start;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DatePicker_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts-taglib-1.3.8.jar", Long.valueOf(1657812018750L));
    _jspx_dependants.put("jar:file:/D:/Training/J2EE/HealthCareSystem/WEB-INF/lib/struts-taglib-1.3.8.jar!/META-INF/tld/struts-html.tld", Long.valueOf(1172892492000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody;

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
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Date Picker Test</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"icon\" href=\"/HealthCareSystem/Images/hospital-regular.svg\"\r\n");
      out.write("	type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"/HealthCareSystem/js/jquery.timepicker.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"accordion\" id=\"accordionExample\">\r\n");
      out.write("		<div class=\"accordion-item\">\r\n");
      out.write("			<h2 class=\"accordion-header\" id=\"headingOne\">\r\n");
      out.write("				<button class=\"accordion-button\" type=\"button\"\r\n");
      out.write("					data-bs-toggle=\"collapse\" data-bs-target=\"#collapseOne\"\r\n");
      out.write("					aria-expanded=\"true\" aria-controls=\"collapseOne\">\r\n");
      out.write("					Accordion Item #1</button>\r\n");
      out.write("			</h2>\r\n");
      out.write("			<div id=\"collapseOne\" class=\"accordion-collapse collapse show\"\r\n");
      out.write("				aria-labelledby=\"headingOne\" data-bs-parent=\"#accordionExample\">\r\n");
      out.write("				<div class=\"accordion-body\">\r\n");
      out.write("					<strong>This is the first item's accordion body.</strong> It is\r\n");
      out.write("					shown by default, until the collapse plugin adds the appropriate\r\n");
      out.write("					classes that we use to style each element. These classes control\r\n");
      out.write("					the overall appearance, as well as the showing and hiding via CSS\r\n");
      out.write("					transitions. You can modify any of this with custom CSS or\r\n");
      out.write("					overriding our default variables. It's also worth noting that just\r\n");
      out.write("					about any HTML can go within the\r\n");
      out.write("					<code>.accordion-body</code>\r\n");
      out.write("					, though the transition does limit overflow.\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"accordion-item\">\r\n");
      out.write("			<h2 class=\"accordion-header\" id=\"headingTwo\">\r\n");
      out.write("				<button class=\"accordion-button collapsed\" type=\"button\"\r\n");
      out.write("					data-bs-toggle=\"collapse\" data-bs-target=\"#collapseTwo\"\r\n");
      out.write("					aria-expanded=\"false\" aria-controls=\"collapseTwo\">\r\n");
      out.write("					Accordion Item #2</button>\r\n");
      out.write("			</h2>\r\n");
      out.write("			<div id=\"collapseTwo\" class=\"accordion-collapse collapse\"\r\n");
      out.write("				aria-labelledby=\"headingTwo\" data-bs-parent=\"#accordionExample\">\r\n");
      out.write("				<div class=\"accordion-body\">\r\n");
      out.write("					<strong>This is the second item's accordion body.</strong> It is\r\n");
      out.write("					hidden by default, until the collapse plugin adds the appropriate\r\n");
      out.write("					classes that we use to style each element. These classes control\r\n");
      out.write("					the overall appearance, as well as the showing and hiding via CSS\r\n");
      out.write("					transitions. You can modify any of this with custom CSS or\r\n");
      out.write("					overriding our default variables. It's also worth noting that just\r\n");
      out.write("					about any HTML can go within the\r\n");
      out.write("					<code>.accordion-body</code>\r\n");
      out.write("					, though the transition does limit overflow.\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"accordion-item\">\r\n");
      out.write("			<h2 class=\"accordion-header\" id=\"headingThree\">\r\n");
      out.write("				<button class=\"accordion-button collapsed\" type=\"button\"\r\n");
      out.write("					data-bs-toggle=\"collapse\" data-bs-target=\"#collapseThree\"\r\n");
      out.write("					aria-expanded=\"false\" aria-controls=\"collapseThree\">\r\n");
      out.write("					Accordion Item #3</button>\r\n");
      out.write("			</h2>\r\n");
      out.write("			<div id=\"collapseThree\" class=\"accordion-collapse collapse\"\r\n");
      out.write("				aria-labelledby=\"headingThree\" data-bs-parent=\"#accordionExample\">\r\n");
      out.write("				<div class=\"accordion-body\">\r\n");
      out.write("					<strong>This is the third item's accordion body.</strong> It is\r\n");
      out.write("					hidden by default, until the collapse plugin adds the appropriate\r\n");
      out.write("					classes that we use to style each element. These classes control\r\n");
      out.write("					the overall appearance, as well as the showing and hiding via CSS\r\n");
      out.write("					transitions. You can modify any of this with custom CSS or\r\n");
      out.write("					overriding our default variables. It's also worth noting that just\r\n");
      out.write("					about any HTML can go within the\r\n");
      out.write("					<code>.accordion-body</code>\r\n");
      out.write("					, though the transition does limit overflow.\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      if (_jspx_meth_html_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<table id=\"table\" class=\"display\" style=\"width: 100%\">\r\n");
      out.write("		<thead>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>Name</th>\r\n");
      out.write("				<th>Position</th>\r\n");
      out.write("				<th>office</th>\r\n");
      out.write("				<th>Age</th>\r\n");
      out.write("				<th>Start date</th>\r\n");
      out.write("				<th>Salary</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</thead>\r\n");
      out.write("		<tbody>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>System Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>Tiger Nixon</td>\r\n");
      out.write("				<td>Stystem Architect</td>\r\n");
      out.write("				<td>Tyokyo</td>\r\n");
      out.write("				<td>26</td>\r\n");
      out.write("				<td>11.04.2018</td>\r\n");
      out.write("				<td>$2500</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</tbody>\r\n");
      out.write("	</table>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("	<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("	<script src=\"/HealthCareSystem/js/jquery.timepicker.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js\"></script>\r\n");
      out.write("	<script>\r\n");
      out.write("		$(document).ready(function() {\r\n");
      out.write("			$(\"#datepicker1\").datepicker();\r\n");
      out.write("			$(\"#datepicker2\").datepicker({\r\n");
      out.write("				changeMonth : true,\r\n");
      out.write("				changeYear : true,\r\n");
      out.write("			});\r\n");
      out.write("			$(\"#datepicker3\").datepicker({\r\n");
      out.write("				dateFormat : 'yy-mm-dd',\r\n");
      out.write("				changeYear : true,\r\n");
      out.write("				yearRange : '-15:+5',\r\n");
      out.write("			});\r\n");
      out.write("			$(\"#datepicker4\").datepicker({\r\n");
      out.write("				minDate : -1,\r\n");
      out.write("				maxDate : 5,\r\n");
      out.write("			});\r\n");
      out.write("			$(\"#time\").timepicker();\r\n");
      out.write("			$(\"#table\").DataTable();\r\n");
      out.write("		})\r\n");
      out.write("	</script>\r\n");
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

  private boolean _jspx_meth_html_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    boolean _jspx_th_html_005fform_005f0_reused = false;
    try {
      _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fform_005f0.setParent(null);
      // /WEB-INF/jsp/Start/DatePicker.jsp(92,1) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fform_005f0.setAction("/DatePicker");
      int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
      if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("		Simple Date Picker ");
          if (_jspx_meth_html_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("		<br>\r\n");
          out.write("		<br>\r\n");
          out.write("			 Changed month and year ");
          if (_jspx_meth_html_005ftext_005f1(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("		<br>\r\n");
          out.write("		<br>\r\n");
          out.write("		Date Format and Year Range ");
          if (_jspx_meth_html_005ftext_005f2(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("		<br>\r\n");
          out.write("		<br>\r\n");
          out.write("		Max Date and Min Date ");
          if (_jspx_meth_html_005ftext_005f3(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("		<br>\r\n");
          out.write("		<br>\r\n");
          out.write("		");
          if (_jspx_meth_html_005ftext_005f4(_jspx_th_html_005fform_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("	");
          int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005faction.reuse(_jspx_th_html_005fform_005f0);
      _jspx_th_html_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_html_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    boolean _jspx_th_html_005ftext_005f0_reused = false;
    try {
      _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/Start/DatePicker.jsp(93,21) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f0.setProperty("dateOfBirth");
      // /WEB-INF/jsp/Start/DatePicker.jsp(93,21) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f0.setStyleId("datepicker1");
      int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
      if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      _jspx_th_html_005ftext_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ftext_005f0, _jsp_getInstanceManager(), _jspx_th_html_005ftext_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    boolean _jspx_th_html_005ftext_005f1_reused = false;
    try {
      _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/Start/DatePicker.jsp(97,27) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f1.setProperty("dateOfBirth");
      // /WEB-INF/jsp/Start/DatePicker.jsp(97,27) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f1.setStyleId("datepicker2");
      int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
      if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
      _jspx_th_html_005ftext_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ftext_005f1, _jsp_getInstanceManager(), _jspx_th_html_005ftext_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    boolean _jspx_th_html_005ftext_005f2_reused = false;
    try {
      _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/Start/DatePicker.jsp(101,29) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f2.setProperty("dateOfBirth");
      // /WEB-INF/jsp/Start/DatePicker.jsp(101,29) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f2.setStyleId("datepicker3");
      int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
      if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
      _jspx_th_html_005ftext_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ftext_005f2, _jsp_getInstanceManager(), _jspx_th_html_005ftext_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    boolean _jspx_th_html_005ftext_005f3_reused = false;
    try {
      _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/Start/DatePicker.jsp(105,24) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f3.setProperty("dateOfBirth");
      // /WEB-INF/jsp/Start/DatePicker.jsp(105,24) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f3.setStyleId("datepicker4");
      int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
      if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
      _jspx_th_html_005ftext_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ftext_005f3, _jsp_getInstanceManager(), _jspx_th_html_005ftext_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    boolean _jspx_th_html_005ftext_005f4_reused = false;
    try {
      _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
      // /WEB-INF/jsp/Start/DatePicker.jsp(109,2) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f4.setProperty("dateOfBirth");
      // /WEB-INF/jsp/Start/DatePicker.jsp(109,2) name = styleId type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f4.setStyleId("time");
      int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
      if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
      _jspx_th_html_005ftext_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ftext_005f4, _jsp_getInstanceManager(), _jspx_th_html_005ftext_005f4_reused);
    }
    return false;
  }
}