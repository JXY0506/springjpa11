package com.offcn;

import com.offcn.entity.User;
import com.offcn.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloConfig.class)
public class JunitTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01(){
        List<User> user = userMapper.getUser();
        System.out.println(user);
    }

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis(){
        redisTemplate.opsForValue().set("name","lb is dog");
        String name = (String) redisTemplate.opsForValue().get("name");
        System.out.println(name);

        User user = new User(1,"qq",22);
        redisTemplate.opsForValue().set("user",user);
        User user1 = (User) redisTemplate.opsForValue().get("user");
        System.out.println(user1);
    }
}
