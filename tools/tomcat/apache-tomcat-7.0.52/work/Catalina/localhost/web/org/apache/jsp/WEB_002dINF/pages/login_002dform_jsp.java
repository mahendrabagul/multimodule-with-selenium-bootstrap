/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.52
 * Generated at: 2014-03-24 09:45:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("<title>Log-In Page</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\th1 {\n");
      out.write("\t\tmargin: 30px 0;\n");
      out.write("\t\tpadding: 0 200px 15px 0;\n");
      out.write("\t\tborder-bottom: 1px solid #E5E5E5;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.bs-example {\n");
      out.write("\t\tmargin: 20px;\n");
      out.write("\t}\n");
      out.write("\t \n");
      out.write("\n");
      out.write("\t  .form-signin {\n");
      out.write("\t\tmax-width: 300px;\n");
      out.write("\t\tpadding: 19px 29px 29px;\n");
      out.write("\t\tmargin: 0 auto 20px;\n");
      out.write("\t\tbackground-color: #fff;\n");
      out.write("\t\tborder: 1px solid #e5e5e5;\n");
      out.write("\t\t-webkit-border-radius: 5px;\n");
      out.write("\t\t   -moz-border-radius: 5px;\n");
      out.write("\t\t\t\tborder-radius: 5px;\n");
      out.write("\t\t-webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("\t\t   -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("\t\t\t\tbox-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("\t  }\n");
      out.write("\t  .form-signin .form-signin-heading,\n");
      out.write("\t  .form-signin .checkbox {\n");
      out.write("\t\tmargin-bottom: 10px;\n");
      out.write("\t  }\n");
      out.write("\t  .form-signin input[type=\"text\"],\n");
      out.write("\t  .form-signin input[type=\"password\"] {\n");
      out.write("\t\tfont-size: 16px;\n");
      out.write("\t\theight: auto;\n");
      out.write("\t\tmargin-bottom: 15px;\n");
      out.write("\t\tpadding: 7px 9px;\n");
      out.write("\t  }\n");
      out.write("\t</style>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\" />\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("\t<div class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index.html\" class=\"navbar-brand\">Neova Solution's Base Project</a>\n");
      out.write("\t\t\t<button class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\tdata-target=\".navHeaderCollapse\">\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span> \n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span> \n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse navHeaderCollapse\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Blog</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"dropdown\">Social Media <b class=\"caret\t\"></b></a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Twitter</a> <a href=\"#\">Facebook</a> \n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Google+</a> <a href=\"#\">Instagram</a>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">About</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Contact</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- Error Block -->\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t<!--End of Error Block -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Login Form  -->\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"container\" >\n");
      out.write("\t\t\t<form class=\"form-signin\" method=\"post\" action=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("\t\t\t\t<h2 class=\"form-signin-heading\">Sign-In</h2>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"j_username\" id=\"j_username\" maxlength=\"40\" class=\"input-block-level\" placeholder=\"UserName\">\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"j_password\" id=\"j_password\" class=\"input-block-level\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t<button class=\"btn btn-large btn-primary\" id=\"a-submit\" type=\"submit\" >Sign in</button>\n");
      out.write("\t\t\t\t<button class=\"btn btn-warning\" id=\"reset\" type=\"reset\">Clear</button>\t\t\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div> \n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!-- End of Login Form -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<!--Bottom(Footer) Content -->\n");
      out.write("\n");
      out.write("\t<div class=\"navbar navbar-default navbar-fixed-bottom\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<p class=\"navbar-text pull-left\">Designed by Neova Solution's\n");
      out.write("\t\t\t\tJAVA Team</p>\n");
      out.write("\t\t\t<a href=\"http://www.neovasolutions.com/\"\n");
      out.write("\t\t\t\tclass=\"navbar-btn btn-danger btn pull-right\">Visit To Neova\n");
      out.write("\t\t\t\tSolutions</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- End of Bottom(Footer) Content -->\n");
      out.write("\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/pages/login-form.jsp(85,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error == true}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<div class=\"alert alert-danger alert-dismissable\">\n");
        out.write("\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"alert\" aria-hidden=\"true\">&times;</button>\n");
        out.write("\t\t\t<strong><center>Your Login Attempt was not Successful, Please Try Again.</center>\n");
        out.write("\t\t</div>\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/login-form.jsp(99,51) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("j_spring_security_check");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
