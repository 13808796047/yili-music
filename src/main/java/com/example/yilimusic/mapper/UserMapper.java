package com.example.yilimusic.mapper;

import com.example.yilimusic.entity.User;
import dto.UserDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import vo.UserVo;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);
}
