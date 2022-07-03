package cn.kgc;

import cn.kgc.mapper.UserMapper;
import cn.kgc.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserServiceApplicationTests {
    @Autowired(required = false)
    private UserMapper userMapper;
    @Test
    public void testFindAll() {
        List<User> list = userMapper.selectAll();
        list.forEach(u->{
            System.out.println(u);
        });
    }

}
