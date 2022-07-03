package cn.kgc.controller;

import cn.kgc.pojo.User;
import cn.kgc.service.Uservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yan.
 * @Description:
 * @Date:Created in 2022/5/24 12:06.
 * @Modified By:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired(required = false)
    private Uservice uservice;

    @RequestMapping("/{id}")
    public User getByid(@PathVariable("id") Integer id){
        return uservice.getUserById(id);
    }
}
