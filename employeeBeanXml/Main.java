package employeeBeanXml;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
       public static void main(String []args) {
    	   ApplicationContext context=new FileSystemXmlApplicationContext("workk.xml");
    	   EmployeeRepository employeeImp=context.getBean("empDAO",EmployeeRepository.class);
    	   //save the employee
    	   Employe employee=new Employe(1,"sravs","hr");
    	   employeeImp.save(employee);
    	   employee=new Employe(2,"teju","embded software");
    	
    	   employeeImp.save(employee);
    	  
    	  
    	  employeeImp.delete(5);
    	  
    	   List<Employe> list=employeeImp.getEmpList();
    	   System.out.println("list of employees:");
    	   
    	   for(Employe emp:list) {
    		   System.out.println(emp);
    	   }
    	   
       }
}
