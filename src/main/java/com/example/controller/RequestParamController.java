package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * RequestParam PathVariable 区别
 * 本质上 PathVariable接收url中参数   http://localhost:8080/firstweb/method/namezhangsan
 *       RequestParam 接收请求参数   http://localhost:8080/firstweb/method/?name=zhangsan
 *  @AliasFor 代表作用相同
 *
 *   RequestParam 参数
 *   required 表示当前属性必须存在(人话：前台一定要传一个这样的值过来),false 传不传都行，true默认的 必须传递
 *   defaultValue 如果前台没有传递参数过来，默认使用这个值
 *
 */
@Controller
public class RequestParamController {

    //方法参数中的参数名必须与前台提交的属性名相同，否则获取的值为null
    @RequestMapping(value = "/request")
    public String testRequest(String name){
        System.out.println(name);
        return "hello";
    }

    //eg:前台提交的为username,后台为name  使用@RequestParam("前台传递的参数名")
    @RequestMapping(value = "/request2")
    public String testRequest2(@RequestParam(value = "username",required = false,defaultValue = "admin") String name){
        System.out.println(name);
        return "hello";
    }

    //获取请求头信息(此处获取了请求头浏览器信息，前台k为User-Agent，所以起别名，区分格式)
    @RequestMapping(path = "/request3")
    public String getHead(@RequestHeader("User-Agent") String userAgent ){
        System.out.println(userAgent);
        return "hello";
    }
    //获取cookie信息(此处获取了cookie中k为JSESSIONID的值,区分大小写)
    @RequestMapping(path = "/request4")
    public String getCookie(@CookieValue("JSESSIONID") String jessionid ){
        System.out.println(jessionid);
        return "hello";
    }



}
