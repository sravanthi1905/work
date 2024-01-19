package employeeBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeService {
	

		@Autowired
		private EmployeeRepository repos;
		
		@Transactional//(propagation = Propagation.REQUIRED)
		public void save(Employe emp) {
			repos.save(emp);
		}
		public void del(int id) {
			repos.del(id);
		}
		public void updte(String str,Employe emp) {
			repos.updte(str, emp);
		}
	}
