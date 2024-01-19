package employeeBeanXml;



import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements EmployeeImp {
	private List<Employe> empList = new ArrayList<Employe>();

	public void save(Employe emp) {
		if (!(empList.contains(emp))) {
			empList.add(emp);
			System.out.println("employee saved successfully");
		} else {
			System.out.println("employee id already exists");
		}
	}

	public Employe getById(int id) {
		for (Employe emp : empList) {
			if (id == emp.getEid()) {
				return emp;
			}
		}
		System.out.println("id not found");
		return null;
	}

	public void update(Employe updatedEmp) {
		for (Employe emp : empList) {
			if (emp.getEid() == updatedEmp.getEid()) {
				emp.setEname(updatedEmp.getEname());
				emp.setRole(updatedEmp.getRole());
				System.out.println("employee updated successfully");
			} 
		}

	}

	public void delete(int id) {
		for (Employe emp : empList) {
			if (id == emp.getEid()) {
				empList.remove(id);
				System.out.println("employee removed successfully");
			}
			else {
				System.out.println("id not found");
				break;
			}
		}
	}
	public void setEmpList(List<Employe> empList) {
		this.empList = empList;
	}
	public List<Employe> getEmpList() {
		return empList;
	}

	@Override
	public String toString() {
		return "EmployeeDAOImp [empList=" + empList + "]";
	}
	


}
