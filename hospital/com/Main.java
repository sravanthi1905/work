package hospital.com;



import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import BeanCon.BeanConfig;
import hospital.com.Appointment;
import hospital.com.Doctor;
import hospital.com.Patient;
import hospitalService.AppointmentService;
import hospitalService.DoctorService;
import hospitalService.PatientService;



public class Main {

	public static void main(String[] args) {
		// TODO  public static void main( String[] args )
	    
	        AnnotationConfigApplicationContext context =
	        		new AnnotationConfigApplicationContext(BeanConfig.class);
	    	context.registerShutdownHook();
	        
	        PatientService service1 = context.getBean(PatientService.class);
	        AppointmentService service2 = context.getBean(AppointmentService.class);
	        DoctorService service3 = context.getBean(DoctorService.class);
	       
	        Patient pat = new Patient(1,"kedari",21,"Sugar");
	        
	        service1.save(pat);
	        
	        Appointment app = new Appointment(1, new Date() ,pat);
	        
	        service2.save(app);
	        
	        System.out.println("Inserted");
	        
	        Doctor doc = new Doctor(1,"teja","mbbs",app);
	        
	        service3.save(doc);
	        
	        System.out.println("inserted");
	         
	        
	        
	    

	}

}
