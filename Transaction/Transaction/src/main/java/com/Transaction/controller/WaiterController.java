package com.Transaction.controller;

import com.Transaction.entity.Waiter;
import com.Transaction.service.WaiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("waiter")
public class WaiterController {

    @Autowired
    private final WaiterService waiterService;

    public WaiterController(WaiterService waiterService){
        this.waiterService = waiterService;
    }

    @PostMapping
    public Waiter addWaiters(@RequestBody Waiter waiter){
        return waiterService.createWaiters(waiter);
    }

    @GetMapping("list")
    public List<Waiter> getAllWaiters(){
        return waiterService.getAll();
    }

    @GetMapping("waiter")
    public Optional<Waiter> findWaiterById(@PathVariable Long id){
        return waiterService.findById(id);
    }

    @PutMapping
    public Waiter addWaiter(@RequestBody Waiter waiter){
        return waiterService.updateWaiter(waiter);
    }

    @PatchMapping
    public Waiter updateWaiterById(@PathVariable Long id){
        return waiterService.updateById(id);
    }

    @DeleteMapping("waiter")
    public void deleteWaiterById(@RequestParam("id") Long id){
        waiterService.deleteById(id);
    }

    @DeleteMapping("waiters")
    public void deleteWaiters(@RequestBody Waiter waiter){
        waiterService.delete(waiter);
    }
}
