package com.emergentes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Cambios", urlPatterns = {"/Cambios"})
public class Cambios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        //processRequest(request, response);response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
              out.println("<head>");
                 out.println("<title>CAMBIO DE DOLARES Y BOLIVIANOS</title>");            
              out.println("</head>");
                 out.println("<body>");
                     out.println("<h1>Realizar El Cambio de Bolivianos a Dólares y Viceversa</h1>");
                     out.println("<h2>Cambio de Dolares a Bolivianos</h2>");
                out.println("<form action='' method='post'>");
                   out.println("Monto en Dolares: ");
                      out.println("<input type='number' name='dolar' value='0'>");
                   out.println("<br>");
                     out.println("<h2>Cambio Bolivianos a Dolares</h2>");
                   out.println("Monto en Bolivianos");
                      out.println("<input type='number' name='boliviano' value='0'>");
                   out.println("<br>");
                   out.println("<br>");
                      out.println("<input type='submit' value='Enviar'>");          
                out.println("</form>");
                out.println("</body>");
            out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        //processRequest(request, response);
        int dolar = Integer.parseInt(request.getParameter("dolar"));
        int bo = Integer.parseInt(request.getParameter("boliviano"));
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1> EL TIPO DE CAMBIO ES </h1>");
        try{
              if(dolar != 0)
                {
                double camb_dol=dolar*6.9;
                     out.println("<h4>El Cambio de Dolares a bolivianos es : </h4> ");
            
                     out.println(+camb_dol+  "  BOLIVIANOS");
                }
                  out.println("<br>");
                  out.println("<br>");
                if(bo != 0)
                 {
                    double cam_bol=bo/6.9;
                         out.println("<h4>El Cambio de Bolivianos a dolares es :</h4>");
                      
                         out.println(+cam_bol+  "  DOLARES");
                 }
             }
              finally
                     {
                      out.close();
                     }
    } 
}
