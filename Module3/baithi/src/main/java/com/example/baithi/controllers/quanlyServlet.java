package com.example.baithi.controllers;

import com.example.baithi.model.Quanly;
import com.example.baithi.service.QuanlyServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "quanlyServlet", value = "/quanly")
public class quanlyServlet extends HttpServlet {
    QuanlyServiceImpl quanlyService = new QuanlyServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showNewForm(request, response);
                break;
            case "update":
                showEditForm(request, response);
                break;
            case "delete":
                deleteUsers(request, response);
                break;
            case "search":
                searchUser(request, response);
                break;
            default:
                listUsers(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addNewUser(request, response);
                break;
            case "update":
                updateUser(request, response);
                break;
            default:
                listUsers(request, response);
                break;
        }
    }


    private void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Quanly> usersList = quanlyService.findAll();
        request.setAttribute("listUsers", usersList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("quanly/list.jsp");
        dispatcher.forward(request, response);
    }

    private void addNewUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name1 = request.getParameter("name1");
        String gia = request.getParameter("gia");
        String soluong = request.getParameter("soluong");
        String mau = request.getParameter("mau");
        String thietbi = request.getParameter("thietbi");
        quanlyService.addNewUser(new Quanly(name1, gia, soluong, mau, thietbi));
        response.sendRedirect("/quanly");
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name1 = request.getParameter("name1");
        String gia = request.getParameter("gia");
        String soluong = request.getParameter("soluong");
        String mau = request.getParameter("mau");
        String thietbi = request.getParameter("thietbi");
        quanlyService.updateUser(new Quanly(id, name1, gia, soluong, mau, thietbi));
        response.sendRedirect("/quanly");
    }

    private void deleteUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        quanlyService.deleterUser(id);
        response.sendRedirect("/quanly");
    }

    private void searchUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name1 = request.getParameter("name1");
        List<Quanly> usersList = quanlyService.SearchUser(name1);
        request.setAttribute("listUsers", usersList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("quanly/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Quanly quanly = quanlyService.findById(id);
        request.setAttribute("user", quanly);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("quanly/update.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("quanly/create.jsp");
        requestDispatcher.forward(request, response);
    }
}
