package cn.kgc.controller;

import cn.kgc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: yan.
 * @Description:
 * @Date:Created in 2022/5/24 12:11.
 * @Modified By:
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{id}")
    public User getById(@PathVariable("id") Integer id){
        String url = "http://localhost:8080/user/" + id; //这是user-service工程的rest-api接口地址
        User user = restTemplate.getForObject(url,User.class);
        return user;
    }
}
