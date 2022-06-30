package com.example.core.collections;

import com.example.spring.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class CollectionTest {
    private List<Integer> primitiveList = List.of(2, 5, 1, 9, 3, 6, 7, 4, 8);
    private List<User> listOfObject = new ArrayList<>();
    private Map<String, Integer> wrapperMap = new HashMap<>();

    @BeforeEach
    public void init() {
        primitiveList = List.of(2, 5, 1, 9, 3, 6, 7, 4, 8);
        wrapperMap.put("Brazil",55);
        wrapperMap.put("US",1);
        wrapperMap.put("Australia",66);
    }
    @Test
    void SortWrapperMap() {


    }

    @Test
    void SortList() {

    }

}
