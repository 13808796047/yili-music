package com.example.yilimusic.entity;

import com.example.yilimusic.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class User extends BaseEntity {
    @Column(unique = true)
    private String username;
    private String nickname;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;

    private String password;

    @Enumerated(EnumType.STRING) // 枚举为String为FAMALE,MALE,UNKNOWN
    private Gender gender;

    private Boolean locked = false;

    private Boolean enabled = true;

    private String lastLoginIp;

    private Date lastLoginTime;

}
