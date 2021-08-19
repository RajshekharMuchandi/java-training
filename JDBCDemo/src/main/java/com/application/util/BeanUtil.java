package main.java.com.application.util;

import main.java.com.application.dto.AddressDto;
import main.java.com.application.dto.EmployeeDto;
import main.java.com.application.entities.Address;
import main.java.com.application.entities.Employee;

public class BeanUtil {

    public static Employee getEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setEmployeeId(employeeDto.getEmployeeId());
        employee.setEmployeeName(employeeDto.getEmployeeName());
        employee.setEmployeeSalary(employeeDto.getEmployeeSalary());
        AddressDto addressDto = employeeDto.getAddress();
        Address address = new Address();
        address.setAddressId(addressDto.getAddressId());
        address.setAddressArea(addressDto.getAddressArea());
        address.setAddressCountry(addressDto.getAddressCountry());
        address.setAddressDistrict(addressDto.getAddressDistrict());
        address.setAddressState(addressDto.getAddressState());
        address.setAddressHouseNo(addressDto.getAddressHouseNo());
        address.setAddressPincode(addressDto.getAddressPincode());
        address.setAddressStreet(addressDto.getAddressStreet());
        address.setAddressTaluk(addressDto.getAddressTaluk());
        employee.setAddress(address);
        return employee;
    }

}
