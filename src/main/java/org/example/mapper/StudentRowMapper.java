package org.example.mapper;

import org.example.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {


    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
          student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setEmail(rs.getString(3));
        return student;
    }
}
