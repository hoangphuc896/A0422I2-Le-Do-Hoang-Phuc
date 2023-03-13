package com.example.quan_ly.controller;

import com.example.quan_ly.model.Danhsach;
import com.example.quan_ly.model.Iphone;
import com.example.quan_ly.service.QuanLyService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "quanlyServlet", value = "/quanly")
public class quanlyServlet extends HttpServlet {
    QuanLyService quanLyService = new QuanLyService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addNewForm(request, response);
                break;
            case "update":
                updateForm(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                listQuanly(request, response);
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
                addNew(request, response);
                break;
            case "update":
                update(request, response);
                break;
            case "search":
                SearchByName(request, response);
                break;
            default:
                listQuanly(request, response);
                break;
        }
    }


    protected void listQuanly(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Danhsach> danhsaches = quanLyService.findAllDanhsach();
        request.setAttribute("listDanhSach", danhsaches);
        RequestDispatcher dispatcher = request.getRequestDispatcher("quanly/list.jsp");
        dispatcher.forward(request, response);
    }

    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        quanLyService.deleteById(id);
        response.sendRedirect("/quanly");
    }

    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nameIphones = request.getParameter("nameIphones");
        String phonenumber = request.getParameter("phone_number");
        String note = request.getParameter("note");
        int id_thanh_toan = Integer.parseInt(request.getParameter("id_thanh_toan"));
        Danhsach danhsach = new Danhsach(id, nameIphones, phonenumber, note, id_thanh_toan);
        quanLyService.update(danhsach);
        response.sendRedirect("/quanly");
    }

    protected void SearchByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String soTang = request.getParameter("name");
        List<Danhsach> danhsaches = quanLyService.searchName(soTang);
        request.setAttribute("listDanhSach", danhsaches);
        RequestDispatcher dispatcher = request.getRequestDispatcher("quanly/list.jsp");
        dispatcher.forward(request, response);
    }

    protected void addNew(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameIphones = request.getParameter("nameIphones");
        String phone_number = request.getParameter("phone_number");
        String note = request.getParameter("note");
        int id_thanh_toan = Integer.parseInt(request.getParameter("id_thanh_toan"));
        quanLyService.addNew(new Danhsach(nameIphones, phone_number, note, id_thanh_toan));
        response.sendRedirect("/quanly");
    }

    protected void addNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Iphone> Iphones = quanLyService.findAllIphone();
        request.setAttribute("listIphone", Iphones);
        RequestDispatcher dispatcher = request.getRequestDispatcher("quanly/create.jsp");
        dispatcher.forward(request, response);
    }

    protected void updateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int id_thanh_toan = Integer.parseInt(request.getParameter("id_thanh_toan"));
        Danhsach danhsach = quanLyService.findById(id, id_thanh_toan);
        List<Iphone> iphones = quanLyService.findAllIphone();
        request.setAttribute("listDanhSach", danhsach);
        request.setAttribute("Iphones", iphones);
        RequestDispatcher dispatcher = request.getRequestDispatcher("quanly/update.jsp");
        dispatcher.forward(request, response);
    }
}
