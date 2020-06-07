
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Preg5", urlPatterns = {"/Preg5"})
public class Preg5 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Preg5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Generar matriz caraccol</h1>");
            
            out.println("<form action='' method='post'>");
            out.println("<label>Ingrese tamaño de la Matriz</label>");
            out.println("<input type='text' name='tamao' required>");
            out.println("<label>Ingrese numero de inicio</label>");
            out.println("<input type='text' name='inicio' required>");
            out.println("<input type='submit' value='generar'>");
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
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Preg5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Matriz</h1>");
            
            
            
            String tamao=request.getParameter("tamao");
            int n=Integer.parseInt(tamao);
            
            String inicio=request.getParameter("inicio");
            int x=Integer.parseInt(inicio);
           
            
            
            int[][] M = new int[n + 1][n + 1];
            for (int a = 1; a <= n / 2; a++) {
                for (int i = a; i <= n - a; i++) {
                    M[a][i] = x;
                    x++;
                }
                for (int i = a; i <= n - a; i++) {
                    M[i][n - a + 1] = x;
                    x++;
                }
                for (int i = n - a + 1; i >= a + 1; i--) {
                    M[n - a + 1][i] = x;
                    x++;
                }
                for (int i = n - a + 1; i >= a + 1; i--) {
                    M[i][a] = x;
                    x++;
                }
            }
            if (n % 2 == 1) {
                M[n / 2 + 1][n / 2 + 1] = x;
            }
            
        //MOSTRANDO
        out.println("<table  border='1'>");
            
        for (int i = 1; i <= n; i++) {
            
            
            out.println("<tr>");
            for (int j = 1; j <= n; j++) {
                out.println("<td align='center'>" + M[i][j]+"</td>");
            }
            out.println("</tr>");
        }
            
            out.println("</table>");
        
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }
}
