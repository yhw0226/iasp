package com.example.iasp.service.impl;

import com.example.iasp.entity.User;
import com.example.iasp.service.HelloService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Y.H.W
 * @Date: 2020/12/11 21:05
 * @Description: com.example.iasp.service.impl
 */
@Service
public class HelloServiceImpl implements HelloService {

    private List<User> users = Arrays.asList(new User(1,"张三",10),
                                        new User(2,"张三",10),
                                        new User(3,"张三",10));

    @Override
    public User queryUserById(Integer id) {
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
