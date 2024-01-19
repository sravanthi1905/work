package employeeBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
	 public static void main( String[] args )
	    {
	        AnnotationConfigApplicationContext context =
	        		new AnnotationConfigApplicationContext(Beanconfig.class);
	    	context.registerShutdownHook();
	        
	        EmployeeService service = context.getBean(EmployeeService.class);
	        
	        Employe emp = new Employe(1110, "Shankar", "FS Developer");
	        //service.save(emp);
	        emp = new Employe(1119, "Shankar", "FS Developer");
	       // service.save(emp);
	       emp  = new Employe(1118, "Shankar", "FS Developer");
	      // service.save(emp);
	       emp  = new Employe(1117, "Shankar", "FS Developer");
	       
	       //service.save(emp);
	       System.out.println("inserted successfully");
	       
	       service.del(emp.getEid());
	       
	       System.out.println("deleted succesfully");
	       
	       service.updte("sravs",emp);
	       System.out.println("updated succesfully");
	        
	        
	        
	        
	        
	    }
}
