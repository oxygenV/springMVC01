package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * springmvc处理流程
 * 1、发送请求---2、tomcat接受请求---3、DispatcherServlet---4、controller
 * ---5、@RequestMapping进行地址匹配---6、返回前端页面名称
 * ---7、解析器根据名称找到对应jsp页面---8、DispatcherServlet返回
 *
 *
 * @RequestMapping 可用于方法、类
 *   放在类上：给所有方法前加一层路径 http://localhost:8080/springmvc_war_exploded/apple/hello
 *   - 什么时候应该放在类上？ 当类下有多个请求
 *
 * @RequestMapping属性详解
 *  value 请求地址
 *  method 请求方法
 *  params 限制请求参数 例如 params = {"username","age"} 也可精准匹配 params = {"zhangsan","age"} 不包含的params = {"!zhangsan"}
 *  headers 限制请求头 headers={"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,"} 那些浏览器可以访问
 *  consumes 只接受内容类型是哪种的请求，相当于限制Content-Type
 *  produces  返回的内容类型 Content-Type：text/html;charset=utf-8
 *
 *  @RequestMapping 可以模糊匹配
 *   ？ 代表模糊匹配一个字符
 *   *  代表模糊匹配多个字符
 *   **  替代多层路径
 *
 */
@RequestMapping(value = "/apple*",params = {"!zhangsan"})
@Controller
public class RequestMappingController {

    //@RequestMapping 此注解匹配请求
    @RequestMapping("/hello")
    public String hello(Map<String,String> map){
        map.put("hello","hello world");
        //返回的前台页面
        return "hello";
    }

}
