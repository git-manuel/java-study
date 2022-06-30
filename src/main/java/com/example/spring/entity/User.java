package com.example.spring.entity;


import com.example.spring.enums.GenderEnum;
import lombok.Data;

@Data
public class User {
    private String Name;
    private Integer age;
    private GenderEnum gender;

}
