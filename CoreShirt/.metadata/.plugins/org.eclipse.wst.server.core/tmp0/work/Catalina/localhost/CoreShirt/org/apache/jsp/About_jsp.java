/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2016-12-22 08:39:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import model.Cart;

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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
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
 
   Cart cart = (Cart) request.getAttribute("cart");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" lang=\"it\">\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"icon\" href=\"Immagini/sprite0.png\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/base.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/About.css\" type=\"text/css\">\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"Content-Language\" content=\"it-IT\" />\r\n");
      out.write("    <meta name=\"description\" content=\"Il miglior sito dove acquistare T-Shirt  per qualsiasi gusto e necessità, con un'ampia scelta di modelli aggiornati periodicamente con i migliori design della rete.\" />\r\n");
      out.write("    <meta name=\"keywords\" content=\"T-shirt, magliette, maglietta, nerd, cinema, divertenti, geek, core, series, best\" />\r\n");
      out.write("    <title>Core Shirt: The Best T-Shirts series</title>\r\n");
      out.write("    \r\n");
      out.write("     </head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
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
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"help\">\r\n");
      out.write("        <h1 class=\"about\"> About</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("            <div class=\"answers-column\">\r\n");
      out.write("                 <div class=\"answers\">\r\n");
      out.write("                     <div class=\"titolo\"><h4> Core Shirt nasce nel primo semestre del 2016 dall'ambizione di due amici che diventa realtà. Pasquale e Giorgio si sono conosciuti alle scuole medie e successivamente si sono ritrovati all'Universita. Oggi, capitanano un gruppo di 0 giovani creativi, e hanno diverse filiali nelle loro abitazioni. Il laboratorio di stampa ha sede dal miglior offerente. </div></h4>\r\n");
      out.write("                     <p>\r\n");
      out.write("                     \r\n");
      out.write("                  <div>      \r\n");
      out.write("                  Essenzialmente, stampiamo magliette. In edizione super-iper-mega-stra limitata, al costo di 12 euro.\r\n");
      out.write("                 </div><br />\r\n");
      out.write("                     \r\n");
      out.write("                  <div>\r\n");
      out.write("                  Sei creativo? Non riesci a tenere a bada la tua originilità e vuoi lasciare scorrere la tua immaginazione? Unisciti a noi! Diventerai un creatore di T-shirt e potrai farti conoscere da migliaia di clienti in cerca di abiti unici e originali.\r\n");
      out.write("                 </div><br /><br />\r\n");
      out.write("                     \r\n");
      out.write("                  <div>\r\n");
      out.write("                  Per contattarci scrivere all'indirizzo mail:<br /><br />\r\n");
      out.write("                      CoreShirt.srl@gmail.com\r\n");
      out.write("                     </div>\r\n");
      out.write("                      \r\n");
      out.write("                 </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <br /><br />\r\n");
      out.write("    <footer>\r\n");
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