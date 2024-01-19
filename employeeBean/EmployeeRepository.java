package employeeBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeRepository {

		@Autowired
		JdbcTemplate jdbcTemplate;
		
		public void save(Employe emp) {
			String sql = "insert into employe values(?,?,?)";
			jdbcTemplate.update(sql, new Object[] {emp.getEid(), emp.getEname(), emp.getRole()});
		}
		
		public void del(int id) {
			String s = "delete from employe where eid = ?";
			jdbcTemplate.update(s, new Object[] {id});
		}
		
		public void updte(String str,Employe emp) {
			String st = "update  employe set ename= ? where ename=? ";
			jdbcTemplate.update(st, new Object[] {str,emp.getEname()});
		}
	}

