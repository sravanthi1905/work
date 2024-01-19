package employeeBeanXml;

public interface EmployeeImp {
	//create
	void save(Employe emp);
	//read
	Employe getById(int id);
	//update
	void update(Employe emp);
	//delete
	void delete(int id);
}
