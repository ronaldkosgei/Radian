package com.practice.api;


import com.practice.entity.Shop;
import com.practice.service.ShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shops")
public class ShopController {

    private final ShopService shopService;

    public ShopController(ShopService shopService){
        this.shopService = shopService;
    }

     @PostMapping
    public Shop addShop(@RequestBody Shop shop){
        return shopService.createShop(shop);
     }

     @GetMapping
    public List<Shop> getAllShops(){
        return shopService.getAll();
     }

    @GetMapping("mark/{date}")
    public Optional<Shop> getAllShopsByDate(@PathVariable("id") Long id) {
        return shopService.findById(id);
    }

     @GetMapping("sales")
    public List<Shop> getAllShopsByDailySales(@RequestParam("dailySales")double dailySales){
        return shopService.getAll();
     }

     @GetMapping("buy/{monthlySales}")
    public List<Shop> getAllShopsByDate(@PathVariable("monthlySales")double monthlySales){
        return shopService.getAll();
     }

     @DeleteMapping("delete/{id}")
    public void deleteAllShopsById(@PathVariable("id")Long id){
             shopService.deleteById(id);
    }

    @PatchMapping
    public Shop updateShop(@RequestBody Shop shop){
       return shopService.update(shop);
    }

    @PutMapping
    public Shop addUserByAdmission(@RequestBody Shop shop ){
      return shopService.update(shop);
    }
}
