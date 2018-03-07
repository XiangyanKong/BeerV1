package com.example.web;

import com.example.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by kongxy on 2018/3/6 0006.
 */
public class BeerSelect extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//        out.println("beer selection advice<br>");

        String c = req.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);

//      为请求对象增加一个属性，供jsp使用。jsp要寻找styles
        req.setAttribute("styles",result);
//      为jsp实例化一个请求分派器
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
//        使用请求分派器要求容器准备好jsp，并想窘迫发送请求和响应
        view.forward(req,resp);
//        Iterator it = result.iterator();
//        while (it.hasNext()) {
//            out.print("<br>try: "+ it.next());
//        }
    }
}