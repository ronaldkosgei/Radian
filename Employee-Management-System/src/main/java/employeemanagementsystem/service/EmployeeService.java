package employeemanagementsystem.service;

import employeemanagementsystem.entity.Employee;
import employeemanagementsystem.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {

    private  final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll(Employee employee) {
        return employeeRepository.findAll(employee);
    }
}
