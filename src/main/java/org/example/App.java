package org.example;

import org.example.mapper.StudentRowMapper;
import org.example.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App 
{

    public static void main( String[] args )
    {

   ApplicationContext  context = new ClassPathXmlApplicationContext("org/example/config.xml");
        JdbcTemplate jdbc = context.getBean("jdbcTemplate", JdbcTemplate.class);
        //insert and create data
//        String query = "INSERT INTO student (id,name,email)VALUES(?,?,?)";
//
//        int rows = jdbc.update(query,2,"shyam","shyam@gmail.com");
//        System.out.println("Hello"+rows);

        //Update the data
//        String sql ="UPDATE student set NAME=? WHERE ID=?";
//
//        int rows = jdbc.update(sql,"Kumari",2);
//        System.out.println("Hello"+rows);
        //Delete

//        String query ="DELETE FROM student WHERE ID=1";
//fetching the data
        String query = "SELECT * from student where ID=1";
        String rows =jdbc.queryForObject(query, new StudentRowMapper());




//        List<Student> list = jdbc.queryForList(query,StudentRowMapper.class);


//        try{
//            System.out.println(jdbc.getDataSource().getConnection());
//        }catch (Exception ex){
//            System.out.println(ex);
//        }


    }
}
