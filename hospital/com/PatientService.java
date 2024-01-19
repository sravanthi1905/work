package hospital.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hospital.com.Patient;
import hospitalRepo.PatientRepo;


@Service
public class PatientService {
	@Autowired
	private PatientRepo repos;
	
	@Transactional//(propagation = Propagation.REQUIRED)
	public void save(Patient pat) {
		repos.save(pat);
	}
}
