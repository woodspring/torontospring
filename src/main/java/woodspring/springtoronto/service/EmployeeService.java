package woodspring.springtoronto.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import woodspring.springtoronto.entity.Employee;
import woodspring.springtoronto.repository.EmployeeRepository;


@Service("employeeService")
@Transactional
public class EmployeeService implements EmployeeServiceInterface {
	static final Logger logger = LoggerFactory.getLogger(EmployeeService.class.getName());

	@Autowired
	private EmployeeRepository emplResp;
	
	public Employee findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	public void saveEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		
	}


	public void updateEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		
	}


	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		
	}


	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
	}


	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean isEmployeeExist(Employee Employee) {
		// TODO Auto-generated method stub
		return false;
	}
}
