package com.example.core.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.scheduling.support.SimpleTriggerContext;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {


    private HashMap<String, Integer> map = new HashMap<>();

    @BeforeEach
    private void init() {
        map.put("hello", 1);
        map.put("Brazil", 4);
        map.put("Brazil", 400);
        map.put("Chile", 3);
        map.put("France", 3);
        map.put("Argentina", 2);
        map.put("Germany", 5);
    }


    @Test
    public void NotExistentKeyShouldReturnNull() {

        assertNull(map.get("not-existent-key"));
    }

    @Test
    public void verifyIfKeyExist() {

        assertTrue(map.containsKey("hello"));
    }



    @Test
    public void cantModifyMapWhileInLoop() {

        Exception exception = assertThrows(ConcurrentModificationException.class, () -> {
            for (String country : map.keySet()) {
                if (country.equalsIgnoreCase("Brazil")) {
                    map.remove(country);
                }
            }
        });

        assertTrue(exception instanceof ConcurrentModificationException);

    }

    @Test
    //Entry is a object that represents both key and value
    public void IterateUsingEntryForach() {


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }

        map.forEach((key, value) -> System.out.println(key));
    }


    @Test
    public void sortMapByKeyUsingStreamReversed() {
        var newMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())) // sort
                .collect(Collectors.toMap( // collect
                        Map.Entry::getKey, Map.Entry::getValue, (old, newValue) -> newValue, LinkedHashMap::new
                ));
        newMap.forEach((key, value) -> System.out.println(key + ", " + value));


    }

    @Test
    public void sortMapByValueUsingStreamReversed() {
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (newValue, old) -> old, LinkedHashMap::new));
    }
}
