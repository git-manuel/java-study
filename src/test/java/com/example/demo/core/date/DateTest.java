package com.example.demo.core.date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

public class DateTest {

    @Test
    public  void test(){
        var now = LocalDate.now(ZoneId.of("America/Sao_Paulo")).minusMonths(4);
      var dt = LocalDate.parse("2020-02-13");
        System.out.println(now.with(TemporalAdjusters.lastDayOfMonth()));


    }


}
