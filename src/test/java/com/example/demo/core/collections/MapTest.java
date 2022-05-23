package com.example.demo.core.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MapTest {


    private HashMap<String, Integer> map = new HashMap<>();

    @BeforeEach
    private void init (){
        map.put("hello",1);
    }

    @Test
    public void NotExistentKeyShouldReturnNull(){

        assertNull(map.get("not-existent-key"));
    }
}
