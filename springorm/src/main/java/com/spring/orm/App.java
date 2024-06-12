package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.dao.StudentDaoImpl;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDaoImpl.class);
//       Student student = new Student(10,"Jessy","Jamaica");
//       
//       int res  = studentDao.insert(student);
//       System.out.println(res + " row(s) inserted");

		boolean start = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (start) {

			System.out.println("press 1 for add new student");
			System.out.println("press 2 for selecting single student");
			System.out.println("press 3 for selecting all students");
			System.out.println("press 4 for deleting a student");
			System.out.println("press 5 for updating student");
			System.out.println("press 6 for exit");
			try {

				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:
					Student student = new Student();
					System.out.println("Enter Student id :- ");
					student.setId(Integer.parseInt(br.readLine()));
					System.out.println("Enter Student name :- ");
					student.setName(br.readLine());
					System.out.println("Enter Student city :- ");
					student.setCity(br.readLine());
					studentDao.insert(student);
					System.out.println("-------------------------");
					System.out.println(student.getId() + " inserted");
					System.out.println("********************************");
					break;
				case 2:
					System.out.println("Enter Student id you want to fetch :- ");
					Student student1 = studentDao.getStudent(Integer.parseInt(br.readLine()));
					System.out.println("-------------------------");
					System.out.println(student1);
					System.out.println("-------------------------");
					System.out.println("********************************");
					break;
				case 3:
					System.out.println("-------------------------");
					List<Student> students = studentDao.getAllStudents();
					for(Student s:students) {
						System.out.println(s);
						System.out.println("-------------------------");
					}
					System.out.println("********************************");
					break;
				case 4:
					System.out.println("Enter id of student you want to remove :- ");
					int studentId = Integer.parseInt(br.readLine());
					studentDao.delete(studentId);
					System.out.println("-------------------------");
					System.out.println(studentId + " is removed");
					System.out.println("********************************");
					break;
				case 5:
					Student student2 = new Student();
					System.out.println("Enter Exisiting Student id :- ");
					student2.setId(Integer.parseInt(br.readLine()));
					System.out.println("Enter New Student name :- ");
					student2.setName(br.readLine());
					System.out.println("Enter New Student city :- ");
					student2.setCity(br.readLine());
					studentDao.update(student2);
					System.out.println("-------------------------");
					System.out.println(student2.getId() + " has been updated");
					System.out.println("********************************");
					break;
				case 6:
					start = false;
					break;

				}

			} catch (Exception e) {
				System.out.println("Invalid input!!");
				System.out.println("Please check your input and try again!!");
			}
			
			
		}
		System.out.println("THANKYOU FOR USING THIS APP!");
		System.out.println("HOPE TO SEE YOU SOON!");
	}
}
