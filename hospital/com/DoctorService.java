package hospital.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hospital.com.Doctor;
import hospitalRepo.DocRepository;


@Service
public class DoctorService {
	@Autowired
	private DocRepository repos;
	
	@Transactional//(propagation = Propagation.REQUIRED)
	public void save(Doctor doc) {
		repos.save(doc);
	}
}
