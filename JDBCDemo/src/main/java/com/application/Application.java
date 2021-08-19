package main.java.com.application;

import main.java.com.application.dto.AddressDto;
import main.java.com.application.dto.EmployeeDto;
import main.java.com.application.service.impl.EmployeeService;
import main.java.com.application.service.impl.EmployeeServiceImpl;
import main.java.com.application.util.TestData;

public class Application {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        EmployeeDto employeeDto = TestData.getEmployeeDto();
        employeeService.save(employeeDto);
    }

}
