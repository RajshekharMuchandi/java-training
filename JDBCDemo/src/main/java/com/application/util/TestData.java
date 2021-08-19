package main.java.com.application.util;

import main.java.com.application.dto.AddressDto;
import main.java.com.application.dto.EmployeeDto;

public class TestData {

    public static EmployeeDto getEmployeeDto() {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(4);
        employeeDto.setEmployeeName("RAJ");
        employeeDto.setEmployeeSalary(320000.00);
        employeeDto.setEmployeeId(9004);

        AddressDto addressDto = new AddressDto();
        addressDto.setAddressId(4);
        addressDto.setAddressArea("FIRST STAGE");
        addressDto.setAddressDistrict("BELGAUM");
        addressDto.setAddressCountry("INDIA");
        addressDto.setAddressState("KARNATAKA");
        addressDto.setAddressHouseNo("26");
        addressDto.setAddressPincode("590006");
        addressDto.setAddressStreet("NA");
        employeeDto.setAddress(addressDto);
        return employeeDto;
    }
}
