package com.practice.repository;

import com.practice.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ShopRepository extends JpaRepository<Shop,Long> {

    List<Shop> findByDailySales(String dailySales);

    List<Shop> findByDate(String date);
}
