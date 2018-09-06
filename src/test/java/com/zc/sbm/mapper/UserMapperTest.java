package com.zc.sbm.mapper;

import com.zc.sbm.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper mapper;

    @Test
    public void findById() {
        int i=1;
        User user=mapper.findById(1);
        Assert.assertNotNull(user);

    }
}