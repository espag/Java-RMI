package com.studentquery;
import java.util.*;
import java.rmi.*;
import java.lang.*;
public class MyClient{
public static void main(String args[])throws Exception{
int flag=0;
Student1 b=(Student1)Naming.lookup("rmi://10.42.0.134:6666/studentquery");
System.out.println("------RMI APPLICATION::Prints the First name for corresponding Last name------");
Scanner user_input = new Scanner(System.in);
String nm,n;
System.out.print("Enter the Last name: ");
nm = user_input.next();

List<Student> list=b.getStudents();

for(Student s:list){
n = s.getLastname();
if (n.equals(nm)) {
System.out.println("---> "+s.getFirstname());
flag=1;
		}

	}
if(flag==0) {
System.out.println("SORRY!! No such entry present...TRY AGAIN!");
}
else {
System.out.println("\n\n **SUCCESS**");
}

}
}
