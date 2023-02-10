package com.Transaction.repository;


import com.Transaction.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    default Food update(Food food) {
        return null;
    }

    default Optional<Food> findByName(String name) {
        return null;
    }
}
