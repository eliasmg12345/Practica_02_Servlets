
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Preg4", urlPatterns = {"/Preg4"})
public class Preg4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Preg4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Pregunta 4</h1>");
            
            out.println("<p>Juego de Dados</p>");
            
            out.println("<form action='' method='post'>");
            out.println("<input type='submit' value='lanzar'>");
            out.println("</body>");
            out.println("</html>");
        }finally {
            out.close();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Preg4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado del juego</h1>");
            
            
            int dado1 = (int) (Math.random() * 6) + 1;
            out.println("<h2>dado1: "+dado1+"</h2>");
            int dado2 = (int) (Math.random()*6) +1;
            out.println("<h2>dado2: "+dado2+"</h2>");
            
            if ((dado1+dado2==7) || (dado1+dado2==11)) {
                
                out.println("<h2>Ganaste</h2><br>");
                
            }else{
                out.println("<h2>perdiste</h2><br>");
            }
            
            out.println("<a href='index.jsp'>Volver</a>");
            
            out.println("</body>");
            out.println("</html>");
        }finally {
            out.close();
        }
        
    }

 
}
