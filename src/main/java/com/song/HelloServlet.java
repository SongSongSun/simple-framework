package com.song;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author Song
 * @Date 2020/7/7 16:29
 * @Version 1.0
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private Logger log = LoggerFactory.getLogger(HelloServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "我的简易框架";
        req.setAttribute("name", name);
        log.info("name is " + name);
        req.getRequestDispatcher("WEB-INF/hello.jsp").forward(req, resp);
    }
}
