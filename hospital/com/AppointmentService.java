package hospital.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hospital.com.Appointment;
import hospitalRepo.AppointmentRepo;

@Service
public class AppointmentService {
	@Autowired
	private AppointmentRepo repos;
	
	@Transactional//(propagation = Propagation.REQUIRED)
	public void save(Appointment app) {
		repos.save(app);
	}
}
