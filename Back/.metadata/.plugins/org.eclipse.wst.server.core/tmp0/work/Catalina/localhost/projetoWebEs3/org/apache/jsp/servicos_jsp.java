/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.22
 * Generated at: 2022-06-22 22:45:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.List;
import model.Servico;

public final class servicos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("model.Servico");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>SPL - Serviços</title>\r\n");
      out.write("   \r\n");
      out.write("   	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.2/examples/sidebars/\">\r\n");
      out.write("    <link href=\"../assets/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("      .bd-placeholder-img {\r\n");
      out.write("        font-size: 1.125rem;\r\n");
      out.write("        text-anchor: middle;\r\n");
      out.write("        -webkit-user-select: none;\r\n");
      out.write("        -moz-user-select: none;\r\n");
      out.write("        user-select: none;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      @media (min-width: 768px) {\r\n");
      out.write("        .bd-placeholder-img-lg {\r\n");
      out.write("          font-size: 3.5rem;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .b-example-divider {\r\n");
      out.write("        height: 3rem;\r\n");
      out.write("        background-color: rgba(0, 0, 0, .1);\r\n");
      out.write("        border: solid rgba(0, 0, 0, .15);\r\n");
      out.write("        border-width: 1px 0;\r\n");
      out.write("        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .b-example-vr {\r\n");
      out.write("        flex-shrink: 0;\r\n");
      out.write("        width: 1.5rem;\r\n");
      out.write("        height: 100vh;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .bi {\r\n");
      out.write("        vertical-align: -.125em;\r\n");
      out.write("        fill: currentColor;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .nav-scroller {\r\n");
      out.write("        position: relative;\r\n");
      out.write("        z-index: 2;\r\n");
      out.write("        height: 2.75rem;\r\n");
      out.write("        overflow-y: hidden;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .nav-scroller .nav {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        flex-wrap: nowrap;\r\n");
      out.write("        padding-bottom: 1rem;\r\n");
      out.write("        margin-top: -1px;\r\n");
      out.write("        overflow-x: auto;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        white-space: nowrap;\r\n");
      out.write("        -webkit-overflow-scrolling: touch;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"sidebars.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    ");
 List<Servico> servicos = (List<Servico>) request.getAttribute("servicos"); 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <svg xmlns=\"http://www.w3.org/2000/svg\" style=\"display: none;\">\r\n");
      out.write("        <symbol id=\"home\" viewBox=\"0 0 16 16\">\r\n");
      out.write("            <path d=\"M8.354 1.146a.5.5 0 0 0-.708 0l-6 6A.5.5 0 0 0 1.5 7.5v7a.5.5 0 0 0 .5.5h4.5a.5.5 0 0 0 .5-.5v-4h2v4a.5.5 0 0 0 .5.5H14a.5.5 0 0 0 .5-.5v-7a.5.5 0 0 0-.146-.354L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.354 1.146zM2.5 14V7.707l5.5-5.5 5.5 5.5V14H10v-4a.5.5 0 0 0-.5-.5h-3a.5.5 0 0 0-.5.5v4H2.5z\"/>\r\n");
      out.write("        </symbol>\r\n");
      out.write("        <symbol id=\"update\" viewbox=\"0 0 24 24\">\r\n");
      out.write("          <path d=\"M 18.414062 2 C 18.158062 2 17.902031 2.0979687 17.707031 2.2929688 L 15.707031 4.2929688 L 14.292969 5.7070312 L 3 17 L 3 21 L 7 21 L 21.707031 6.2929688 C 22.098031 5.9019687 22.098031 5.2689063 21.707031 4.8789062 L 19.121094 2.2929688 C 18.926094 2.0979687 18.670063 2 18.414062 2 z M 18.414062 4.4140625 L 19.585938 5.5859375 L 18.292969 6.8789062 L 17.121094 5.7070312 L 18.414062 4.4140625 z M 15.707031 7.1210938 L 16.878906 8.2929688 L 6.171875 19 L 5 19 L 5 17.828125 L 15.707031 7.1210938 z\"></path>\r\n");
      out.write("        </symbol>\r\n");
      out.write("        <symbol id=\"delete\" viewbox=\"0 0 24 24\">\r\n");
      out.write("          <path d=\"M 10 2 L 9 3 L 3 3 L 3 5 L 4.109375 5 L 5.8925781 20.255859 L 5.8925781 20.263672 C 6.023602 21.250335 6.8803207 22 7.875 22 L 16.123047 22 C 17.117726 22 17.974445 21.250322 18.105469 20.263672 L 18.107422 20.255859 L 19.890625 5 L 21 5 L 21 3 L 15 3 L 14 2 L 10 2 z M 6.125 5 L 17.875 5 L 16.123047 20 L 7.875 20 L 6.125 5 z\"></path>\r\n");
      out.write("        </symbol>\r\n");
      out.write("        <symbol id=\"new\" viewBox=\"0 0 24 24\">\r\n");
      out.write("            <path d=\"M12,2C6.477,2,2,6.477,2,12s4.477,10,10,10s10-4.477,10-10S17.523,2,12,2z M17,13h-4v4h-2v-4H7v-2h4V7h2v4h4V13z\"/>\r\n");
      out.write("        </symbol>\r\n");
      out.write("        <symbol id=\"speedometer2\" viewBox=\"0 0 16 16\">\r\n");
      out.write("            <path d=\"M8 4a.5.5 0 0 1 .5.5V6a.5.5 0 0 1-1 0V4.5A.5.5 0 0 1 8 4zM3.732 5.732a.5.5 0 0 1 .707 0l.915.914a.5.5 0 1 1-.708.708l-.914-.915a.5.5 0 0 1 0-.707zM2 10a.5.5 0 0 1 .5-.5h1.586a.5.5 0 0 1 0 1H2.5A.5.5 0 0 1 2 10zm9.5 0a.5.5 0 0 1 .5-.5h1.5a.5.5 0 0 1 0 1H12a.5.5 0 0 1-.5-.5zm.754-4.246a.389.389 0 0 0-.527-.02L7.547 9.31a.91.91 0 1 0 1.302 1.258l3.434-4.297a.389.389 0 0 0-.029-.518z\"/>\r\n");
      out.write("            <path fill-rule=\"evenodd\" d=\"M0 10a8 8 0 1 1 15.547 2.661c-.442 1.253-1.845 1.602-2.932 1.25C11.309 13.488 9.475 13 8 13c-1.474 0-3.31.488-4.615.911-1.087.352-2.49.003-2.932-1.25A7.988 7.988 0 0 1 0 10zm8-7a7 7 0 0 0-6.603 9.329c.203.575.923.876 1.68.63C4.397 12.533 6.358 12 8 12s3.604.532 4.923.96c.757.245 1.477-.056 1.68-.631A7 7 0 0 0 8 3z\"/>\r\n");
      out.write("        </symbol>\r\n");
      out.write("        <symbol id=\"table\" viewBox=\"0 0 16 16\">\r\n");
      out.write("            <path d=\"M0 2a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V2zm15 2h-4v3h4V4zm0 4h-4v3h4V8zm0 4h-4v3h3a1 1 0 0 0 1-1v-2zm-5 3v-3H6v3h4zm-5 0v-3H1v2a1 1 0 0 0 1 1h3zm-4-4h4V8H1v3zm0-4h4V4H1v3zm5-3v3h4V4H6zm4 4H6v3h4V8z\"/>\r\n");
      out.write("        </symbol>\r\n");
      out.write("        <symbol id=\"people-circle\" viewBox=\"0 0 16 16\">\r\n");
      out.write("            <path d=\"M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z\"/>\r\n");
      out.write("            <path fill-rule=\"evenodd\" d=\"M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z\"/>\r\n");
      out.write("        </symbol>\r\n");
      out.write("        <symbol id=\"grid\" viewBox=\"0 0 16 16\">\r\n");
      out.write("            <path d=\"M1 2.5A1.5 1.5 0 0 1 2.5 1h3A1.5 1.5 0 0 1 7 2.5v3A1.5 1.5 0 0 1 5.5 7h-3A1.5 1.5 0 0 1 1 5.5v-3zM2.5 2a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3zm6.5.5A1.5 1.5 0 0 1 10.5 1h3A1.5 1.5 0 0 1 15 2.5v3A1.5 1.5 0 0 1 13.5 7h-3A1.5 1.5 0 0 1 9 5.5v-3zm1.5-.5a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3zM1 10.5A1.5 1.5 0 0 1 2.5 9h3A1.5 1.5 0 0 1 7 10.5v3A1.5 1.5 0 0 1 5.5 15h-3A1.5 1.5 0 0 1 1 13.5v-3zm1.5-.5a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3zm6.5.5A1.5 1.5 0 0 1 10.5 9h3a1.5 1.5 0 0 1 1.5 1.5v3a1.5 1.5 0 0 1-1.5 1.5h-3A1.5 1.5 0 0 1 9 13.5v-3zm1.5-.5a.5.5 0 0 0-.5.5v3a.5.5 0 0 0 .5.5h3a.5.5 0 0 0 .5-.5v-3a.5.5 0 0 0-.5-.5h-3z\"/>\r\n");
      out.write("        </symbol>\r\n");
      out.write("    </svg> <!--Icones svg-->\r\n");
      out.write("\r\n");
      out.write("    <main class=\"d-flex flex-nowrap\">\r\n");
      out.write("    \r\n");
      out.write("       <!--menu sidebar principal-->\r\n");
      out.write("        <div class=\"d-flex flex-column flex-shrink-0 p-3 text-white bg-dark\" style=\"width: 280px;\">\r\n");
      out.write("            <a href=\"index.jsp\" class=\"d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none\">\r\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/spl-logotipo-vertical.png\" width=\"192\" height=\"108\">\r\n");
      out.write("            </a>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <ul class=\"nav nav-pills flex-column mb-auto\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a href=\"index.jsp\" class=\"nav-link text-white\" aria-current=\"page\">\r\n");
      out.write("                <svg class=\"bi pe-none me-2\" width=\"16\" height=\"16\"><use xlink:href=\"#home\"/></svg>\r\n");
      out.write("                Início\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"CarregarServicos\" class=\"nav-link active text-white\">\r\n");
      out.write("                <svg class=\"bi pe-none me-2\" width=\"16\" height=\"16\"><use xlink:href=\"#table\"/></svg>\r\n");
      out.write("                Serviços\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"CarregarProdutos\" class=\"nav-link text-white\">\r\n");
      out.write("                <svg class=\"bi pe-none me-2\" width=\"16\" height=\"16\"><use xlink:href=\"#grid\"/></svg>\r\n");
      out.write("                Produtos\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"CarregarFornecedores\" class=\"nav-link text-white\">\r\n");
      out.write("                <svg class=\"bi pe-none me-2\" width=\"16\" height=\"16\"><use xlink:href=\"#people-circle\"/></svg>\r\n");
      out.write("                Fornecedores\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <div class=\"dropdown\">\r\n");
      out.write("                <a href=\"#\" class=\"d-flex align-items-center text-white text-decoration-none dropdown-toggle\" id=\"dropdownUser1\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/user.png\" alt=\"\" width=\"32\" height=\"32\" class=\"rounded-circle me-2\">\r\n");
      out.write("                    <strong>User test</strong>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu dropdown-menu-dark text-small shadow\" aria-labelledby=\"dropdownUser1\">\r\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#logoutModal\">Sign out</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"b-example-divider b-example-vr\"></div> <!--divisória-->\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		<hr class=\"text-danger border-2 opacity-50\">\r\n");
      out.write("		\r\n");
      out.write("        <!--tabela de itens-->     \r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          	<div class=\"row justify-content-center\">\r\n");
      out.write("          		<div class=\"col-auto\">\r\n");
      out.write("          			<h1 class=\"display-1 text-center fw-semibold\">Serviços</h1>\r\n");
      out.write("          		</div>  	         		\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-auto\">	\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-success btn-sm\" data-bs-toggle=\"modal\" data-bs-target=\"#modalServico\">\r\n");
      out.write("                  			<svg class=\"bi  mt-1\" width=\"42\" height=\"42\"><use xlink:href=\"#new\"/></svg>\r\n");
      out.write("               		</button>\r\n");
      out.write("          		</div>\r\n");
      out.write("          	</div> \r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<table class=\"table\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th scope=\"col\" class=\"text-center\">Código</th>\r\n");
      out.write("                <th scope=\"col\" class=\"text-center\">Nome</th>\r\n");
      out.write("                <th scope=\"col\" class=\"text-center\">Descrição</th>\r\n");
      out.write("                <th scope=\"col\" class=\"text-center\">Preço</th>\r\n");
      out.write("                <th scope=\"col\"></th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("              ");
if(servicos != null){
              		for(Servico servico: servicos){
      out.write("\r\n");
      out.write("              		<form action=\"controller\" method=post>\r\n");
      out.write("              			<tr>\r\n");
      out.write("              				<td class=\"text-center fw-semibold fs-5 align-middle\">\r\n");
      out.write("              					");
      out.print(servico.getId());
      out.write("\r\n");
      out.write("              				</td>\r\n");
      out.write("              				<td>\r\n");
      out.write("              					<input class=\"form-control mt-2\" type=\"text\" id=\"nomeServico\"\r\n");
      out.write("              						name=\"nomeServico\" value=\"");
      out.print(servico.getNome());
      out.write("\"/>\r\n");
      out.write("              				</td>\r\n");
      out.write("              				<td>\r\n");
      out.write("              					<input class=\"form-control mt-2\" type=\"text\" id=\"descricaoServico\"\r\n");
      out.write("              						name=\"descricaoServico\" value=\"");
      out.print(servico.getDescricao());
      out.write("\"/>\r\n");
      out.write("              				</td>\r\n");
      out.write("              				<td>\r\n");
      out.write("              					<input class=\"form-control mt-2\" type=\"text\" id=\"precoServico\"\r\n");
      out.write("              						name=\"precoServico\" value=\"");
      out.print(servico.getPreco());
      out.write("\"/>\r\n");
      out.write("              				</td>              \r\n");
      out.write("              				<td>\r\n");
      out.write("              					<input type=\"hidden\" name=\"acao\" value=\"Alterar\"/>\r\n");
      out.write("              					<input type=\"hidden\" name=\"idServico\" value=\"");
      out.print(servico.getId());
      out.write("\"/>\r\n");
      out.write("                        		<input type=\"hidden\" name=\"viewHelper\" value=\"ServicoVH\"/>                       \r\n");
      out.write("                				<button type=\"submit\" class=\"btn btn-warning\" title=\"Alterar\">\r\n");
      out.write("                  					<svg class=\"bi pe-none\" width=\"25\" height=\"25\"><use xlink:href=\"#update\"/></svg>\r\n");
      out.write("                				</button>               		\r\n");
      out.write("                				<a class=\"btn btn-danger\" href=\"/projetoWebEs3/controller?acao=Excluir&viewHelper=ServicoVH&idServico=");
      out.print(servico.getId());
      out.write("\" title=\"Excluir\">\r\n");
      out.write("                  					<svg class=\"bi pe-none\" width=\"25\" height=\"25\"><use xlink:href=\"#delete\"/></svg>\r\n");
      out.write("                				</a>\r\n");
      out.write("              				</td>              	\r\n");
      out.write("              			</tr>\r\n");
      out.write("					</form>\r\n");
      out.write("              ");
}
              }
      out.write("\r\n");
      out.write("           	 </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("		</div>         \r\n");
      out.write("       </div> \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </main>\r\n");
      out.write("    \r\n");
      out.write("    	<!-- Modal de cadastro -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"modalServico\" tabindex=\"-1\" aria-labelledby=\"modalServico\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Cadastrar Serviço</h5>\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <form class=\"needs-validation\" action=\"controller\" method=\"post\">\r\n");
      out.write("                    	<div class=\"modal-body\">\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label for=\"nomeServico\" class=\"form-label\">Nome do Serviço</label> \r\n");
      out.write("								<input type=\"text\" class=\"form-control\" id=\"nomeServico\" name=\"nomeServico\" required>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<div class=\"mb-3\">\r\n");
      out.write("  									<label for=\"descricaoServico\" class=\"form-label\">Descrição</label>\r\n");
      out.write("  									<textarea class=\"form-control\" id=\"descricaoServico\" rows=\"3\" name=\"descricaoServico\"></textarea>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"mb-3\">\r\n");
      out.write("								<label for=\"precoServico\" class=\"form-label\">Preço</label> \r\n");
      out.write("								<input type=\"text\" class=\"form-control\" id=\"precoServico\" name=\"precoServico\">\r\n");
      out.write("							</div>\r\n");
      out.write("						\r\n");
      out.write("						</div>\r\n");
      out.write("                    	<div class=\"modal-footer\">\r\n");
      out.write("                        	<button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                        	\r\n");
      out.write("                        	<input type=\"hidden\" name=\"acao\" value=\"Salvar\"/>\r\n");
      out.write("                        	<input type=\"hidden\" name=\"viewHelper\" value=\"ServicoVH\"/>\r\n");
      out.write("                        	<button type=\"submit\" class=\"btn btn-primary\">Cadastrar!</button>\r\n");
      out.write("                        	 \r\n");
      out.write("                    	</div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Logout Modal-->\r\n");
      out.write("	    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("	        aria-hidden=\"true\">\r\n");
      out.write("	        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("	            <div class=\"modal-content\">\r\n");
      out.write("	                <div class=\"modal-header\">\r\n");
      out.write("	                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Deseja Sair?</h5>\r\n");
      out.write("	                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("	                </div>\r\n");
      out.write("	                <div class=\"modal-body\">Selecione \"Logout\" abaixo para encerrar a sessão.</div>\r\n");
      out.write("	                <div class=\"modal-footer\">\r\n");
      out.write("	                    <button class=\"btn btn-secondary\" type=\"button\" data-bs-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("	                    <a class=\"btn btn-primary\" href=\"login.jsp\">Logout</a>\r\n");
      out.write("	                </div>\r\n");
      out.write("	            </div>\r\n");
      out.write("	        </div>\r\n");
      out.write("	    </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    <footer class=\"bg-dark text-center text-lg-start\">\r\n");
      out.write("      <!-- Copyright -->\r\n");
      out.write("      <div class=\"text-center text-white p-3\">\r\n");
      out.write("        © 2022 Copyright:\r\n");
      out.write("        <a class=\"text-white\" href=\"index.jsp\">SPL System - FATEC MC</a>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- Copyright -->\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"../assets/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"sidebars.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
