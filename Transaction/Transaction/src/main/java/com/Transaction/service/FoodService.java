package com.Transaction.service;


import com.Transaction.entity.Food;
import com.Transaction.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    public Food createFood(Food food){
        return foodRepository.save(food);
    }

    public List<Food> getAll(){
        return foodRepository.findAll();
    }

    public Food update(Food food) {
        return foodRepository.update(food);
    }

    public Food updateFood(Food food) {
        return foodRepository.update(food);
    }

    public Optional<Food> findByName(String name) {
        return foodRepository.findByName(name);
    }

    public void deleteById(Long id) {
        foodRepository.deleteById(id);
    }

    public void delete(Food food) {
        foodRepository.delete(food);
    }
}
