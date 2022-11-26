package com.ronald.demo.service;

import com.ronald.demo.dao.EmployeeDao;
import com.ronald.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.UUID;

@Service
public class EmployeeService {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(@Qualifier("postgres")EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

//    public List<Employee> getAllEmployees() {
//        return employeeDao.selectAllEmployees();
//    }
//    public List<Employee> deleteEmployeeById() {
//        return employeeDaoDao.selectAllEmployees();
//    }
    public void addEmployee(Employee employee) throws SQLException {
        UUID id = UUID.randomUUID();
        employeeDao.insertEmployee(id, employee);
    }
//    public int updatePerson(UUID id, Employee newemployee) {
//        Optional<Integer> value = employeeDao.updateEmployeeById(id, newemployee);
//        return value.orElse(0);
//    }
}