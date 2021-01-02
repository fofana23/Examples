package com.fofana23.rest.service;

import com.fofana23.rest.model.AccountHolder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RestServiceMockTest {

    @Mock
    RestTemplate restTemplate;

    @InjectMocks
    RestService service;

    AccountHolder holder = new AccountHolder();

    @BeforeEach
    void setUp() {
        holder.setEmail("afof@rocketmail.com");
        holder.setPassword("alfof");
        service.loginUrl ="http://localhost:8080/api/v1/login";
    }

    @Test
    void postRequest() {
            AccountHolder holder= new AccountHolder();
            holder.setEmail("afof@rocketmail.com");
            holder.setPassword("alfof");
            Mockito.when(restTemplate.postForObject(service.loginUrl, holder, AccountHolder.class)).thenReturn(holder);
            AccountHolder result = service.postRequest(holder);
    }
}