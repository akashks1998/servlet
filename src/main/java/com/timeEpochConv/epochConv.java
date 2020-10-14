package com.timeEpochConv;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class epochConv  extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        System.out.println(req.getParameter("sec"));
        long time=Long.parseLong(req.getParameter("sec"));
        Date t = new Date(time);
        req.setAttribute("time","Time:"+t);
        req.getRequestDispatcher("welcome.jsp").forward(req,res);

    }
}
