package com.timeEpochConv;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class timeConv extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String s=req.getParameter("time");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd'T'HH:mm");
        try {
            req.setAttribute("epoch","Epoch:"+df.parse(s).getTime());
            req.getRequestDispatcher("welcome.jsp").forward(req,res);
        } catch (ParseException | ServletException e) {
            e.printStackTrace();
        }
    }
}
