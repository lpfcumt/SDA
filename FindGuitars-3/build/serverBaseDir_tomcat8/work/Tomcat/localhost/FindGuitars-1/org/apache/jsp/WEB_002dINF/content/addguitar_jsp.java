/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-05-30 12:14:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addguitar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/Desktop/gradle-2.11/caches/modules-2/files-2.1/org.apache.struts/struts2-core/2.5.1/4d896f8f509990d9da198423e56c36de0d1c03b6/struts2-core-2.5.1.jar!/META-INF/struts-tags.tld", Long.valueOf(1465862998000L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.5.1.jar", Long.valueOf(1469095100352L));
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-cache\" />\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("   \r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t<title>添加吉他</title>\r\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/xcConfirm.css\"/>\r\n");
      out.write("\t<script src=\"js/xcConfirm.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t\t.sgBtn{width: 135px; height: 35px; line-height: 35px; margin-left: 10px; margin-top: 10px; text-align: center; background-color: #0095D9; color: #FFFFFF; float: left; border-radius: 5px;}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"addGuitar\" method=\"post\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"col-lg-12\"><h3>添加吉他</h3></div>\r\n");
      out.write("\t\t<div class=\"col-lg-12 \" >\r\n");
      out.write("\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t      <span class=\"input-group-btn\">\r\n");
      out.write("\t\t        <label style=\"width:100px\" class=\"btn btn2 btn-default\" value=\"TYPE\">builder</label>\r\n");
      out.write("\t\t      </span>\r\n");
      out.write("\t\t      <input style=\"width:300px\" name=\"builder\" type=\"text\" class=\"btn1 form-control\" placeholder=\"Search for...\">\r\n");
      out.write("\t\t    </div><!-- /input-group -->\r\n");
      out.write("\t\t</div><!-- /.col-lg-12 -->\r\n");
      out.write("\t    <div class=\"col-lg-12\" >\r\n");
      out.write("\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t      <span class=\"input-group-btn\">\r\n");
      out.write("\t\t        <label style=\"width:100px\"  class=\"btn btn2 btn-default\" type=\"button\">model</label>\r\n");
      out.write("\t\t      </span>\r\n");
      out.write("\t\t      <input style=\"width:300px\" name=\"model\" type=\"text\" class=\" btn1 form-control\" placeholder=\"Search for...\">\r\n");
      out.write("\t\t    </div><!-- /input-group -->\r\n");
      out.write("\t\t</div><!-- /.col-lg-6 -->\r\n");
      out.write("\t\t<div class=\"col-lg-12 \" >\r\n");
      out.write("\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t      <span class=\"input-group-btn\">\r\n");
      out.write("\t\t        <label style=\"width:100px\" class=\"btn btn2 btn-default\" value=\"type\">TYPE</label>\r\n");
      out.write("\t\t      </span>\r\n");
      out.write("\t\t      <input style=\"width:300px\" name=\"type\" type=\"text\" class=\"btn1 form-control\" placeholder=\"Search for...\">\r\n");
      out.write("\t\t    </div><!-- /input-group -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-lg-12 \" >\r\n");
      out.write("\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t      <span class=\"input-group-btn\">\r\n");
      out.write("\t\t        <label style=\"width:100px\" class=\"btn btn2 btn-default\" value=\"TYPE\">numstrings</label>\r\n");
      out.write("\t\t      </span>\r\n");
      out.write("\t\t      <input style=\"width:300px\" name=\"numStrings\" type=\"text\" class=\"btn1 form-control\" placeholder=\"Search for...\">\r\n");
      out.write("\t\t    </div><!-- /input-group -->\r\n");
      out.write("\t\t</div><!-- /.col-lg-6 -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"col-lg-12 \">\r\n");
      out.write("\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t      <span class=\"input-group-btn\">\r\n");
      out.write("\t\t        <label style=\"width:100px\" class=\"btn btn2 btn-default\" value=\"TYPE\">backwood</label>\r\n");
      out.write("\t\t      </span>\r\n");
      out.write("\t\t      <input style=\"width:300px\" name=\"backWood\" type=\"text\" class=\"btn1 form-control\" placeholder=\"Search for...\">\r\n");
      out.write("\t\t    </div><!-- /input-group -->\r\n");
      out.write("\t\t</div><!-- /.col-lg-6 -->\r\n");
      out.write("\t\t<div class=\"col-lg-12 \">\r\n");
      out.write("\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t      <span class=\"input-group-btn\">\r\n");
      out.write("\t\t        <label style=\"width:100px\" class=\"btn btn2 btn-default\" value=\"TYPE\">topwood</label>\r\n");
      out.write("\t\t      </span>\r\n");
      out.write("\t\t      <input style=\"width:300px\" name=\"topWood\" type=\"text\" class=\"btn1 form-control\" placeholder=\"Search for...\">\r\n");
      out.write("\t\t    </div><!-- /input-group -->\r\n");
      out.write("\t\t</div><!-- /.col-lg-6 -->\r\n");
      out.write("\t\t<div class=\"col-lg-12 \">\r\n");
      out.write("\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t      <span class=\"input-group-btn\">\r\n");
      out.write("\t\t        <label style=\"width:100px\" class=\"btn btn2 btn-default\" value=\"TYPE\">price</label>\r\n");
      out.write("\t\t      </span>\r\n");
      out.write("\t\t      <input style=\"width:300px\" name=\"price\" type=\"text\" class=\"btn1 form-control\" placeholder=\"Search for...\">\r\n");
      out.write("\t\t    </div><!-- /input-group -->\r\n");
      out.write("\t\t</div><!-- /.col-lg-6 -->\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div class=\"col-lg-12 \">\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t      <input style=\"width:300px\"  type=\"submit\" class=\"btn-default\"  value=\"添加\">\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t</div><!-- /.col-lg-6 -->\r\n");
      out.write("\t\t<input style=\"width:300px\" id=\"a\" type=\"button\"  value=\"测试\" >\r\n");
      out.write("\t\t<a id=\"a1\" >测试</a>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("<div class=\"\" style=\"height: 768px;\">\r\n");
      out.write("\t\t\t<div class=\"sgBtn\" id=\"btn1\">弹窗1(信息)</div>\r\n");
      out.write("\t\t\t<div class=\"sgBtn\" id=\"btn2\">弹窗2(提示)</div>\r\n");
      out.write("\t\t\t<div class=\"sgBtn\" id=\"btn3\">弹窗3(警告)</div>\r\n");
      out.write("\t\t\t<div class=\"sgBtn\" id=\"btn4\">弹窗4(错误)</div>\r\n");
      out.write("\t\t\t<div class=\"sgBtn\" id=\"btn5\">弹窗5(成功)</div>\r\n");
      out.write("\t\t\t<div class=\"sgBtn\" id=\"btn6\">弹窗6(输入框)</div>\r\n");
      out.write("\t\t\t<div class=\"sgBtn\" id=\"btn7\">弹窗7(自定义)</div>\r\n");
      out.write("\t\t\t<div class=\"sgBtn\" id=\"btn8\">弹窗8(默认)</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#btn1\").click(function(){\r\n");
      out.write("\t\t\t\t\tvar txt=  \"提示文字，提示文字，提示文字，提示文字，提示文字，提示文字\";\r\n");
      out.write("\t\t\t\t\twindow.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.info);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#btn2\").click(function(){\r\n");
      out.write("\t\t\t\t\tvar txt=  \"提示文字，提示文字，提示文字，提示文字，提示文字，提示文字\";\r\n");
      out.write("\t\t\t\t\twindow.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.confirm);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#btn3\").click(function(){\r\n");
      out.write("\t\t\t\t\tvar txt=  \"提示文字，提示文字，提示文字，提示文字，提示文字，提示文字\";\r\n");
      out.write("\t\t\t\t\twindow.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.warning);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#btn4\").click(function(){\r\n");
      out.write("\t\t\t\t\tvar txt=  \"提示文字，提示文字，提示文字，提示文字，提示文字，提示文字\";\r\n");
      out.write("\t\t\t\t\twindow.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.error);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#btn5\").click(function(){\r\n");
      out.write("\t\t\t\t\tvar txt=  \"提示文字，提示文字，提示文字，提示文字，提示文字，提示文字\";\r\n");
      out.write("\t\t\t\t\twindow.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.success);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#btn6\").click(function(){\r\n");
      out.write("\t\t\t\t\tvar txt=  \"请输入\";\r\n");
      out.write("\t\t\t\t\twindow.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.input,{\r\n");
      out.write("\t\t\t\t\t\tonOk:function(v){\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log(v);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#btn7\").click(function(){\r\n");
      out.write("\t\t\t\t\tvar txt=  \"确的要删除该吉他吗？\";\r\n");
      out.write("\t\t\t\t\tvar option = {\r\n");
      out.write("\t\t\t\t\t\ttitle: \"确认删除\",\r\n");
      out.write("\t\t\t\t\t\tbtn: parseInt(\"0011\",2),\r\n");
      out.write("\t\t\t\t\t\tonOk: function(){\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log(\"确认啦\");\r\n");
      out.write("\t\t\t\t\t\t\talert(\"12313\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\twindow.wxc.xcConfirm(txt, \"custom\", option);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(\"#btn8\").click(function(){\r\n");
      out.write("\t\t\t\t\tvar txt=  \"默认\";\r\n");
      out.write("\t\t\t\t\twindow.wxc.xcConfirm(txt);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#a\").click(function(){\r\n");
      out.write("\t\t\t  if(confirm(\"是否继续\")){\r\n");
      out.write("\t\t\t\t  $(\"#a1\").fadeOut(500);\r\n");
      out.write("\t\t\t   }\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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
