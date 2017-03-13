package com.studentquery;
import java.rmi.*;
import java.util.*;
public class MyServer{
public static void main(String args[])throws Exception{
System.setProperty("java.rmi.server.hostname","10.42.0.134");
Remote r=new StudentImpl();
Naming.rebind("rmi://10.42.0.134:6666/studentquery",r);
}}
