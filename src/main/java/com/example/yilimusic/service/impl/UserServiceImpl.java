package com.example.yilimusic.service.impl;

import com.example.yilimusic.dto.UserDto;
import com.example.yilimusic.mapper.UserMapper;
import com.example.yilimusic.repository.UserRepository;
import com.example.yilimusic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    UserRepository repository;
    UserMapper mapper;

    @Override
    public List<UserDto> list() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }
}
