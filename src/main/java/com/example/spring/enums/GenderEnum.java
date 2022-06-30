package com.example.spring.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderEnum {
    MASCULINE("masculine",1),
    FEMININE("feminine",2);
    private String description;
    private int id;
}
