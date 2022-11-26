package com.jpadatabaseDemoApplication.repository;


import com.jpadatabaseDemoApplication.Entity.Employee;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeejpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Employee> findAll(){
       TypedQuery<Employee> namedQuery = entityManager.createNamedQuery("find_all_employees", Employee.class);
       return namedQuery.getResultList();
    }

    public Employee findById(long id){
        return entityManager.find(Employee.class,id);
    }

    public Employee update(Employee employee){
        return entityManager.merge(employee);
    }

    public Employee insert(Employee employee){
        return entityManager.merge(employee);
    }

    public void deleteById(long id) {
        Employee employee = findById(id);
        entityManager.remove(employee);
    }
}
