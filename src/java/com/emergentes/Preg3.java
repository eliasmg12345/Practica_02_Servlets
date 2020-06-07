
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Preg3", urlPatterns = {"/Preg3"})
public class Preg3 extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Pregunta 3</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Operaciones</h1>");
            
            out.println("<form action='' method='post'>");
            out.println("Numero 1");
            out.println("<input type='text' name='num1' required><br><br>");
            out.println("Numero 2");
            out.println("<input type='text' name='num2' required><br><br>");
            
            out.println("<label>Operador</label>");
            out.println("<select name='op' >");
            out.println("<option value='suma' >SUMA</option>");
            out.println("<option value='resta' selected >RESTA</option>");
            out.println("<option value='mult' >MULTIPLICACION</option>");
            out.println("<option value='div'>DIVISION</option>");
            out.println("</select><br>");
            
            
            out.println("<input type='submit' value='convertir'><br>");
            
          
                        
            out.println("</body>");
            out.println("</html>");
            
        }finally{
            out.close();
        }
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Preg3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado de Operaciones</h1>");
            
            String num1=request.getParameter("num1");
            Double n1=Double.parseDouble(num1);
            
            String num2=request.getParameter("num2");
            Double n2=Double.parseDouble(num2);
            
            String op=request.getParameter("op");
            
                out.println("numero 1 =  "+n1+"<br><br>");
                out.println("numero 2 =  "+n2+"<br><br>");

                if ("suma".equals(op)) {
                Double resultado=n1+n2;
                out.println("Resultado =  "+resultado+"<br><br>");
                }
                
                if ("resta".equals(op)) {
                Double resultado=n1-n2;
                out.println("Resultado =  "+resultado+"<br><br>");
                }
                
                if ("mult".equals(op)) {
                Double resultado=n1*n2;
                out.println("Resultado =  "+resultado+"<br><br>");
                }
                
                if ("div".equals(op)) {
                Double resultado=n1/n2;
                out.println("Resultado =  "+resultado+"<br><br>");
                }
                
                
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
        
        
    }

}
