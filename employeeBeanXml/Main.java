package employeeBeanXml;

import java.util.List;
import java.util.Random;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("emp.xml");
		
		
		EmployeeRepository emp = ctx.getBean("employeeRepository", EmployeeRepository.class);
		Employe emp2 = new Employe(1121,"teju","hr");
		emp.save(emp2);
		System.out.println("inserted succesfully");
		
	}
}
