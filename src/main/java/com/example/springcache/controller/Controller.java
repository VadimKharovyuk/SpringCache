package com.example.springcache.controller;

import com.example.springcache.service.CacheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final CacheService cacheService ;

    public Controller(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    @GetMapping("/")
    public String getData(){
        return cacheService.getData();
    }
    @GetMapping("/update")
    public String update(){
        return cacheService.update();
    }
    @GetMapping("/evict")
    public void evict(){
        cacheService.evict();
    }
}
