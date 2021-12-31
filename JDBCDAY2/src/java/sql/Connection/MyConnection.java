package java.sql.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sonata.JobTracker.Model.Task;

public interface MyConnection {
	public Connection connectToMySQL();
	public List<Task> getAllTasks(){
		Connection connection;
		public Connection getConnection() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection
						("jdbc:mysql://localhost:3306/task_management","root","admin@123");
						}
			catch(ClassNotFoundException e) {e.printStackTrace();}
			catch(SQLException s) {s.printStackTrace();}
			return connection;
			}
		PreparedStatement cs=db.getConnection().prepareStatement("Select * from task_details");
		
        cs.executeResultset();
		
		List<Task> list = new ArrayList();
		while {
		Task t = new task();
		t= cs.executeResultset();
		list.add(t);)
		}
		return list;
		}
}
