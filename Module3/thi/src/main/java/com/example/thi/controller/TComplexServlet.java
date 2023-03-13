package com.example.thi.controller;

import com.example.thi.model.ChoThue;
import com.example.thi.model.Homestay;
import com.example.thi.service.Tcomplexservice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TComplexServlet", value = "/TComplex")
public class TComplexServlet extends HttpServlet {
    Tcomplexservice tcomplexservice = new Tcomplexservice();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                addNewForm(request,response);
                break;
            case "update":
                updateForm(request,response);
                break;
            case "delete":
                delete(request,response);
                break;
            default:
                listQuanly(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                addNew(request,response);
                break;
            case "update":
                update(request,response);
                break;
            case "search":
                SearchByName(request,response);
                break;
            default:
                listQuanly(request,response);
                break;
        }
    }


    protected void listQuanly(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Homestay> homestays = tcomplexservice.findAllHomestay();
        request.setAttribute("listDanhSach", homestays);
        RequestDispatcher dispatcher = request.getRequestDispatcher("quanly/list.jsp");
        dispatcher.forward(request, response);
    }

    protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        tcomplexservice.deleteById(id);
        response.sendRedirect("/TComplex");
    }

    protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int maMB =Integer.parseInt(request.getParameter("maMB"));
        String dTich=request.getParameter("dTich");
        int SoTang =Integer.parseInt(request.getParameter("SoTang"));
        String Mota=request.getParameter("Mota");
        String gia=request.getParameter("gia");
        String NgayBD=request.getParameter("NgayBD");
        String NgayKT=request.getParameter("NgayKT");
        Homestay danhsach = new Homestay(maMB, dTich, SoTang, Mota, gia,NgayBD,NgayKT);
        tcomplexservice.update(danhsach);
        response.sendRedirect("/TComplex");
    }

    protected void SearchByName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int soTang=Integer.parseInt(request.getParameter("soTang"));
        List<Homestay> danhsaches = tcomplexservice.searchName(soTang);
        request.setAttribute("listDanhSach",danhsaches);
        RequestDispatcher dispatcher = request.getRequestDispatcher("quanly/list.jsp");
        dispatcher.forward(request, response);
    }

    protected void addNew(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dTich=request.getParameter("dTich");
        int SoTang =Integer.parseInt(request.getParameter("SoTang"));
        String Mota=request.getParameter("Mota");
        String gia=request.getParameter("gia");
        String NgayBD=request.getParameter("NgayBD");
        String NgayKT=request.getParameter("NgayKT");
        tcomplexservice.addNew( new Homestay(dTich, SoTang, Mota, gia,NgayBD,NgayKT));
        response.sendRedirect("/TComplex");
    }

    protected void addNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ChoThue> Iphones = tcomplexservice.findAllChothue();
        request.setAttribute("listIphone", Iphones);
        RequestDispatcher dispatcher = request.getRequestDispatcher("quanly/create.jsp");
        dispatcher.forward(request, response);
    }

    protected void updateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int maMB = Integer.parseInt(request.getParameter("maMB"));
        int soTang = Integer.parseInt(request.getParameter("soTang"));
        Homestay danhsach = tcomplexservice.findById(maMB, soTang);
        List<ChoThue> choThues = tcomplexservice.findAllChothue();
        request.setAttribute("listDanhSach", danhsach);
        request.setAttribute("choThues", choThues);
        RequestDispatcher dispatcher = request.getRequestDispatcher("quanly/update.jsp");
        dispatcher.forward(request, response);
    }
}
