/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2016-12-22 08:46:59 UTC
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

public final class HomeUomo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 Collection<?> productsM = (Collection<?>) request.getAttribute("productsM");
   Collection<?> productsC = (Collection<?>) request.getSession().getAttribute("productsC");
   String all=""+request.getSession().getAttribute("all");
   String categoria=""+request.getSession().getAttribute("cat");
   Cart cart = (Cart) request.getAttribute("cart");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" lang=\"it\">\r\n");
      out.write("<head>\r\n");
      out.write("    <script src=\"Script/jquery.js\"></script>\r\n");
      out.write("    <script src=\"Script/loadmore.js\"></script>\r\n");
      out.write("    <link rel=\"icon\" href=\"Immagini/sprite0.png\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/base.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/uomo.css\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./CSS/thumbnails.css\" type=\"text/css\">\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"Content-Language\" content=\"it-IT\" />\r\n");
      out.write("    <meta name=\"description\" content=\"Il miglior sito dove acquistare T-Shirt  per qualsiasi gusto e necessità, con un'ampia scelta di modelli aggiornati periodicamente con i migliori design della rete.\" />\r\n");
      out.write("    <meta name=\"keywords\" content=\"T-shirt, magliette, maglietta, nerd, cinema, divertenti, geek, core, series, best\" />\r\n");
      out.write("    <title>Core Shirt: The Best T-Shirts series</title>\r\n");
      out.write("    <script>\r\n");
      out.write("      $(document).ready(function(){\r\n");
      out.write("    \t $('.categoria').click(function(){\r\n");
      out.write("    \t\t var cat=this.getAttribute(\"id\");\r\n");
      out.write("    \t\t var sex='M';\r\n");
      out.write("    \t\t  $.ajax({\r\n");
      out.write("    \t\t\t type:\"get\",\r\n");
      out.write("    \t\t\t url:\"./?action=getCategory&sesso=\"+sex+\"&categoria=\"+cat,\r\n");
      out.write("    \t\t    success:function(){\r\n");
      out.write("    \t\t    \t $('#corpo').load(\"./?action=uomo&categoria=\"+cat+\" #corpo>div,#loadMore\");\r\n");
      out.write("    \t\t    }\r\n");
      out.write("    \t\t})\r\n");
      out.write("    \t })\r\n");
      out.write("    \t $('.categoria1').click(function(){\r\n");
      out.write("    \t\t var cat=this.getAttribute(\"id\");\r\n");
      out.write("    \t\t var sex='F';\r\n");
      out.write("    \t\t window.location.href=\"./?action=getCategory1&sesso=\"+sex;\r\n");
      out.write("    \t })\r\n");
      out.write("      })\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("    \r\n");
      out.write("    <article>\r\n");
      out.write("    <aside id=\"aside_bar\">\r\n");
      out.write("        <span> <img  src=\"Immagini/spedizione.png\"> \r\n");
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
      out.write("        </aside>\r\n");
      out.write("    </article>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        <article>\r\n");
      out.write("     <div>\r\n");
      out.write("    <p class=\"uomo\"> T-shirt uomo <p>\r\n");
      out.write("     </div>\r\n");
      out.write("    </article>\r\n");
      out.write("        \r\n");
      out.write("    <article>\r\n");
      out.write("    <div id=\"sideContainer\">\r\n");
      out.write("        <div id=\"menuL\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li class=\"type\"><a href=\"./?action=uomo\">Uomo</a></li>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria\" id=\"Cinema\">Cinema</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria\" id=\"Geek\">Geek</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria\" id=\"Divertenti\">Divertenti</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria\" id=\"Manga\">Anime e Manga</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria\" id=\"Comics\">Comics</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria\" id=\"Nerd\">Nerd</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <li class=\"type\"><a href=\"./?action=donna\">Donna</a></li>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria1\" id=\"Cinema\">Cinema</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria1\" id=\"Geek\">Geek</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria1\" id=\"Divertenti\">Divertenti</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria1\" id=\"Manga\">Anime e Manga</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria1\" id=\"Comics\">Comics</a></li>\r\n");
      out.write("                    <li><a href=\"#\" class=\"categoria1\" id=\"Nerd\">Nerd</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </ul> \r\n");
      out.write("        </div>\r\n");
      out.write("  <div id=\"corpo\" align=\"center\">\r\n");
      out.write("    ");
  Collection<?> products1=null;
        
        if(all.contains("1")&&categoria.contains("1"))
        	{products1=productsC;}
        else
        	{products1=productsM;}
        if (products1 != null && products1.size() != 0) {
		Iterator<?> it = products1.iterator();
		String a="";
		int i=0,k=1;
		while (it.hasNext()) {
			Articolo bean = (Articolo) it.next(); 
			if(i%12==0&&i!=0){a=""+k;k++;}
      out.write("\r\n");
      out.write("        <a id=\"a\" href=\"Control?action=dettagli&id=");
      out.print(bean.getidArticolo());
      out.write("&sesso=");
      out.print(bean.getSesso());
      out.write("\">\t\r\n");
      out.write("        <div class=\"element");
      out.print(a);
      out.write("\" style=\"display: inline-block\"><img class=\"thumbnails\" src=\"./Immagini/Magliette/Maglietta(");
      out.print(bean.getidArticolo());
      out.write(").jpg\"></a>\r\n");
      out.write("            <div>");
      out.print(bean.getnome());
      out.write("</div>\r\n");
      out.write("            <div class=\"prezzo\">");
      out.print(bean.getprezzo());
      out.write("€</div>\r\n");
      out.write("            <div class=\"hidden\"><a id=\"a\" href=\"Control?action=dettagli&id=");
      out.print(bean.getidArticolo());
      out.write("&sesso=");
      out.print(bean.getSesso());
      out.write("\"><button class=\"button\">Visualizza dettagli</button></a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
 i++;
           } 
          }
      out.write("\r\n");
      out.write("          <img id=\"loadMore\" src=\"Immagini/arrow.png\"> \r\n");
      out.write("    </div>\r\n");
      out.write("          \r\n");
      out.write("    </div>  \r\n");
      out.write("        </article>\r\n");
      out.write("      </div>\r\n");
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