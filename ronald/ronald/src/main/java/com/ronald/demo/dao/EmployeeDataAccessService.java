package com.ronald.demo.dao;

import com.ronald.demo.model.Employee;
import org.flywaydb.core.internal.jdbc.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.UUID;

@Repository("postgres")
public class EmployeeDataAccessService implements EmployeeDao {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
        public int insertEmployee (UUID id, Employee employee) throws SQLException {
            final String sql = "INSERT INTO employee values(?,?)";
            jdbcTemplate.update(sql,id,employee.getName());
            jdbcTemplate.update(sql, id, employee.getEmailAddress());
            jdbcTemplate.update(sql, id, employee.getNationality());
            jdbcTemplate.update(sql, id, employee.getPhoneNo());
            jdbcTemplate.update(sql, id, employee.getCity());
            return 1;
    }
//    @Override
//    public List<Optional> selectAllPeople(id,Employee employee){
//
//            final String sql ="SELECT id, name, emailAddres, nationality,phoneNo, city, FROM employee";
//            return jdbcTemplate.query(
//                    sql,
//                    (resultSet, i) -> {
//                        UUID id = UUID.fromString(resultSet.getString("id"));
//                        String name = resultSet.getString("name");
//                        String emailAddress = resultSet.getString("emailAddress");
//                        String nationality = resultSet.getString("nationality");
//                        int phoneNo = resultSet.getInt("phoneNo");
//                        String city = resultSet.getString("city");
//                        return new Employee(id,name,emailAddress,nationality,phoneNo,city);
//                    });
//    }





//    @Override
//    public Optional<Person> selectPersonById(UUID id) {
//        final String sql = "SELECT id, name FROM person Where id = ?";
//
//        Person person = jdbcTemplate.queryForObject(
//                sql,
//                new Object[]{id},
//                (resultSet, i) -> {
//                    UUID personId = UUID.fromString(resultSet.getString("id"));
//                    String name = resultSet.getString("name");
//                    return new Person(personId,name);
//                });
//        return Optional.ofNullable(person);
//    }
//
//    public Optional<Employee> selectEmployeeById(UUID id){
//
//            final String sql = "SELECT id, name,emailAddress, nationality, phoneNo, city FROM employee Where id = ?";
//
//            Employee employee = jdbcTemplate.query(
//                    sql,
//                    new Object[]{id},
//                    (resultSet, i) -> {
//                        UUID personId = UUID.fromString(resultSet.getString("id"));
//                        String name = resultSet.getString("name");
//                        String emailAddress = resultSet.getString("emailAddress");
//                        String nationality = resultSet.getString("nationality");
//                        int phoneNo = resultSet.getInt("phoneNo");
//                        String city = resultSet.getString("city");
//                        return new Employee(employeeId,name,emailAddress,nationality,phoneNo,city);
//                    });
//            return Optional.ofNullable(employee);
//
//    }

//    @Override
//    public List<Optional>deleteEmployeeById(UUID id){
//        return 0;
//    }
//
//    @Override
//    public int updateEmployeeById(Employee employee) {
//        return Employee.insertEmployee(employee);
//    }
}
