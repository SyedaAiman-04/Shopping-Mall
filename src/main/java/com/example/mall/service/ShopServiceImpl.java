package com.example.mall.service;

import com.example.mall.model.Shop;
import com.example.mall.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopServiceImpl implements ShopService {

    private final ShopRepository repository;

    public ShopServiceImpl(ShopRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Shop> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Shop> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Shop save(Shop shop) {
        return repository.save(shop);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
