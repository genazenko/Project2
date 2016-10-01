package by.bsu.zenko.web;


import by.bsu.zenko.model.AppInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/*"}, loadOnStartup = 1)
public class MyServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException
    {
        AppInfo obj = new AppInfo();
        ObjectMapper mapper = new ObjectMapper();
        response.getOutputStream().print(mapper.writeValueAsString(obj));
    }
}