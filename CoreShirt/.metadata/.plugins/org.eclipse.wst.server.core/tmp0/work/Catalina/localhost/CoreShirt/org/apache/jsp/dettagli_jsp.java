/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2016-12-22 09:09:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.Articolo;
import model.Cart;

public final class dettagli_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/PopUp.jsp", Long.valueOf(1482395565425L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Articolo");
    _jspx_imports_classes.add("model.Cart");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 Collection<?> products = (Collection<?>) request.getAttribute("products");
   Articolo product = (Articolo) request.getAttribute("product"); 
   Cart cart = (Cart) request.getAttribute("cart");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" lang=\"it\">\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"icon\" href=\"./Immagini/sprite0.png\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./CSS/base.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./CSS/Dettagli.css\" type=\"text/css\">\r\n");
      out.write("    <script src=\"Script/jquery.js\"></script>\r\n");
      out.write("    <script src=\"Script/control.js\"></script>\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"Content-Language\" content=\"it-IT\" />\r\n");
      out.write("    <meta name=\"description\" content=\"Il miglior sito dove acquistare T-Shirt  per qualsiasi gusto e necessità, con un'ampia scelta di modelli aggiornati periodicamente con i migliori design della rete.\" />\r\n");
      out.write("    <meta name=\"keywords\" content=\"T-shirt, magliette, maglietta, nerd, cinema, divertenti, geek, core, series, best\" />\r\n");
      out.write("    <title>Core Shirt: The Best T-Shirts series</title>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    function ParseQueryString() {\r\n");
      out.write("        var result =0;\r\n");
      out.write("        var strQS = window.location.href;\r\n");
      out.write("        var index = strQS.indexOf(\"?\");\r\n");
      out.write("        if (index > 0) {\r\n");
      out.write("            var temp = strQS.split(\"?\");\r\n");
      out.write("            var arrData = temp[1].split(\"&\");\r\n");
      out.write("            var x=\"aa\"+arrData+\"aa\";\r\n");
      out.write("            if(x === \"aaaa\")\r\n");
      out.write("            \treturn \"1\";\r\n");
      out.write("        }\r\n");
      out.write("        return result;\r\n");
      out.write("    }\r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("        \tvar QS = ParseQueryString();\r\n");
      out.write("            if (QS === \"1\") {\r\n");
      out.write("            \t$(\"#popup\").show();\r\n");
      out.write("            \t$(\"#veil\").fadeIn();\r\n");
      out.write("            \tsetTimeout(function(){$(\"#popup\").fadeOut();$(\"#veil\").fadeOut();}, 2000);\r\n");
      out.write("            }\r\n");
      out.write("            else{\r\n");
      out.write("        \t$(\"#popup\").hide();}\r\n");
      out.write("        })\r\n");
      out.write("        function changeColor(color)\r\n");
      out.write("        {\r\n");
      out.write("            var styl=document.styleSheets[1]\r\n");
      out.write("            var rules=styl.cssRules? styl.cssRules: styl.rules\r\n");
      out.write("            for (i=0; i<rules.length; i++){\r\n");
      out.write("            if(rules[i].selectorText.toLowerCase()==\".maglia\"){\r\n");
      out.write("                rules[i].style.backgroundColor=color\r\n");
      out.write("                break;\r\n");
      out.write("                }\r\n");
      out.write("            }   \r\n");
      out.write("        }\r\n");
      out.write("        function show(){\r\n");
      out.write("        \t$(\"#popup\").hide();\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"veil\">\r\n");
      out.write("<div id=\"popup\">\r\n");
      out.write("  <div class=\"Messaggio\">\r\n");
      out.write("    Articolo aggiunto al carrello\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("    <article id=\"articolo1\">\r\n");
      out.write("    <div id=\"lista\">\r\n");
      out.write("    <a href=\"./\"><div id=\"banner\"> <img class=\"Banner\" src=\"Immagini/prova.png\"> \r\n");
      out.write("          <img class=\"core\" src=\"Immagini/core2.png\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div>\r\n");
      out.write("    <nav>    \r\n");
      out.write("        <ul id=\"menu\">\r\n");
      out.write("            <li><a href=\"./\"><img class=\"home\" src=\"Immagini/home.png\"></a> </li>\r\n");
      out.write("            <li><a href=\"./?action=Uomo\"> Uomo </a></li>\r\n");
      out.write("            <li><a href=\"./?action=Donna\"> Donna  </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"./About\">About</a></li>\r\n");
      out.write("            <li><a href=\"./Help\">Help</a></li>   \r\n");
      out.write("            <li><a href=\"./Checkout\">Checkout</a></li>\r\n");
      out.write("            <li><a href=\"./?action=cart\">\r\n");
      out.write("                <img class=\"cart\" src=\"Immagini/cart.png\"></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </article>\r\n");
      out.write("    <!-- </div>-->\r\n");
      out.write("         <article>\r\n");
      out.write("    <aside id=\"aside_bar\">\r\n");
      out.write("        <span> <img src=\"Immagini/spedizione.png\"> \r\n");
      out.write("            <div class=\"promesse\">\r\n");
      out.write("                Spedizione gratuita dopo i 3 articoli</div></span>\r\n");
      out.write("        <span class=\"48h\"><img src=\"Immagini/48h.png\">\r\n");
      out.write("            <div class=\"promesse\">Spedizione in 48 ore con corriere espresso</div>\r\n");
      out.write("        </span>\r\n");
      out.write("        \r\n");
      out.write("            <!--<div class=\"spedizione1\">-->\r\n");
      out.write("                \r\n");
      out.write("        <span class=\"48h\"><img src= \"Immagini/Soddisfazione.png\">\r\n");
      out.write("            <div class=\"promesse\">Soddisfatti al 100%</div>\r\n");
      out.write("        </span>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        </aside>\r\n");
      out.write("    \r\n");
      out.write("    </article>\r\n");
      out.write("        <div class=\"container-di-tutto\">\r\n");
      out.write("            <div class=\"maglia\" ><img src=\"Immagini/Magliette/TiziM.png\">\r\n");
      out.write("                <img class=\"design-left\" src=\"./Immagini/Magliette/");
      out.print(product.getidArticolo());
      out.write(".png\">\r\n");
      out.write("                <img class=\"design-right\" src=\"./Immagini/Magliette/");
      out.print(product.getidArticolo());
      out.write(".png\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"scegli-colore\">\r\n");
      out.write("                \r\n");
      out.write("                <form onsubmit=\"return control()\" action=\"./?\" method=\"post\">\r\n");
      out.write("                  <input type=\"hidden\" name=\"action\" value=\"addC\">\r\n");
      out.write("                  <input type=\"hidden\" name=\"id\" value=\"");
      out.print(product.getidArticolo());
      out.write("\">\r\n");
      out.write("                  <input type=\"hidden\" name=\"sesso\" value=\"");
      out.print(product.getSesso());
      out.write("\">\r\n");
      out.write("                 <input type=\"hidden\" name=\"nome\" value=\"");
      out.print(product.getnome());
      out.write("\">\r\n");
      out.write("              <div>\r\n");
      out.write("                 <p class=\"par\">Dettagli</p>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"nome-maglia\">");
      out.print(product.getnome());
      out.write("</div>\r\n");
      out.write("                <div class=\"dettagli\">\r\n");
      out.write("                    <input type=\"radio\" name=\"color\" value=\"black\" class=\"colore\" onclick=\"changeColor('#000000');\">\r\n");
      out.write("                    <label for=\"colore\"><span style=\"background-image : linear-gradient(rgb(22,22,22),rgb(22,22,22));\"><span></span></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("             \r\n");
      out.write("                    <input type=\"radio\" name=\"color\" value=\"grey\" class=\"colore\"\r\n");
      out.write("                           onclick=\"changeColor('#454449');\">\r\n");
      out.write("                    <label for=\"colore\"><span style=\"background-image : linear-gradient(rgb(97,97,97),rgb(97,97,97));\"><span></span></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"color\" value=\"white\" class=\"colore\"\r\n");
      out.write("                           onclick=\"changeColor('#F8F8F8');\">\r\n");
      out.write("                    <label for=\"colore\"><span style=\"background-image : linear-gradient(rgb(250,250,250),rgb(250,250,250));\"><span></span></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"color\" value=\"green\" class=\"colore\"\r\n");
      out.write("                           onclick=\"changeColor('#037302');\">\r\n");
      out.write("                    <label for=\"colore\"><span style=\"background-image : linear-gradient(rgb(7,128,7),rgb(7,128,7));\"><span></span></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"color\" value=\"orange\" class=\"colore\"\r\n");
      out.write("                           onclick=\"changeColor('#F37B1C');\">\r\n");
      out.write("                    <label for=\"colore\"><span style=\"background-image : linear-gradient(rgb(243,131,33),rgb(243,131,33));\"><span></span></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"color\" value=\"red\" class=\"colore\" onclick=\"changeColor('#C21111');\">\r\n");
      out.write("                    <label for=\"colore\"><span style=\"background-image : linear-gradient(rgb(197,17,17),rgb(197,17,17));\"><span></span></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"color\" value='purple' class=\"colore\" onclick=\"changeColor('#665098');\">\r\n");
      out.write("                    <label for=\"colore\"><span style=\"background-image : linear-gradient(rgb(102,80,152),rgb(102,80,152));\"><span></span></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"color\" value=\"blue\" class=\"colore\" onclick=\"changeColor('#0E73DB');\">\r\n");
      out.write("                    <label for=\"colore\"><span style=\"background-image : linear-gradient(rgb(14,115,219),rgb(14,115,219));\"><span></span></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"details\">\r\n");
      out.write("                    <div class=\"descriptor\">Seleziona la taglia:</div>\r\n");
      out.write("                    <input type=\"radio\" name=\"taglia\" value='S' class=\"taglia\">\r\n");
      out.write("                    <label for=\"taglia\"><span style=\"background-image : linear-gradient(rgb(255,250,245),rgb(255,250,245));\"><span></span><p>S</p></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"taglia\" value='M' class=\"taglia\">\r\n");
      out.write("                    <label for=\"taglia\"><span style=\"background-image : linear-gradient(rgb(255,250,245),rgb(255,250,245));\"><span></span><p>M</p></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"taglia\" value='L' class=\"taglia\">\r\n");
      out.write("                    <label for=\"taglia\"><span style=\"background-image : linear-gradient(rgb(255,250,245),rgb(255,250,245));\"><span></span><p>L</p></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"taglia\" value='XL' class=\"taglia\">\r\n");
      out.write("                    <label for=\"taglia\"><span style=\"background-image : linear-gradient(rgb(255,250,245),rgb(255,250,245));\"><span></span><p>XL</p></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"taglia\" value='XXL' class=\"taglia\">\r\n");
      out.write("                    <label for=\"taglia\"><span style=\"background-image : linear-gradient(rgb(255,250,245),rgb(255,250,245));\"><span></span><p>XXL</p></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"taglia\" value='3XL' class=\"taglia\">\r\n");
      out.write("                    <label for=\"taglia\"><span style=\"background-image : linear-gradient(rgb(255,250,245),rgb(255,250,245));\"><span></span><p>3XL</p></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"taglia\" value='4XL' class=\"taglia\">\r\n");
      out.write("                    <label for=\"taglia\"><span style=\"background-image : linear-gradient(rgb(255,250,245),rgb(255,250,245));\"><span></span><p>4XL</p></span> </label>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"radio\" name=\"taglia\" value='5XL' class=\"taglia\">\r\n");
      out.write("                    <label for=\"taglia\"><span style=\"background-image : linear-gradient(rgb(255,250,245),rgb(255,250,245));\"><span></span><p>5XL</p></span> </label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                <div class=\"numpezzi\">\r\n");
      out.write("                    <div> Seleziona la quantità:</div>\r\n");
      out.write("                    <select name=\"quantity\">\r\n");
      out.write("                        <option value=\"1\">1</option>\r\n");
      out.write("                        <option value=\"2\">2</option>\r\n");
      out.write("                        <option value=\"3\">3</option>\r\n");
      out.write("                        <option value=\"4\">4</option>\r\n");
      out.write("                        <option value=\"5\">5</option>\r\n");
      out.write("                        <option value=\"6\">6</option>\r\n");
      out.write("                        <option value=\"7\">7</option>\r\n");
      out.write("                        <option value=\"8\">8</option>\r\n");
      out.write("                        <option value=\"9\">9</option>\r\n");
      out.write("                        <option value=\"10\">10</option>\r\n");
      out.write("                        <option value=\"11\">11</option>\r\n");
      out.write("                        <option value=\"12\">12</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"price\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"prezzo\" value=\"12\" class=\"price-hidden\"><label for=\"price-hidden\">12,00 €</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"submit-button\">\r\n");
      out.write("                    <button class=\"submit\" ><img src=\"Immagini/white-cart.png\"><div>Aggiungi al carrello!</div></button> \r\n");
      out.write("                </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("        <footer>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t\t<h2>I più venduti</h2>\r\n");
      out.write("\t\t\t\t<div class=\"menu-container\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"./?action=uomo\">T-Shirt Uomo</a></li>\r\n");
      out.write("                        <li><a href=\"./?action=donna\">T-Shirt Donna</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\t\t\t\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t<h2>Info</h2>\r\n");
      out.write("\t\t\t\t\t<div class=\"menu-container\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"./About\">About</a></li>\r\n");
      out.write("                        <li><a href=\"./About\">Contattaci</a></li>\r\n");
      out.write("                        <li><a href=\"./Help\">Guida alle taglie</a></li>\r\n");
      out.write("                        <li><a href=\"./Help\">Tariffe Spedizione</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\t\t\t\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t<div class=\"col1\">\r\n");
      out.write("\t\t\t\t<h2>Segui</h2>\r\n");
      out.write("\t\t\t\t<div class=\"menu-container\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a target=\"_blank\" href=\"https://www.facebook.com/\">Facebook</a></li>\r\n");
      out.write("                        <li><a target=\"_blank\" href=\"https://twitter.com/\">Twitter</a></li>\r\n");
      out.write("                        <li><a target=\"_blank\" href=\"https://www.tumblr.com/\">Tumblr</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\t\t\t\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t<div class=\"col2\">\r\n");
      out.write("\t\t\t\t<div class=\"CreditCard\">\r\n");
      out.write("\t\t\t\t<img src=\"Immagini/CreditCard.png\">\r\n");
      out.write("\t\t\t\t\t<div class=\"text\">\r\n");
      out.write("\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t© 2016 Core Shirt S.R.L | P. IVA 01594368721<br>\r\n");
      out.write("\t\t\t\t\t\tAll designs copyright by owner.<br>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\">Privacy Policy</a>\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    </footer>\r\n");
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
