package com.Transaction.service;


import com.Transaction.entity.Waiter;
import com.Transaction.repository.WaiterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WaiterService {

    @Autowired
    private final WaiterRepository waiterRepository;

    public WaiterService(WaiterRepository waiterRepository){
        this.waiterRepository = waiterRepository;
    }

    public Waiter createWaiters(Waiter waiter){
        return waiterRepository.save(waiter);
    }

    public List<Waiter> getAll(){
        return waiterRepository.findAll();
    }

    public Optional<Waiter> findById(Long id) {
        return waiterRepository.findById(id);
    }

    public Waiter updateWaiter(Waiter waiter) {
        return waiterRepository.updateWaiter(waiter);
    }

    public Waiter updateById(Long id) {
        return waiterRepository.updateById(id);
    }

    public void deleteById(Long id) {
        waiterRepository.deleteById(id);
    }

    public void delete(Waiter waiter) {
        waiterRepository.delete(waiter);
    }
}
