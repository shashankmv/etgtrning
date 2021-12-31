package com.sonata.Main;
import java.sql.SQLException;
import java.util.List;

import com.sonata.DaoImpl.EmpDAOImpl;
import com.sonata.Model.Employee;
public class TestBean {
public static void main(String[] args) throws SQLException{
	Employee e1= new Employee();
	e1.setempid(12);
	e1.setempname("xxx");
	e1.setempsal(2345.78);
	
	EmpDAOImpl dao= new EmpDAOImpl();
	int row=dao.save(e1);
	System.out.println(row);
	
	List<Employee> list=dao.getData();
	for(Employee e:list) {
		System.out.println(e.getempid());
		System.out.println(e.getempname());
		System.out.println(e.getempsal());
	}
}
}
