package com.example.spring.repository;


import com.example.spring.enums.GenderEnum;
import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    protected Integer age;

    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

}
