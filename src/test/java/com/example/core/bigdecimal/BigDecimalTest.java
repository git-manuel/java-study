package com.example.core.bigdecimal;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BigDecimalTest {

    @Test
    public void subTract(){

        var one = BigDecimal.ONE;

        one.subtract(BigDecimal.ONE);

        System.out.println(one);

    }
}
