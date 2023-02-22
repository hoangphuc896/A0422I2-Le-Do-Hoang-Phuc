package com.example.ss10jsp.customerManagement.controller;

import com.example.ss10jsp.customerManagement.model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {

    private static List<Customer> customerList ;

    static {
        customerList = new ArrayList<>() ;
        customerList.add( new Customer("Lê Văn Hương","22-11-1996","Đà Nẵng",""));
        customerList.add( new Customer("Nguyễn Công Tâm","19-12-1996","Đà Nẵng",""));
        customerList.add( new Customer("Trần Lê Xuân","14-11-1996","Đà Nẵng",""));
        customerList.add( new Customer("Trần Lê Đức Hoa","25-11-1996","Đà Nẵng",""));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list",customerList);
        request.getRequestDispatcher("customer.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
