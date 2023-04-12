package com.example.spring.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderEnumTest {

    @Test
    public void shouldSerializeTheEnumConstantName() throws JsonProcessingException {
        String result = new ObjectMapper()
                .writeValueAsString(GenderEnum.MASCULINE);
        assertEquals(result, "MASCULINE");

    }

    @Test
    public void valueOfShouldReturnSpecifiedEnumConstant() {

        assertEquals(GenderEnum.valueOf("MASCULINE"),GenderEnum.MASCULINE);
        System.out.println(GenderEnum.valueOf("MASCULINE"));

    }

}