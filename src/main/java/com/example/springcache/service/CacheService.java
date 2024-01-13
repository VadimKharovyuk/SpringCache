package com.example.springcache.service;

import com.example.springcache.Dao;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
    private final Dao dao;

    public CacheService(Dao dao) {
        this.dao = dao;
    }
    @Cacheable("data")
    public String getData(){
        return dao.getData();
    }
    @CachePut("data")
    public String update(){
        return dao.getData();
    }
    @CacheEvict("data")   //delete Кэш
    public void  evict(){

    }
}
