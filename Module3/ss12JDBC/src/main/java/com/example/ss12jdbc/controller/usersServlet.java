package com.example.ss12jdbc.controller;

import com.example.ss12jdbc.model.Users;
import com.example.ss12jdbc.repository.UseRepositoryImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "usersServlet", value = "/users")
public class usersServlet extends HttpServlet {
    private static UseRepositoryImpl useRepository = new UseRepositoryImpl();

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String action = request.getParameter("action");
            if (action == null) {
                action = "";
            }
            switch (action) {
                case "create":
                    showNewForm(request,response);
                    break;
                case "update":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteUsers(request, response);
                    break;
                case "search":
                    searchUser(request,response);
                    break;
                case "sort":
                    sortUser(request, response);
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
            List<Users> usersList = useRepository.findAll();
            request.setAttribute("listUsers", usersList);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/list.jsp");
            requestDispatcher.forward(request, response);
        }

        private void addNewUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String country = request.getParameter("country");
            useRepository.addNewUser(new Users(name, email, country));
            response.sendRedirect("/users");
        }

        private void updateUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String country = request.getParameter("country");
            useRepository.updateUser(new Users(id, name, email, country));
            response.sendRedirect("/users");
        }

        private void deleteUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int id = Integer.parseInt(request.getParameter("id"));
            useRepository.deleterUser(id);
            response.sendRedirect("/users");
        }

        private void sortUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            List<Users> users = useRepository.sort();
            request.setAttribute("listUsers", users);
            RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
            dispatcher.forward(request,response);
        }

        private void searchUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String country = request.getParameter("country");
            List<Users> usersList = useRepository.SearchUser(country);
            request.setAttribute("listUsers", usersList);
            RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
            dispatcher.forward(request,response);
        }

        private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int id = Integer.parseInt(request.getParameter("id"));
            Users users = useRepository.findById(id);
            request.setAttribute("user", users);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/update.jsp");
            requestDispatcher.forward(request, response);
        }

        private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/create.jsp");
            requestDispatcher.forward(request, response);
        }
}
