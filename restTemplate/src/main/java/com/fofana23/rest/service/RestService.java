package com.fofana23.rest.service;

import com.fofana23.rest.model.AccountHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



    @Service
    public class RestService {

        @Value("${loginUrl}")
        public String loginUrl;

        @Autowired
        RestTemplate restTemplate;

        public AccountHolder postRequest(AccountHolder holder){
            holder.setEmail("afof@rocketmail.com");
            holder.setPassword("alfof");

           return restTemplate.postForObject(loginUrl, holder, AccountHolder.class);
        }
    }

