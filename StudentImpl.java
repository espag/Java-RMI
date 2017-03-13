package com.studentquery;
import java.rmi.*;
import java.rmi.server.*;
import java.sql.*;
import java.util.*;
class StudentImpl extends UnicastRemoteObject implements Student1{
StudentImpl()throws RemoteException{}

public List<Student> getStudents(){
List<Student> list=new ArrayList<Student>();
try{
//Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student_info","root","espag");
PreparedStatement ps=con.prepareStatement("select * from student_info");
ResultSet rs=ps.executeQuery();

while(rs.next()){
Student s=new Student();
s.setLastname(rs.getString(1));
s.setFirstname(rs.getString(2));
list.add(s);
}

con.close();
}catch(Exception e){System.out.println(e);}
return list;
}//end of getStudents()
}
