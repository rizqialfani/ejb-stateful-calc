/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.servlets;

import calculator.ejb.CalculatorBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mr-Al
 */
@WebServlet(name = "Calculator", urlPatterns = {"/Calculator"})
public class Calculator extends HttpServlet {

    CalculatorBeanLocal calculatorBean = lookupCalculatorBeanLocal();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException,IOException { 
 
//        double n1 = 0.0;
//        if(request.getParameter("n1") != null) {
//            n1 = Double.parseDouble(request.getParameter("n1"));
//        }
//        double n2 = 0.0;
//        if(request.getParameter("n2") != null) {
//            n2 = Double.parseDouble(request.getParameter("n2"));
//        }
//        request.setAttribute("display", 4);
//        String operation = request.getParameter("op");
//        String value = "";
//        if (request.getParameter("Add") != null) {
//            value += calculatorBean.add(n1, n2);
//        }
//        if (request.getParameter("Sub") != null) {
//            value += calculatorBean.subtract(n1, n2);
//        }
//        if (request.getParameter("Div") != null) {
//            value += calculatorBean.multiply(n1, n2);
//        }
//        if (request.getParameter("Mul") != null) {
//            value += calculatorBean.divide(n1, n2);
//        } 
//        if(operation != null && operation.equals("add")) {
//            value += calculatorBean.add(n1, n2);
//        }
//        if(operation != null && operation.equals("subtract")) {
//            value += calculatorBean.subtract(n1, n2);
//        }
//        if(operation != null && operation.equals("multiply")) {
//            value += calculatorBean.multiply(n1, n2);
//        }
//        if(operation != null && operation.equals("divide")) {
//            value += calculatorBean.divide(n1, n2);
//        } 
 
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
//            out.println("<form method=\"post\" action=\"Calculator\">");
//            out.println("<input type=\"text\" name=\"n1\" value=\"" + n1 + "\"/>");
//            out.println("<select name=\"op\">");
//            out.println("<option value=\"add\">+</option>");
//            out.println("<option value=\"subtract\">-</option>");
//            out.println("<option value=\"multiply\">*</option>");
//            out.println("<option value=\"divide\">/</option>");
//            out.println("</select>");
//            out.println("<input type=\"text\" name=\"n2\" value=\"" + n2 + "\"/>");
//            out.println("<input type=\"submit\" value=\"=\" />");
//            out.println("<input type=\"text\" name =\"result\" value=\"" + value + "\" />");
//            out.println("</form>");
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Calculator</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<center><h2>Kalkulator Statefull</h2></center>");
//            out.println("<div id='calc-contain'>");
//            out.println("<form name=\"calculator\">");
//            out.println("<center><input type=\"text\" name=\"answer\" /></center>");
//            out.println("<br>");
//            out.println("<center>");
//            out.println("<input type=\"button\" value=\" 1 \" onclick=\"calculator.answer.value += '1'\" />");
//            out.println("<input type=\"button\" value=\" 2 \" onclick=\"calculator.answer.value += '2'\" />");
//            out.println("<input type=\"button\" value=\" 3 \" onclick=\"calculator.answer.value += '3'\" />");
//            out.println("<input type=\"button\" value=\" + \" onclick=\"calculator.answer.value += '+'\" />");
//            out.println("<br/>");
//            out.println("<input type=\"button\" value=\" 4 \" onclick=\"calculator.answer.value += '4'\" />");
//            out.println("<input type=\"button\" value=\" 5 \" onclick=\"calculator.answer.value += '5'\" />");
//            out.println("<input type=\"button\" value=\" 6 \" onclick=\"calculator.answer.value += '6'\" />");
//            out.println("<input type=\"button\" value=\" - \" onclick=\"calculator.answer.value += '-'\" />");
//            out.println("<br/>");
//            out.println("<input type=\"button\" value=\" 7 \" onclick=\"calculator.answer.value += '7'\" />");
//            out.println("<input type=\"button\" value=\" 8 \" onclick=\"calculator.answer.value += '8'\" />");
//            out.println("<input type=\"button\" value=\" 9 \" onclick=\"calculator.answer.value += '9'\" />");
//            out.println("<input type=\"button\" value=\" x \" onclick=\"calculator.answer.value += '*'\" />");
//            out.println("<br/>");
//            out.println("<input type=\"button\" value=\" c \" onclick=\"calculator.answer.value = ''\" />");
//            out.println("<input type=\"button\" value=\" 0 \" onclick=\"calculator.answer.value += '0'\" />");
//            out.println("<input type=\"button\" value=\" = \" onclick=\"calculator.answer.value = eval(calculator.answer.value)\" />");
//            out.println("<input type=\"button\" value=\" / \" onclick=\"calculator.answer.value += '/'\" />");
//            out.println("<br/>");
//            out.println("</center>");
//            out.println("</div>");
//            out.println("</body>");
//            out.println("</html>");
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("  <title>Stateful Calculator</title>");

                out.println("  <meta charset='utf-8'>");
                out.println("  <meta http-equiv='X-UA-Compatible' content='IE=edge'>");
                out.println("  <meta name='viewport' content='width=device-width, initial-scale=1'>");

                out.println("  <!-- Estilos -->");
                out.println("  <link href='css/bootstrap.css' rel='stylesheet'>");

                out.println("  <link rel='stylesheet' type='text/css' href='css/supernice.css'>");

                out.println("  <link rel='stylesheet' type='text/css' href='css/styles.css'>");
                out.println("  <link rel='stylesheet' type='text/css' href='css/styles_calculadora.css'>");

                out.println("<!-- Fuentes -->");
                out.println("  <link href='https://fonts.googleapis.com/css?family=Oxygen:400,300,700' rel='stylesheet' type='text/css'>");
                out.println("  <link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,400italic,700,700italic' rel='stylesheet' type='text/css'>");
                out.println("  <link href='https://fonts.googleapis.com/css?family=Share+Tech+Mono' rel='stylesheet' type='text/css'>");
                out.println("  <link href='https://fonts.googleapis.com/css?family=Aclonica' rel='stylesheet' type='text/css'>");
                out.println("  <link href='https://fonts.googleapis.com/css?family=Oswald:400,700,300' rel='stylesheet' type='text/css'>");


                out.println("</head>");
                out.println("<body style='background-color: #99BADD;'>");
                out.println("  <header class='container' style='width: 50%;'>");
                out.println("    <nav class='navbar navbar-inverse' style='background-color: #4E5F72; border-color: #4E5F72;'>");
                out.println("      <div class='container-fluid'>");
                out.println("        <h1 style='text-align: center; color: white;'>Calculator using Stateful Session Beans</h1>");
                out.println("        <h3 style='text-align: center; color: white; margin: 10px 0 20px 0'>M. Rizqi Alfani - 21120117140007</h3>");
                out.println("      </div>");
                out.println("    </nav>");
                out.println("  </header>");
                out.println("  <div style='display: flex; margin: 0 auto; width: 50%;'>");
                out.println("    <div class='container calculadora'>"); 
                out.println("      <div class='container-fluid cabecera' id='cabecera'>");
                out.println("        <!-- grupo LCD + Botón atrás -->");
                out.println("        <div class='col-xs-12 col-sm-12' id='resultado'>");
                out.println("          <div class='input-group  has-success' style='width: 100%;'>");
                out.println("            <input type='text' class='form-control' value='' id='lcd' style='border-radius: 4px;'>");
                out.println("          </div>"); 
                out.println("          <div id='botones_lcd' class='pull-left hidden-xs'>");
                out.println("            <div>");
                out.println("              <button type='button' class='btn btn-success btn-sm op_unitario btn_lcd' id='b_atras' title='Borra un caracter'>");
                out.println("                <span class='glyphicon glyphicon-arrow-left' aria-hidden='true'></span>");
                out.println("              </button>");
                out.println("            </div>");
                out.println("          </div>");
                out.println("        </div>"); 
                out.println("        <!-- Resultado -->");

                out.println("      </div> <!-- Cabecera -->");

                out.println("      <div class='container-fluid teclado '>");
                out.println("          <div class='col-xs-12 col-sm-12 teclado-ordenador'>");
                out.println("            <div class='row' id='tp-r1'>");
                out.println("              <!-- <button class='btn btn-info bnt-md' data-toggle='modal' data-target='#myModal'> -->");
                out.println("              <button class='btn btn-danger bnt-md op_borrar' id='b_borrar' title='Resetea la calculadora (elimina el valor actual, la memoria y el acumulador)'>C</button>");
                out.println("              <button class='btn btn-danger bnt-md op_borrar' id='b_borrar_parcial' title='Resetea únicamente el valor actual'>CE</button>");
                out.println("              <button class='btn btn-primary bnt-md op_binario' id='b_divide' title='División'>/</button>");
                out.println("              <button class='btn btn-primary bnt-md op_binario' id='b_multiplica' title='Multiplicación'>*</button>");
                out.println("            </div>");

                out.println("            <div class='row' id='tp-r2'>");
                out.println("              <button class='btn btn-default bnt-md btn_numero' id='num7'>7</button>");
                out.println("              <button class='btn btn-default bnt-md btn_numero' id='num8'>8</button>");
                out.println("              <button class='btn btn-default bnt-md btn_numero' id='num9'>9</button>");
                out.println("              <button class='btn btn-primary bnt-md op_binario' id='b_suma' title='Suma'>+</button>");
                out.println("            </div>");
                out.println("            <div class='row' id='tp-r3'>");
                out.println("              <button class='btn btn-default bnt-md btn_numero' id='num4'>4</button>");
                out.println("              <button class='btn btn-default bnt-md btn_numero' id='num5'>5</button>");
                out.println("              <button class='btn btn-default bnt-md btn_numero' id='num6'>6</button>");
                out.println("              <button class='btn btn-primary bnt-md op_binario' id='b_resta' title='Resta'>-</button>");
                out.println("            </div>");
                out.println("            <div class='row' id='tp-r4-r5'>");
                out.println("              <button class='btn btn-default bnt-md btn_numero' id='num1'>1</button>");
                out.println("              <button class='btn btn-default bnt-md btn_numero' id='num2'>2</button>");
                out.println("              <button class='btn btn-default bnt-md btn_numero' id='num3'>3</button>");
                out.println("              <button class='btn btn-default bnt-md op_unitario' id='b_signo' title='Cambiar el signo'>&plusmn;</button>");
                out.println("            </div>");
                out.println("            <div class='row'>");
                out.println("              <button class='btn btn-default bnt-md btn_numero' id='punto' title='Separador decimal'>.</button>");
                out.println("              <button class='btn btn-default bnt-md btn_numero' id='num0'>0</button>");
                out.println("              <button class='btn btn-success bnt-md op_calcular' id='b_calcula' title='Resultado' style='width: 240%'>&equals;</button>");
                out.println("            </div>");
                out.println("          </div> <!--teclado numérico principal -->");

                out.println("      </div> <!--calculadora -->");
                out.println("    </div>");

                out.println("    <div class='container calculadora'>"); 
                out.println("      <div class='container-fluid cabecera' id='cabecera'  style='height: 97%;'>");
                out.println("        <!-- grupo LCD + Botón atrás -->");
                out.println("        <div class='col-xs-12 col-sm-12' id='resultado'>");
                out.println("        </div>"); 
                out.println("        <!-- Resultado -->");
                out.println("      </div> <!-- Cabecera -->");
                out.println("    </div>");
                out.println("  </div>");
                out.println("</body>");
                out.println("</html>");
        }
        catch (Exception ex) {
            out.println("Error:"+
                    ex.getMessage());
        }
        finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private CalculatorBeanLocal lookupCalculatorBeanLocal() {
        try {
            Context c = new InitialContext();
            return (CalculatorBeanLocal) c.lookup("java:global/StatefulCalc/StatefulCalc-ejb/CalculatorBean!calculator.ejb.CalculatorBeanLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
