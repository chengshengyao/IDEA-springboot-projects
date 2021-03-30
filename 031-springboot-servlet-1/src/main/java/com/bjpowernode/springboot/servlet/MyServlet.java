package com.bjpowernode.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: IDEA-springboot-projects
 * @Package: com.bjpowernode.springboot.servlet
 * @Description: java类作用描述
 * @Author: 生尧
 * @CreateDate: 2021/2/24 22:22
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2021
 */
@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {
    //重写父类HttpServlet中的 get 与post方法

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("MySpringBoot Servlet-1");
        resp.getWriter().flush();
        resp.getWriter().close();


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
