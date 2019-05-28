package com.jpaqueryexecutor;

import com.jpaqueryexecutor.entity.Employee;
import com.jpaqueryexecutor.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee( ); 
      //employee.setEid( 1201 );
      employee.setEname( "Kavi" );
      employee.setSalary( 40d );
      employee.setDeg( "Technical Manager" );

      Employee employee2 = new Employee( ); 
      //employee.setEid( 1201 );
      employee2.setEname( "John" );
      employee2.setSalary( 45d );
      employee2.setDeg( "Developer" );

      EmployeeService es = new EmployeeService();
      es.createEmployee(employee);
      es.createEmployee(employee2);
        
    }
}
