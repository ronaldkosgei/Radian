package employeemanagementsystem.repository;

import employeemanagementsystem.entity.Employee;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Long, Id> {
    List<Employee> findAll(Employee employee);
}
