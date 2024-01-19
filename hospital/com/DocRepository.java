package hospital.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import hospital.com.Doctor;


@Repository
public class DocRepository {
		@Autowired
		JdbcTemplate jdbcTemplate;
		
		public void save(Doctor doc) {
			String sql = "insert into Doctor values(?,?,?,?)";
			jdbcTemplate.update(sql, new Object[] {doc.getDoctId(),doc.getDoctName(),doc.getSpecialisation(),doc.getAppointment().getAppId()});
			
		
		}
	}

