/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

        @WebServlet(name = "Operaciones", urlPatterns = {"/Operaciones"})
public class Operaciones extends HttpServlet 
{

    @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
      //  processRequest(request, response);
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       out.println("<!DOCTYPE html>");
         out.println("<html>");
                 out.println("<head>");
                        out.println("<title>OPERACIONES </title>");            
                 out.println("</head>");
             out.println("<body>");
                          out.println("<h1>HACER LAS OPERACIONES DE </h1>");
                          out.println("<h2>SUMA, RESTA, PRODUCTO, DIVISION </h2>");
                      out.println("<form action='' method='post'>");
                      out.println("<h3>Ingrese los numeros</h3>");
                          out.println("NUMERO 1: ");
                        out.println("<input type='number' name='num1' value='0'>");
                        out.println("<br><br>");
                          out.println("NUMERO 2");
                        out.println("<input type='number' name='num2' value='0'>");
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
     //   processRequest(request, response);
         int numero1 = Integer.parseInt(request.getParameter("num1"));
         int numero2 = Integer.parseInt(request.getParameter("num2"));
            response.setContentType("text/html;charset=UTF-8");
             PrintWriter out = response.getWriter();
        try{
             out.println("<title>DATOS RECIBIDOS </title>");  
                  out.println("<h1>SEGUN LOS DATOS INTRODUCIDOS</h1>");
                  out.println("<h2>LAS OPERACIOENS SON LAS SIGUIENTES </h2>");
                    int suma=numero1+numero2;     
                        out.println("La suma es : "+suma+"<br>");
                    int resta=numero1-numero2;  
                        out.println("La resta es : "+resta+"<br>");
                    int producto=numero1*numero2;  
                        out.println("El producto es : "+producto+"<br>");
                    int division=numero1/numero2;  
                        out.println("La division es : "+division+"<br>");
            }
        finally
        {
            out.close();
        }
    } 
}
