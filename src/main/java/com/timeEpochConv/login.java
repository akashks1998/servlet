package com.timeEpochConv;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class login extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        if(req.getParameter("userName")!=null&& req.getParameter("password")!=null&&req.getParameter("userName").equals("Akash") && req.getParameter("password").equals("pass")){
            HttpSession sess=req.getSession();
            sess.setAttribute("userName",req.getParameter("userName"));
            sess.setAttribute("password",req.getParameter("password"));
            res.sendRedirect("welcome.jsp");
        }else{
            req.setAttribute("errorMessage","Incorrect UserName or Password");
            req.getRequestDispatcher("login.jsp").forward(req,res);
        }
    }
}
