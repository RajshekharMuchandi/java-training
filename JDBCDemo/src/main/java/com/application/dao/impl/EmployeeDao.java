package main.java.com.application.dao.impl;

import main.java.com.application.entities.Employee;

import java.util.List;

public interface EmployeeDao {

    public void save(Employee employee);

    public void update(int employeeId, String name);

    public void delete(int employeeId);

    public List<Employee> findAll();

    public void findById(int employeeId);
}
