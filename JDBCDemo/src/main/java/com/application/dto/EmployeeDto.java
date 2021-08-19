package main.java.com.application.dto;

import main.java.com.application.entities.Address;

public class EmployeeDto {

    private Integer id;

    private Integer employeeId;

    private String employeeName;

    private Double employeeSalary;

    private AddressDto address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", employeeName=" + employeeName +
                ", employeeSalary=" + employeeSalary +
                ", address=" + address +
                '}';
    }
}
