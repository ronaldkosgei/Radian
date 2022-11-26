package com.practice.service;

import com.practice.entity.Shop;
import com.practice.repository.ShopRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }


    public Shop createShop(Shop shop){
        return shopRepository.save(shop);
    }

    public List<Shop> getAll(){
        return shopRepository.findAll();
    }

    public Optional<Shop> findById(Long id){
        return shopRepository.findById(id);
    }

    public void deleteById(Long id){
        shopRepository.deleteById(id);
    }

    public Shop update(Shop shop){
        return shopRepository.save(shop);
    }

}
