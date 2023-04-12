package com.example.spring.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum GenderEnum {
    MASCULINE("masculine", 1),
    FEMININE("feminine", 2);
    private String description;
    private Integer value;

    private static final Map<Integer, GenderEnum> genders = new HashMap<>();

    static {
        for (GenderEnum gender : GenderEnum.values()) {
            genders.put(gender.getValue(), gender);
        }
    }


    public static GenderEnum getByValue(Integer value) {
        return genders.get(value);
    }

}
