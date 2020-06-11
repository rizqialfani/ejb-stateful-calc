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
import javax.servlet.RequestDispatcher;
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
        response.setContentType("text/html;charset=UTF-8");
        try {
            double nilai;
            double nilaiTemp = 0;
            String operator = "";
            if (request.getParameter("Tambah") != null) {
                if (!request.getParameter("hasil").isEmpty()) {
                    operator = request.getParameter("operator");
                    nilaiTemp = Double.parseDouble(request.getParameter("hasil"));
                    if ("+".equals(operator)){
                        nilai = calculatorBean.tambah(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("-".equals(operator)){
                        nilai = calculatorBean.kurang(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("*".equals(operator)){
                        nilai = calculatorBean.kali(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("/".equals(operator)){
                        nilai = calculatorBean.bagi(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    else {
                        nilai = calculatorBean.isiNilai(nilaiTemp);
                    }
                    request.setAttribute("panelOp", "+");
                    request.setAttribute("panelNB", "");
                    request.setAttribute("panelNL", nilai);
                }
                else {
                    operator = "+";
                    request.setAttribute("panelOp", "+");
                }
            }
            if (request.getParameter("Kurang") != null) {
                if (!request.getParameter("hasil").isEmpty()) {
                    operator = request.getParameter("operator");
                    nilaiTemp = Double.parseDouble(request.getParameter("hasil"));
                    if ("+".equals(operator)){
                        nilai = calculatorBean.tambah(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("-".equals(operator)){
                        nilai = calculatorBean.kurang(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("*".equals(operator)){
                        nilai = calculatorBean.kali(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("/".equals(operator)){
                        nilai = calculatorBean.bagi(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    else {
                        nilai = calculatorBean.isiNilai(nilaiTemp);
                    }
                    request.setAttribute("panelOp", "-");
                    request.setAttribute("panelNB", "");
                    request.setAttribute("panelNL", nilai);
                }
                else {
                    operator = "-";
                    request.setAttribute("panelOp", "-");
                }
            }
            if (request.getParameter("Kali") != null) {
                if (!request.getParameter("hasil").isEmpty()) {
                    operator = request.getParameter("operator");
                    nilaiTemp = Double.parseDouble(request.getParameter("hasil"));
                    if ("+".equals(operator)){
                        nilai = calculatorBean.tambah(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("-".equals(operator)){
                        nilai = calculatorBean.kurang(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("*".equals(operator)){
                        nilai = calculatorBean.kali(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("/".equals(operator)){
                        nilai = calculatorBean.bagi(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    else {
                        nilai = calculatorBean.isiNilai(nilaiTemp);
                    }
                    request.setAttribute("panelOp", "*");
                    request.setAttribute("panelNB", "");
                    request.setAttribute("panelNL", nilai);
                }
                else {
                    operator = "*";
                    request.setAttribute("panelOp", "*");
                }
            }
            if (request.getParameter("Bagi") != null) {
                if (!request.getParameter("hasil").isEmpty()) {
                    operator = request.getParameter("operator");
                    nilaiTemp = Double.parseDouble(request.getParameter("hasil"));
                    if ("+".equals(operator)){
                        nilai = calculatorBean.tambah(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("-".equals(operator)){
                        nilai = calculatorBean.kurang(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("*".equals(operator)){
                        nilai = calculatorBean.kali(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    if ("/".equals(operator)){
                        nilai = calculatorBean.bagi(nilaiTemp);
                        nilaiTemp = nilai;
                    }
                    else {
                        nilai = calculatorBean.isiNilai(nilaiTemp);
                    }
                    request.setAttribute("panelOp", "/");
                    request.setAttribute("panelNB", "");
                    request.setAttribute("panelNL", nilai);
                }
                else {
                    operator = "/";
                    request.setAttribute("panelOp", "/");
                }
            }
            if (request.getParameter("Equal") != null) {
                if (!request.getParameter("hasil").isEmpty()) {
                    nilaiTemp = Double.parseDouble(request.getParameter("hasil"));
                    operator = request.getParameter("operator");
                    if ("+".equals(operator)){
                        nilai = calculatorBean.tambah(nilaiTemp);
                        request.setAttribute("panelNB", nilai);
                    }
                    if ("-".equals(operator)){
                        nilai = calculatorBean.kurang(nilaiTemp);
                        request.setAttribute("panelNB", nilai);
                    }
                    if ("*".equals(operator)){
                        nilai = calculatorBean.kali(nilaiTemp);
                        request.setAttribute("panelNB", nilai);
                    }
                    if ("/".equals(operator)){
                        nilai = calculatorBean.bagi(nilaiTemp);
                        request.setAttribute("panelNB", nilai);
                    }
                    else {
                        nilai = calculatorBean.ambilNilai();
                        request.setAttribute("panelNB", nilai);
                    }
                    request.setAttribute("panelOp", "=");
                }
            }
            if (request.getParameter("reset") != null){
                calculatorBean.reset();
                request.setAttribute("panelNB", "");
            }
            else {
                nilai = calculatorBean.ambilNilai();
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/calculator.jsp");
            rd.include(request, response);
        }
        catch (Exception ex) {
            PrintWriter out = response.getWriter();
            out.println("Error:"+
                    ex.getMessage());
        }
        finally {
            PrintWriter out = response.getWriter();
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
