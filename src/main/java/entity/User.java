package entity;

import enums.Gender;
import lombok.Data;

@Data
public class User {
    private String Name;
    private Integer age;
    private Gender gender;

}
