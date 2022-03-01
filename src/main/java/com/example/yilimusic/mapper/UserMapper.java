package com.example.yilimusic.mapper;

import com.example.yilimusic.dto.UserDto;
import com.example.yilimusic.entity.User;
import com.example.yilimusic.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);
}
