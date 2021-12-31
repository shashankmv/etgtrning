package com.sonata.DaoImpl;

import java.sql.*;
import java.util.*;

import com.sonata.Dao.EmpDao;
import com.sonata.Model.Employee;
public class EmpDAOImpl implements EmpDao {
int row=0;
DbConnection db= new DbConnection();
Employee employee=null;
public int save(Object object) {
	try {
		employee =(Employee)object;
		PreparedStatement cs=db.getConnection().prepareStatement("insert into employee_table values(?,?,?)");
		cs.setInt(1, employee.getempid());
		cs.setString(1, employee.getempname());
		cs.setDouble(1, employee.getempsal());
		row= cs.executeUpdate();
		db.closeConnection();
	}
	catch(SQLException e) {System.out.println(e);}
	return row;
	}
@Override
public List<Employee> getData(){
	List<Employee> empList= new ArrayList<>();
	
	try {
		PreparedStatement cs1=db.getConnection().prepareStatement("select * from employee_table");
		ResultSet rs=cs1.executeQuery();
		while(rs.next()) {
			Employee emp= new Employee();
			int empid=rs.getInt(1);
			String  empname=rs.getString(2);
			double empsal=rs.getDouble(3);
			emp.setempid(empid);
			emp.setempname(empname);
			emp.setempsal(empsal);
			empList.add(emp);
		}
	}catch(SQLException se) {se.printStackTrace();}
	return empList;
}
}