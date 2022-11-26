package com.ronald.demo.api;

import com.ronald.demo.model.Employee;
import com.ronald.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;


@RequestMapping("api/v1/employee")
@RestController
class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee employee) throws SQLException {
        employeeService.addEmployee(employee);
    }
//
//    @GetMapping
//    public List<Employee> getAllEmployees(){
//        return employeeService.getAllEmployees();
//    }
//
//    @GetMapping(path = "{id}")
//    public Employee getEmployeeById(@PathVariable("id") UUID id){
//        return employeeService.getEmployeeById(id)
//                .orElse(null);
//    }
//    @DeleteMapping(path = "{id}")
//    public void deleteEmployeeById(@PathVariable("id") UUID id){
//        employeeService.deleteEmployee(id);
//    }
//    @PutMapping(path = "{id}")
//    public void updateEmployeeById(@PathVariable("id")UUID id,@Valid @NotNull @RequestBody Employee employeeToUpdateToUpdate){
//        employeeService.updateEmployee(id, employeeToUpdate);
//    }
}
