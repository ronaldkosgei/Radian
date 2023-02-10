package com.Transaction.repository;


import com.Transaction.entity.Waiter;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface WaiterRepository extends JpaRepository<Waiter, Long> {

    default Waiter updateById(Long id) {
        return null;
    }

    default Waiter updateWaiter(Waiter waiter) {
        return null;
    }
}
