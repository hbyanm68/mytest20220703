package cn.kgc.service.imp;

import cn.kgc.mapper.UserMapper;
import cn.kgc.pojo.User;
import cn.kgc.service.Uservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yan.
 * @Description:
 * @Date:Created in 2022/5/24 12:05.
 * @Modified By:
 */
@Service
public class UserviceImpl implements Uservice {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
