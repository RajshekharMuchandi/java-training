package main.java.com.application.service.impl;

import main.java.com.application.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    public void save(EmployeeDto employee);

    public void update(int employeeId, String name);

    public void delete(int employeeId);

    public List<EmployeeDto> findAll();

    public void findById(int employeeId);
}
