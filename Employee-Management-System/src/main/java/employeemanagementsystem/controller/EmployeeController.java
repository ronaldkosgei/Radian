package employeemanagementsystem.controller;

import employeemanagementsystem.entity.Employee;
import employeemanagementsystem.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService){
        this.employeeService =employeeService;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping
    public List<Employee>findAll(Employee employee){
        return employeeService.findAll(employee);
    }
}