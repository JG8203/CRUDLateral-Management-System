package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import collateralsmgt.*;

public final class addCollateral_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Add Collateral</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <form action=\"add_collateral_processing.jsp\">\n");
      out.write("            ");
      collateralsmgt.collaterals CollateralObj = null;
      synchronized (session) {
        CollateralObj = (collateralsmgt.collaterals) _jspx_page_context.getAttribute("CollateralObj", PageContext.SESSION_SCOPE);
        if (CollateralObj == null){
          CollateralObj = new collateralsmgt.collaterals();
          _jspx_page_context.setAttribute("CollateralObj", CollateralObj, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("            <!-- Form fields for collaterals.java data -->\n");
      out.write("            Type:           <input type=\"text\"      id=\"collateral_type\"     name=\"collateral_type\"><br>\n");
      out.write("            Value:          <input type=\"number\"    id=\"collateral_value\"    name=\"collateral_value\"><br>\n");
      out.write("            Description:    <input type=\"text\"      id=\"collateral_desc\"     name=\"collateral_desc\"><br>\n");
      out.write("            Client ID:      <select                 id=\"client_id\"           name=\"client_id\">\n");
      out.write("            ");

                CollateralObj.listCollateral();
                for (int i=1; i <= Collections.max(CollateralObj.client_idList); i++) {
            
      out.write("\n");
      out.write("            <option value=\"");
      out.print(i);
      out.write("\">Client #");
      out.print(i);
      out.write("</option>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </select><br>   \n");
      out.write("            Location:       <input type=\"text\"      id=\"location\"            name=\"location\">\n");
      out.write("            <!-- Add other fields as necessary -->\n");
      out.write("            <input type=\"submit\" value=\"Add Collateral\">\n");
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
