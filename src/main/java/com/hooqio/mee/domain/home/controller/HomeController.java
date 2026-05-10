package com.hooqio.mee.domain.home.controller;

import com.hooqio.mee.common.ApiResponse;
import com.hooqio.mee.domain.home.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/home")
    public ApiResponse<String> home() {
        return ApiResponse.ok(homeService.getWelcomMessage());
    }
}
