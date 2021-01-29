package com.example.controller;

import com.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ObjectController {
    /**
     * 接收的参数有乱码问题？
     * 1、自己编写过滤器
     * post请求：设置request response编码格式
     * get请求：tomcat---server.xml添加 URIEncoding=utf-8
     *
     * 如果配置了多个过滤器，字符编码过滤器应置顶，保证优先执行
     *
     * 2、使用springmvc过滤器---web.xml
     *
     *
     */
    //前台页面提交的参数列表封装为对象进行接收
    @RequestMapping("/user")
    public String getObj(User user){
        System.out.println(user.toString());
        return "hello";
    }

    //SpringMVC支持原生Servlet
    @RequestMapping("/api")
    public String getByServlet(HttpServletRequest request,
                               HttpServletResponse response,
                               HttpSession session){
        return "hello";
    }
}
