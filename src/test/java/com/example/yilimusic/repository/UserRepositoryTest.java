package com.example.yilimusic.repository;

import com.example.yilimusic.entity.User;
import com.example.yilimusic.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository repository;

    @Test
    void getByUsername() {
        User user = new User();
        user.setNickname("程序员依力");
        user.setUsername("依力");
        user.setEnabled(true);
        user.setLocked(false);
        user.setPassword("123456");
        user.setGender(Gender.FEMALE);
        user.setLastLoginIp("127.0.0.1");
        user.setLastLoginTime(new Date());
        User savedUser = repository.save(user);
        System.out.println(savedUser);
    }
}