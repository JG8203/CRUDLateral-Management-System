package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import collateralsmgt.*;

public final class listCollaterals_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>List Collaterals</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>List of Collaterals</h1>\n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("        ");
      collateralsmgt.collaterals CollateralObj = null;
      synchronized (session) {
        CollateralObj = (collateralsmgt.collaterals) _jspx_page_context.getAttribute("CollateralObj", PageContext.SESSION_SCOPE);
        if (CollateralObj == null){
          CollateralObj = new collateralsmgt.collaterals();
          _jspx_page_context.setAttribute("CollateralObj", CollateralObj, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>Type</th>\n");
      out.write("            <th>Value</th>\n");
      out.write("            <th>Description</th>\n");
      out.write("            <th>Client ID</th>\n");
      out.write("            <th>Location</th>\n");
      out.write("            <th>Date Added</th>\n");
      out.write("            <th>Last Valuated</th>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        <!-- Rows of collateral data -->\n");
      out.write("        ");

            CollateralObj.listCollateral();
            for (int i=0; i < CollateralObj.collateral_idList.size(); i++) {
                
         
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(CollateralObj.collateral_idList.get(i));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(CollateralObj.collateral_typeList.get(i));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(CollateralObj.collateral_valueList.get(i));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(CollateralObj.collateral_descList.get(i));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(CollateralObj.client_idList.get(i));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(CollateralObj.locationList.get(i));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(CollateralObj.date_addedList.get(i));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(CollateralObj.last_valuationList.get(i));
      out.write("</td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <a href=\"addCollateral.html\">Add New Collateral</a>\n");
      out.write("        <form action=\"index.html\">\n");
      out.write("            <input type=\"submit\" value=\"Return to Menu\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
