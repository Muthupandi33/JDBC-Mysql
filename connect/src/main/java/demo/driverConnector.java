//CONNECT JDBC
//step1.	LOAD THE DRIVER
				//2.ways
						//1. Create object from Driver interface..
						//2. using ( Class.forName(); )method..
//step2.	ESTABLISH THE CONNECTION
				//1.way
						//using ( DriverManager.getConnection("protocol:subprotocol://host:port_no/db_name?user=u_name&password=pwd"); )
//step3.	CREATE STATEMENT
//step4.	EXECUTE QUERY
//step5.	CLOSE CONNECTION

package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class driverConnector {
	
	public static void main(String[] args)throws Exception {
		
	
		// LOAD THE DRIVER
		//1st way...........................................
//		java.sql.Driver d=new com.mysql.cj.jdbc.Driver();
//		DriverManager.registerDriver(d);
		//2nd way...........................................
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
 
	// ESTABLISH THE CONNECTION
		String url="jdbc:mysql://localhost:3306/emp",usr="root",psw="root";
		Connection c=DriverManager.getConnection(url,usr,psw);
		System.out.println("Established connection..");
	// CREATE STATEMENT
		Statement s= c.createStatement();
		// EXECUTE QUERY
//		s.executeUpdate("insert into deveops values(5,'naveen',7868436535,'naveen1808@gmail.com','vallakootai')");
//		s.executeUpdate("insert into deveops values(6,'sid',78685676535,'sid@gmail.com','udt')");
//		System.out.println("data inserted...");
//		s.executeUpdate("update deveops set name_emp='Naveen Raja',emp_phone=9999999900 where emp_id=5");
//		s.executeUpdate("delete from deveops where emp_id=6");
		s.executeUpdate("insert into deveops(emp_id,name_emp,emp_email,emp_loc) values(7,'Suresh','suresh@gmail.com','Chennai')");
		System.out.println("data updated ");
		System.out.println("The connection close status : "+c.isClosed());
		c.close();
		System.out.println("The connection close status :"+c.isClosed());
	}

}
