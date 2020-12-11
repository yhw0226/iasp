package com.example.iasp.controller;

import com.example.iasp.entity.User;
import com.example.iasp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: Y.H.W
 * @Date: 2020/12/11 20:54
 * @Description: com.example.iasp.controller
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/index")
    public String index(){
        return "服务正常启动";
    }
    @RequestMapping(value = "/queryUserById/{id}",method = RequestMethod.GET)
    public User queryUserById(@PathVariable("id") Integer id){
        for(int i=0;i<id;i++){
            System.out.println(i);
        }
        return helloService.queryUserById(id);
    }
}
