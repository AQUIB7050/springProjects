package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//THROUGH XML(config.xml)
        //ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	
    	
    	//THROUGH JAVA CONFIG (JdbcConfig.java)
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        //INSERT
        
//        Student student = new Student();
//        student.setId(13);
//        student.setName("Rianna");
//        student.setAddress("Winterfell");
//        
        
        StudentDao studentDao = context.getBean("studentDao", StudentDaoImpl.class);
//        int res  = studentDao.insert(student);
//        
//        System.out.println(res + " row(s) inserted");
        
        
        //UPDATE
        
//        Student student1 = new Student();
//        student1.setId(11);
//        student1.setName("Steeve");
//        student1.setAddress("Queensland");
//        
//        int res1 = studentDao.update(student1);
//        
//        System.out.println(res1 + " row(s) updated");
        
        
        //DELETE
//        int res2 = studentDao.delete(11);
//        
//        System.out.println(res2 + " row(s) deleted");
        
        //GETTING A SINGLE STUDENT
        Student fetchSingleStudent = studentDao.getStudent(12);
        System.out.println("Single student Details :-\n"+ fetchSingleStudent);
        
        //GETTING ALL THE STUDENTS
        List<Student> fetchAllStudent = studentDao.getAllStudent();
        System.out.println("\nAll Student Details :-");
        for(Student s:fetchAllStudent) System.out.println(s);
         
        
    }
}
