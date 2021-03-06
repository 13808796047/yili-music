package com.example.yilimusic.dto;

import com.example.yilimusic.vo.RoleVo;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private String id;
    private String username;
    private String nickname;
    private List<RoleVo> roles;
}
