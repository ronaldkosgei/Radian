package com.jdbcdatabaseDemoApplication.repository;


import com.jdbcdatabaseDemoApplication.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PersonDaoJdbc {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRowMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getLong("id"));
            person.setFirstName(rs.getString("first_name"));
            person.setLastName(rs.getString("last_name"));
            person.setLocation(rs.getString("location"));
            person.setBirth_date(rs.getString("birth_date"));
            return person;
        }
    }

    public List<Person> findAll(){
      return jdbcTemplate.query("select * from person",
               new BeanPropertyRowMapper<>(Person.class));
    }

    public Person findById(long id){
        return jdbcTemplate.queryForObject(
                "select * from person where id=?",new Object[]{id},
                new BeanPropertyRowMapper<>(Person.class));
    }

    public Person findByFirstName(String firstName){
        return jdbcTemplate.queryForObject(
                "select * from person where firstName=?",new Object[]{firstName},
                new BeanPropertyRowMapper<>(Person.class));
    }

    public int deleteById(long id) {
        return jdbcTemplate.update(
                "delete from person where id=?",
                id);
    }

    public int insert(Person person) {
        return jdbcTemplate.update(
                "insert into person(id, first_name, last_name, location, birth_date)"
                        + "values(?, ?, ?, ?, ?)",
                person.getId(),
                person.getFirstName(),
                person.getLastName(),
                person.getLocation(),
                person.getBirth_date());
    }

    public int update(Person person) {
        return jdbcTemplate.update(
                "update  person "
                        + "set first_name = ?, last_name = ?, location = ?, birth_date = ?"

                        + "where id = ?",
                person.getFirstName(),
                person.getLastName(),
                person.getLocation(),
                person.getBirth_date(),
                person.getId());
    }
}
