package com.extellon.one.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserForm {
    private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String address;
    private boolean married;
    private String profession;
}
