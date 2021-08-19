package main.java.com.application.service.impl;

import main.java.com.application.dao.impl.EmployeeDao;
import main.java.com.application.dao.impl.EmployeeDaoImpl;
import main.java.com.application.dto.AddressDto;
import main.java.com.application.dto.EmployeeDto;
import main.java.com.application.entities.Address;
import main.java.com.application.entities.Employee;
import main.java.com.application.util.BeanUtil;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeDao employeeDao = new EmployeeDaoImpl();

    @Override
    public void save(EmployeeDto employeeDto) {
        Employee employee = BeanUtil.getEmployee(employeeDto);
        employeeDao.save(employee);
    }

    @Override
    public void update(int employeeId, String name) {

    }

    @Override
    public void delete(int employeeId) {

    }

    @Override
    public List<EmployeeDto> findAll() {
        return null;
    }

    @Override
    public void findById(int employeeId) {

    }
}
