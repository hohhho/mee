package com.hooqio.mee.domain.home.service;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService{

    @Override
    public String getWelcomMessage() {
        return "Hello!";
    }
}
