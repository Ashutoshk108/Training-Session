package com.bhavana.ilto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavana.ilto.business.bean.EmployeeBean;
import com.bhavana.ilto.dao.EmployeeDAO;
import com.bhavana.ilto.exceptions.InvalidUpdateOperationException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	public Integer addEmployee(EmployeeBean employeeBean) throws Exception {
		return employeeDAO.addEmployee(employeeBean);
	}

	public EmployeeBean getEmployeeDetails(Integer id) throws Exception {
		EmployeeBean emp =employeeDAO.getEmployeeDetails(id);
		if(emp==null){
			throw new InvalidUpdateOperationException();
		}
		return emp;
	}

	public EmployeeBean updateEmployeeDetails(EmployeeBean employeeBean)
			throws Exception {
		EmployeeBean emp = employeeDAO.updateEmployeeDetails(employeeBean);
		return emp;
	}

	public EmployeeBean deleteEmployeeDetails(Integer id) throws Exception {
		EmployeeBean emp = employeeDAO.deleteEmployeeDetails(id);
		return emp;
	}

	public List<EmployeeBean> getEmployeeList() throws Exception {

		return employeeDAO.getEmployeeList();
	}

}
