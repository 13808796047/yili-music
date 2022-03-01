package com.example.yilimusic.repository;

import com.example.yilimusic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User getByUsername(String username);
}
