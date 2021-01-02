package com.fofana23.rest.service;

import com.fofana23.rest.model.AccountHolder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RestServiceTest {

    @Autowired
    RestService service;

    @BeforeEach
    void setUp() {
    }

    @Test
    void postRequest() {
        AccountHolder holder = new AccountHolder();
        holder.setEmail("afof@rocketmail");
        holder.setPassword("alfof");
        AccountHolder result = service.postRequest(holder);
        assertEquals("234", result.getAddress());
    }
}