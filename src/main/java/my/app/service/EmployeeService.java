package my.app.service;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.PathParam;

import my.app.dao.EmployeeDao;
import my.app.entity.Employee;

@Stateless
public class EmployeeService {

	@Inject
	private EmployeeDao employeeDao;

	public Employee selectById(@PathParam("id") int id) {
		return this.employeeDao.selectById(id);
	}

}
