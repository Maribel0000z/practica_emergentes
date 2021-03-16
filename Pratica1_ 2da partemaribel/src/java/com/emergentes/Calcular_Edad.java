package com.emergentes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Calcular_Edad"})
public class Calcular_Edad extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       // processRequest(request, response);
               response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
            out.println("<head>");
                 out.println("<title>CALCULAR LA EDAD</title>");            
            out.println("</head>");
        out.println("<body>");
                 out.println("<h2>Calcula La edad de una persona a partir de su año de nacimiento </h2>");
                 out.println("<br>");
             out.println("<form action='' method='post'>");
                   out.println("INGRESAR EL AÑO DE NACIMIENTO");
                   out.println("<br><br>");
                   out.println("AÑO");
                   out.println("<input type='number' name='ano' required>");  
                   out.println("<br><br>");
                   out.println("<input type='submit' value='Enviar'>");
                   out.println("<br><br>");
             out.println("</form>");
        out.println("</body>");
        out.println("</html>");   
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       // processRequest(request, response);
        String ano = request.getParameter("ano");
        int numEntero = Integer.parseInt(ano);
        
        //String fecha = request.getParameter("fecha");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            out.println("<!DOCTYPE html>");
                 out.println("<html>");
                     out.println("<head>");
                         out.println("<title>SU EDAD ES</title>");            
                     out.println("</head>");
                 out.println("<body>");
                         out.println("<h1>SEGUN LA INFORMACION ENVIADA   </h1>");
             if(ano != null)
                {
                     out.println("Usted tiene : <br>");
                int edad=2020-numEntero;
                     out.print("<br>");
                     out.print(edad +  " Años");            
                }
                 else
                 {
                     out.println("No hay datos para mostrar! ");
                 }
                     out.println("</body>");
                     out.println("</html>");
            }
             finally
            {
            out.close();
            }
    }  
       
}
