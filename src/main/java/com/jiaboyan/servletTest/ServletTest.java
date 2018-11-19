package com.jiaboyan.servletTest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by jiaboyan on 2017/3/14.
 */
public class ServletTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

        String response = req.getParameter("response");

        //商户密钥：
        String key = "商户密钥";

        //返回参数：
//        Map map = YopClient.acceptNotificationAsMap(key,response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

        String response = req.getParameter("response");

        //商户密钥：
        String key = "商户密钥";

        //返回参数：
//        Map map = YopClient.acceptNotificationAsMap(key,response);

    }

}
