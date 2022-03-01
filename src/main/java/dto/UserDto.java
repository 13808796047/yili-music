package dto;

import lombok.Data;
import vo.RoleVo;

import java.util.List;

@Data
public class UserDto {
    private String id;
    private String username;
    private String nickname;
    private List<RoleVo> roles;
}
