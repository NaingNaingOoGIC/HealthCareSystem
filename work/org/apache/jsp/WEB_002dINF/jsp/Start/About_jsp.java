/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-20 08:18:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.Start;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/jsp/Common/StyleLink.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>About us</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

	request.getSession().setAttribute("link", "about");
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("	<section class=\"mt-2\">\r\n");
      out.write("		<div style=\"text-align: center;\">\r\n");
      out.write("			<h2 class=\"ms-2\">About Us</h2>\r\n");
      out.write("			<p>A concern of Care and Cure Group is the only\r\n");
      out.write("				multi-disciplinary super-specialty tertiary care hospital in\r\n");
      out.write("				Mandalay, confidently providing comprehensive health care with the\r\n");
      out.write("				latest medical, surgical and diagnostic facilities. These services\r\n");
      out.write("				are provided by expert medical professionals, skilled nurses and\r\n");
      out.write("				technologists using state-of-the-art technology.</p>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"ms-2\">\r\n");
      out.write("			<div class=\"intro-main\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("					<!-- Intro Detail -->\r\n");
      out.write("					<div class=\"col-md-8\">\r\n");
      out.write("						<div class=\"ms-2\">\r\n");
      out.write("							<h5 class=\"text-center\">Health Check Ups</h5>\r\n");
      out.write("							<p>Besides providing world class clinical lab services,\r\n");
      out.write("								Labaid Diagnostic Centre houses a pool of doctors of different\r\n");
      out.write("								medical specialty to serve the ailing patients as outpatients.\r\n");
      out.write("								They are all reputed and respected in their medical specialty\r\n");
      out.write("								for outstanding clinical management</p>\r\n");
      out.write("							<ul class=\"row\" style=\"list-style: none;\">\r\n");
      out.write("								<li class=\"col-sm-6\">\r\n");
      out.write("									<h6>\r\n");
      out.write("										<i class=\"fa-solid fa-circle-check\"></i>EMERGENCY CASE\r\n");
      out.write("									</h6>\r\n");
      out.write("									<p>Excepteur sint occaecat cupidatat non roident, sunt in\r\n");
      out.write("										culpa qui officia deserunt mollit</p>\r\n");
      out.write("								</li>\r\n");
      out.write("								<li class=\"col-sm-6\">\r\n");
      out.write("									<h6>\r\n");
      out.write("										<i class=\"fa-solid fa-circle-check\"></i> QUALIFIED DOCTORS\r\n");
      out.write("									</h6>\r\n");
      out.write("									<p>Excepteur sint occaecat cupidatat non roident, sunt in\r\n");
      out.write("										culpa qui officia deserunt mollit</p>\r\n");
      out.write("								</li>\r\n");
      out.write("								<li class=\"col-sm-6\">\r\n");
      out.write("									<h6>\r\n");
      out.write("										<i class=\"fa-solid fa-circle-check\"></i> ONLINE APPOINTMENT\r\n");
      out.write("									</h6>\r\n");
      out.write("									<p>Excepteur sint occaecat cupidatat non roident, sunt in\r\n");
      out.write("										culpa qui officia deserunt mollit</p>\r\n");
      out.write("								</li>\r\n");
      out.write("								<li class=\"col-sm-6\">\r\n");
      out.write("									<h6>\r\n");
      out.write("										<i class=\"fa-solid fa-circle-check\"></i>FREE MEDICAL\r\n");
      out.write("										COUNSELING\r\n");
      out.write("									</h6>\r\n");
      out.write("									<p>Excepteur sint occaecat cupidatat non roident, sunt in\r\n");
      out.write("										culpa qui officia deserunt mollit</p>\r\n");
      out.write("								</li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<!-- Intro Timing -->\r\n");
      out.write("					<div class=\"col-md-4\">\r\n");
      out.write("						<div class=\"timing\">\r\n");
      out.write("							<i class=\"fa-solid fa-clock\"></i>\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li>Monday <span>7.00 - 21.00</span></li>\r\n");
      out.write("								<li>Tuesday <span>7.00 - 21.00</span></li>\r\n");
      out.write("								<li>Wednesday <span>7.00 - 21.00</span></li>\r\n");
      out.write("								<li>Thursday <span>7.00 - 21.00</span></li>\r\n");
      out.write("								<li>Friday <span>7.00 - 21.00</span></li>\r\n");
      out.write("								<li>Saturday <span>7.00 - 21.00</span></li>\r\n");
      out.write("								<li>Sunday <span>7.00 - 21.00</span></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Heading -->\r\n");
      out.write("		<div class=\"heading-block\">\r\n");
      out.write("			<h2 class=\"heading-block\">Our Services</h2>\r\n");
      out.write("			<hr>\r\n");
      out.write("			<span>Duis autem vel eum iriure dolor in hendrerit n vuew\r\n");
      out.write("				lputate velit esse molestie conseu vel illum dolore eufe ugiat nulla\r\n");
      out.write("				facilisis at vero.</span>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- Services -->\r\n");
      out.write("		<div class=\"services\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-4\">\r\n");
      out.write("					<article>\r\n");
      out.write("						<div class=\"flex\">\r\n");
      out.write("							<div>\r\n");
      out.write("								<i class=\"fa-solid fa-eye icon\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div>\r\n");
      out.write("								<h6>Eye Specialist</h6>\r\n");
      out.write("								<p>Excepteur sint occaecat cupidatat non proident, sunt in\r\n");
      out.write("									culpa qui officia deserunt mollit random text.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</article>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Services -->\r\n");
      out.write("				<div class=\"col-md-4\">\r\n");
      out.write("					<article>\r\n");
      out.write("						<div class=\"flex\">\r\n");
      out.write("							<div>\r\n");
      out.write("								<i class=\"bi bi-scissors icon\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div>\r\n");
      out.write("								<h6>Operation Theater</h6>\r\n");
      out.write("								<p>Excepteur sint occaecat cupidatat non proident, sunt in\r\n");
      out.write("									culpa qui officia deserunt mollit random text.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</article>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Services -->\r\n");
      out.write("				<div class=\"col-md-4\">\r\n");
      out.write("					<article>\r\n");
      out.write("						<div class=\"flex\">\r\n");
      out.write("							<div>\r\n");
      out.write("								<i class=\"bi bi-activity icon\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div>\r\n");
      out.write("								<h6>ICU Department</h6>\r\n");
      out.write("								<p>Excepteur sint occaecat cupidatat non proident, sunt in\r\n");
      out.write("									culpa qui officia deserunt mollit random text.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</article>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Services -->\r\n");
      out.write("				<div class=\"col-md-4\">\r\n");
      out.write("					<article>\r\n");
      out.write("						<div class=\"flex\">\r\n");
      out.write("							<div>\r\n");
      out.write("								<i class=\"bi bi-people icon\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div>\r\n");
      out.write("								<h6>Qualified Doctors</h6>\r\n");
      out.write("								<p>Excepteur sint occaecat cupidatat non proident, sunt in\r\n");
      out.write("									culpa qui officia deserunt mollit random text.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</article>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Services -->\r\n");
      out.write("				<div class=\"col-md-4\">\r\n");
      out.write("					<article>\r\n");
      out.write("						<div class=\"flex\">\r\n");
      out.write("							<div>\r\n");
      out.write("								<i class=\"fa-solid fa-heart-pulse icon\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div>\r\n");
      out.write("								<h6>Heart Problems</h6>\r\n");
      out.write("								<p>Excepteur sint occaecat cupidatat non proident, sunt in\r\n");
      out.write("									culpa qui officia deserunt mollit random text.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</article>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Services -->\r\n");
      out.write("				<div class=\"col-md-4\">\r\n");
      out.write("					<article>\r\n");
      out.write("						<div class=\"flex\">\r\n");
      out.write("							<div>\r\n");
      out.write("								<img src=\"Images/stomach.png\" class=\"icon\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div>\r\n");
      out.write("								<h6>Stomach Problems</h6>\r\n");
      out.write("								<p>Excepteur sint occaecat cupidatat non proident, sunt in\r\n");
      out.write("									culpa qui officia deserunt mollit random text.</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</article>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		console.log(\"hi\");\r\n");
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
}
