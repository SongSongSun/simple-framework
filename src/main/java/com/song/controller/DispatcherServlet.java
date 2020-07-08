package com.song.controller;

import com.song.controller.frontend.MainPageController;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Song
 * @Date 2020/7/8 15:42
 * @Version 1.0
 * @Description
 */
@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("request path is " + req.getServletPath());
        System.out.println("request method is " + req.getMethod());
        if (req.getServletPath() == "/frontend/getmainpageinfo" && req.getMethod() == "GET") {
            new MainPageController().getMainPageInfo(req, resp);
        }
    }
}
