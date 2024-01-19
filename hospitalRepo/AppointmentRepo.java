package hospitalRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import hospital.com.Appointment;
import hospital.com.Doctor;


@Repository
public class AppointmentRepo {
		@Autowired
		JdbcTemplate jdbcTemplate;
		
		public void save(Appointment app) {
			String sql = "insert into Appointment values(?,?,?)";
			jdbcTemplate.update(sql, new Object[] {app.getAppId(),app.getAppDate(),app.getPatient().getPatientId()});
			
		
		}
	}

