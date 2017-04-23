package woodspring.springtoronto.service;

import java.util.List;

import woodspring.springtoronto.entity.Employee;

public interface EmployeeServiceInterface {
	
	Employee findById(Long id);

	Employee findByName(String name);

	void saveEmployee(Employee Employee);

	void updateEmployee(Employee Employee);

	void deleteEmployeeById(Long id);

	void deleteAllEmployees();

	List<Employee> findAllEmployees();

	boolean isEmployeeExist(Employee Employee);
}
