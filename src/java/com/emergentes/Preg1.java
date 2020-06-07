
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Preg1", urlPatterns = {"/Preg1"})
public class Preg1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Preg1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Pregunta 1 </h1>");
            
            String nombre=request.getParameter("nombre");
            String correo=request.getParameter("correo");
            String telefono=request.getParameter("telefono");

            if (nombre!=null || correo!=null || telefono!=null) {
                out.println("Nombre: <strong>"+nombre+"</strong><br>");
                out.println("Correo: <strong>"+correo+"</strong><br>");
                out.println("Telefono: <strong>"+telefono+"</strong><br>");
            }else{
                out.println("Introduza nombre,correo y telefono en la URL");
            }
            
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
        
    }

}
