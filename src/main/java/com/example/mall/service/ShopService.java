package com.example.mall.service;

import com.example.mall.model.Shop;

import java.util.List;
import java.util.Optional;

public interface ShopService {
    List<Shop> findAll();
    Optional<Shop> findById(Long id);
    Shop save(Shop shop);
    void deleteById(Long id);
}
