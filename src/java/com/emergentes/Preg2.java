
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Preg2", urlPatterns = {"/Preg2"})
public class Preg2 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Preg2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Convertidor de monedas</h1>");
            
            out.println("<form action='' method='post'>");
            out.println("Bolivianos");
            out.println("<input type='text' name='bolivianos' required><label>Bs</label><br><br>");
            out.println("Dolares");
            out.println("<input type='text' name='dolares' required><label>$</label><br><br>");
            out.println("<input type='submit' value='convertir'><br>");
            
            out.println("");        
            out.println("");
            out.println("</form>");
            
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
            out.println("<title>Servlet Preg2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Convertidor de monedas</h1>");
            
            String bolivianos=request.getParameter("bolivianos");
            Double boliviano=Double.parseDouble(bolivianos);
            String dolares=request.getParameter("dolares");
            Double dolar=Double.parseDouble(dolares);
            
            if (boliviano!=0 || dolar!=0) {
                Double bolivianoendolar=boliviano/7;
                Double dolarenboliviano=dolar*7;
                out.println("bol en dolar =  "+bolivianoendolar+"$<br><br>");
                out.println("dolar en bol=  "+dolarenboliviano+"Bs<br>");
                
            }else{
                System.out.println("Introduzca en numero");
            }
            
            
            
            out.println("</body>");
            out.println("</html>");
            
        }finally{
            out.close();
        }
        
    }

}
