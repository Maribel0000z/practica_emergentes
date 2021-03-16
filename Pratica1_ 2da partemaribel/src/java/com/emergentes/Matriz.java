package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Matriz", urlPatterns = {"/Matriz"})
public class Matriz extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException 
    {
   
	  response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
       out.println("<!DOCTYPE html>");
	 out.println("<html>");
		 out.println("<head>");
			out.println("<title>MATRIZ CARACOL </title>");            
		 out.println("</head>");
	     out.println("<body>");
			  out.println("<h1>GENERAR LA MATRIZ CARACOL</h1>");
		      out.println("<form action='' method='post'>");
		      out.println("<h4>Ingrese el tamaño</h4>");
			  out.println("NUMERO : ");
			out.println("<input type='number' name='num1' value='0'>");       
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
       
	 int n = Integer.parseInt(request.getParameter("num1"));
	    response.setContentType("text/html;charset=UTF-8");
	     PrintWriter out = response.getWriter();
	try{
	     out.println("<title>DATOS RECIBIDOS </title>");  
		  out.println("<h1>MATRIZ CARACOL  </h1>");
		  out.println("<h3>LA MATRIZ GENERADA ES : </h3>");
	int [][] matriz= new int [10][10];
	int inicio=0;
	int nlimit=n-1;
	int c=1;
	while(c<=(n*n))
	{
	    for(int i=inicio;i<=nlimit;i++)
	    {
		matriz[inicio][i]=c++;
	    }
	    for(int i=inicio+1;i<=nlimit;i++)
	    {
		matriz[i][nlimit]=c++;
	    }
	    for(int i=nlimit-1;i>=inicio;i--)
	    {
		matriz[nlimit][i]=c++;
	    }
	    for(int i=nlimit-1;i>=inicio+1;i--)
	    {
		matriz[i][inicio]=c++;
	    }
	    inicio = inicio+1;
	    nlimit = nlimit-1;
	}
	for(int i=0;i<n;i++)
	    {
		out.println();
		for(int j=0;j<n;j++)
		{ 
	      out.print(matriz[i][j]+"\t");   
	       out.println("\t");
		out.println("\t");
		}      
	       out.println("<br>");
	       out.println("<br>");
	    }               
	}
	finally
	{
	    out.close();
	}
    } 
}
