package hospitalRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import hospital.com.Patient;
@Repository
public class PatientRepo {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void save(Patient pat) {
		String sql = "insert into patient values(?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] {pat.getPatientId(),pat.getPatientName(),pat.getPatientAge(),pat.getPatientProblem()});
		
	
	}
}
