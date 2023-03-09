package leoaldamas.dev.storemanagementsystem.controller;

import static leoaldamas.dev.storemanagementsystem.db.Query.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.http.HttpSession;
import leoaldamas.dev.storemanagementsystem.db.ConnectionDB;
import leoaldamas.dev.storemanagementsystem.model.User;
import leoaldamas.dev.storemanagementsystem.service.impl.ILoginImpl;

import java.io.IOException;

@WebServlet(value = "/login")
public class LogInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // From login get username and password
        // and the type of our user.
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String type = req.getParameter("type_user");

        // Create a new user with the information we obtained.
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        // Create connection to the database.
        ConnectionDB connection = new ConnectionDB();

        // Validation user.
        ILoginImpl iLogin = new ILoginImpl(connection);
        User login = getUserType(type, user, iLogin);

        // Close connection.
        connection.close();

        // Check if the user is different from null.
        if (login != null) {
            // Create an attribute at session scope.
            HttpSession userSession = req.getSession();
            userSession.setAttribute("userLogin", login);

            // Redirect users to their page.
            redirectUser(type, req, resp);
        } else {
            resp.sendRedirect("index.jsp");
        }

    }

    private User getUserType(String type, User user, ILoginImpl iLogin) {
        return switch (type) {
            case "ADMIN" -> iLogin.validate(user, LOGIN_ADMINISTRATOR_USER.getQuery());
            case "STORE" -> iLogin.validate(user, LOGIN_STORE_USER.getQuery());
            case "SUPERVISOR" -> iLogin.validate(user, LOGIN_SUPERVISOR_USER.getQuery());
            case "WAREHOUSE" -> iLogin.validate(user, LOGIN_WAREHOUSE_USER.getQuery());
            default -> null;
        };
    }

    private void redirectUser(String type, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        switch (type) {
            case "ADMIN" -> resp.sendRedirect("views/user/administrator.jsp");
            case "STORE" -> resp.sendRedirect("views/store/normal-store.jsp");
            case "SUPERVISOR" -> resp.sendRedirect("views/user/supervisor.jsp");
            case "WAREHOUSE" -> resp.sendRedirect("views/user/warehouse.jsp");
        }
    }
}
