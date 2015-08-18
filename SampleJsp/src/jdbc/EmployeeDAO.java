package jdbc;

import java.util.List;

public interface EmployeeDAO {
public void getDBConnection();
public void closeConn();
public void addEmployee(Employee employee);
public void updateEmployee(String s1,double s);
List<Employee> getEmployees();
}
