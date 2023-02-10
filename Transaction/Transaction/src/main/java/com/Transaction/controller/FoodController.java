package com.Transaction.controller;


import com.Transaction.entity.Food;
import com.Transaction.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private final FoodService foodService;

    public FoodController(FoodService foodService){
        this.foodService = foodService;
    }

    @PostMapping
    public Food addFood(@RequestBody Food food){
        return foodService.createFood(food);
    }

    @GetMapping("list")
    public List<Food> getAllFood(){
        return foodService.getAll();
    }

    @PutMapping
    public Food addfood(@RequestBody Food food){
        return foodService.update(food);
    }

    @PatchMapping
    public Food updateFood(@RequestBody Food food){
        return foodService.updateFood(food);
    }

    @GetMapping("foods")
    public Optional<Food> findFoodByName(@PathVariable String name){
        return foodService.findByName(name);
    }

    @DeleteMapping("food")
    public void deleteFoodById(@RequestParam("id") Long id){
        foodService.deleteById(id);
    }

    @DeleteMapping("foods")
    public void deleteFood(@RequestBody Food food){
        foodService.delete(food);
    }
}
