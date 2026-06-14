package com.ejemplo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/procesar")
public class DatosServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String nombre = req.getParameter("nombre");
        String edadStr = req.getParameter("edad");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Respuesta</title></head>");
        out.println("<body>");
        out.println("<h2>Hola " + nombre + "</h2>");

        try {
            int edad = Integer.parseInt(edadStr);
            if (edad >= 18) {
                out.println("<p>Eres mayor de edad.</p>");
            } else {
                out.println("<p>Eres menor de edad.</p>");
            }
        } catch (NumberFormatException e) {
            out.println("<p>Edad inválida.</p>");
        }

        out.println("<br><a href='index.jsp'>Volver</a>");
        out.println("</body></html>");
    }
}