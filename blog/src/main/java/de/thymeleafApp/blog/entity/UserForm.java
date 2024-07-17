package de.thymeleafApp.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {
    private String id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String address;
    private Boolean married;
    private String profession;

}
