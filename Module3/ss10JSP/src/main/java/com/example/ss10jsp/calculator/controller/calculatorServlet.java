package com.example.ss10jsp.calculator.controller;

import com.example.ss10jsp.calculator.model.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculatorServlet", value = "/calculator")
public class calculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    float firstOperand = Integer.parseInt(request.getParameter("first-operand"));
    float secondOperand = Integer.parseInt(request.getParameter("second-operand"));
    char operand = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result: <h1>");
        try {
            float result = Calculator.calculator(firstOperand,secondOperand,operand);
            writer.println(firstOperand+" "+operand+" "+secondOperand+"="+ result);
        }catch (Exception e){
            writer.println("Error:" +e.getMessage());
        }
        writer.println("</html>");
    }
}
