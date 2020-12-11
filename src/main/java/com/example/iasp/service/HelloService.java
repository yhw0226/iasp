package com.example.iasp.service;

import com.example.iasp.entity.User;

/**
 * @Auther: Y.H.W
 * @Date: 2020/12/11 21:02
 * @Description: com.example.iasp.service
 */
public interface HelloService {
    /**
     * @param id
     * @return
     */
    User queryUserById(Integer id);
}
