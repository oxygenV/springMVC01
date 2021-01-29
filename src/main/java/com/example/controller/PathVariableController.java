package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PathVariable 可以获取请求路径中的值
 *
 * 如果{}中的值和参数列表值不同，可通过@PathVariable添加别名进行映射
 * @RequestMapping(value ="/pathVariable/{id}"
 * (也可给参数起别名) @PathVariable("id") String name
 *
 *
 *
 */
@Controller
public class PathVariableController {

    @RequestMapping(value ="/pathVariable/{name}/{id}")
    public String PathVariable(@PathVariable("name") String name,
                               @PathVariable("id") Integer id){
        System.out.println(name);
        System.out.println(id);
        return "hello";
    }

}
