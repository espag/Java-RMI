package com.studentquery;
import java.rmi.*;
import java.util.*;
interface Student1 extends Remote{
public List<Student> getStudents()throws RemoteException;
}
