package com.ronald.demo.dao;

import java.sql.SQLException;
import java.util.Optional;
import java.util.UUID;
import com.ronald.demo.model.Employee;

public interface EmployeeDao {
    int insertEmployee(UUID id, Employee employee) throws SQLException;
}
