package com.example.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//若不使用注解，必须实现此接口
public class XmlRequestController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //创建需要返回的对象
        ModelAndView mv = new ModelAndView();
        //设置需要跳转的页面名称
        mv.setViewName("halo");
        //向页面添加属性值
        mv.addObject("user","Halo,SpringMVC");
        return mv;
    }
}
