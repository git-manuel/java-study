package com.example.spring;

import com.example.spring.repository.User;
import com.example.spring.enums.GenderEnum;
import com.example.spring.repository.UserRepository;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@Slf4j
public class Initializer implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Persisting User ............");
        Faker faker = new Faker(new Locale("pt-BR"));

        for (int i = 0; i < 10; i++) {
            var user = User.builder()
                    .age(faker.number().numberBetween(10, 99))
                    .name(faker.name().fullName())
                    .gender(GenderEnum.getByValue(faker.number().numberBetween(1, 3)))
                    .build();
            userRepository.save(user);
        }
    }
}
