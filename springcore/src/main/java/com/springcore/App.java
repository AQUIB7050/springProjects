package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");;
        Student student = context.getBean("s1", Student.class);
        Student student2 = context.getBean("s2", Student.class);
        
        System.out.println(student);
        System.out.println(student2);
    }
}
