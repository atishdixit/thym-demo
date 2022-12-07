package com.extellon.one.domain;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
    private String city;
    private boolean isActive;
    private String role;
    private String gender;
}
