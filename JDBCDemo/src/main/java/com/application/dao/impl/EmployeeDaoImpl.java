package main.java.com.application.dao.impl;

import main.java.com.application.entities.Address;
import main.java.com.application.entities.Employee;
import main.java.com.application.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void save(Employee employee) {
       Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatementAddress = null;
        PreparedStatement preparedStatementEmployee = null;
        try {
           preparedStatementAddress =  connection.prepareStatement("INSERT INTO ADDRESS(ADDRESS_ID, ADDRESS_AREA, ADDRESS_COUNTRY, ADDRESS_STATE, ADDRESS_DISTRICT, ADDRESS_HOUSE_NO, ADDRESS_PINCODE, ADDRESS_STREET, ADDRESS_TALUK) " +
                  "VALUES(?,?,?,?,?,?,?,?,?)");
            Address address = employee.getAddress();
            preparedStatementAddress.setInt(1, address.getAddressId());
            preparedStatementAddress.setString(2, address.getAddressArea());
            preparedStatementAddress.setString(3, address.getAddressCountry());
            preparedStatementAddress.setString(4, address.getAddressState());
            preparedStatementAddress.setString(5, address.getAddressDistrict());
            preparedStatementAddress.setString(6, address.getAddressHouseNo());
            preparedStatementAddress.setString(7, address.getAddressPincode());
            preparedStatementAddress.setString(8, address.getAddressStreet());
            preparedStatementAddress.setString(9, address.getAddressTaluk());


            preparedStatementEmployee = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
            preparedStatementEmployee.setInt(1, employee.getId());
            preparedStatementEmployee.setInt(2, employee.getEmployeeId());
            preparedStatementEmployee.setString(3, employee.getEmployeeName());
            preparedStatementEmployee.setDouble(4, employee.getEmployeeSalary());
            preparedStatementEmployee.setInt(5, employee.getAddress().getAddressId());
            preparedStatementAddress.executeUpdate();
            preparedStatementEmployee.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtil.closeStatement(preparedStatementAddress);
            DBUtil.closeStatement(preparedStatementEmployee);
            DBUtil.closeConnection(connection);
        }
    }

    @Override
    public void update(int employeeId, String name) {

    }

    @Override
    public void delete(int employeeId) {

    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public void findById(int employeeId) {

    }
}
