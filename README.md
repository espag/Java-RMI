# Java-RMI
Student Query Design : This is an example of server-client module using JAVA RMI, allowing remote communication between systems connected in same network.
Program Details 
Server:
Stud.java - Interface file
Student.java 
StudentImpl.java - Interface Implementation file
MyServer.java 
Client:
Stud.java - Interface file
MyClient.java  

Steps 
Platform used: - LINUX UBUNTU
Connect two PCs with wireless connection and note the IP Address of the Server (you may like to connect using the ad-hoc connection)
IP address can be checked using the following command:
# ifconfig
If Wi-Fi ad hoc is setup, see the inet4 of wlan connection 
Otherwise, for Ethernet connection, se the inet4 of eth connection
Change this IP Address in Server.java and Client.java file in the command for connection Server steps 
On the server side --
Open the Directory to the destination folder, right click on the blank space and select ‘Open in Terminal’
Open two terminals
Type the following commands –
On terminal window 1
Ensure you have the necessary packages and the path of mysql connector is set in the destination folder
To set the path use this command
# export CLASSPATH=$CLASSPATH:/usr/share/java/mysql-connector-java.jar
NOTE: You may want to ensure that the path of your .jar file is the same 
Compile all the java files 
#javac –d *.java 
Create the Stub and Skeleton using rmic tool 
# rmic com.studentquery.StudentImpl
Bind to registry
# rmiregistry 6666
On Terminal window 2
Ensure you have the path set for mysql connector
# export CLASSPATH=$CLASSPATH:/usr/share/java/mysql-connector-java.jar
Ensure the server program is complied
# javac –d . MyServer.java
Start the server
# java com.studentquery.MyServer

On Client side --
Open the Directory to the destination folder, Right click on blank space and select ‘Open in Terminal’
Ensure you have the path set for mysql connector
# export CLASSPATH=$CLASSPATH:/usr/share/java/mysql-connector-java.jar
Compile the client java file
# javac –d . MyClient.java 
Start the Client Program 
# java com.studentquery.MyClient
It will prompt you to enter the last name, when you enter the required information corresponding firsts name of the student is displayed.

To connect two laptops (wireless devices): 
1. On any one of two the machines that you are using, click on the network icon on the panel (top right cornerof the desktop).
2. Select the ‘Create New Wi-Fi Network....’ option 
3. Create a new wifi connection.
4. Now give your network a name and choose security options. Enter the password (not necessary).
5. Click on ‘Create’  
6. Wait while the network is created. Once its connected it will display a notification on the upper right corner of the desktop.
7. The network was successfully created and is ready to use. 
8. On the Client computer, click on the wireless icon to see available networks and connect to the ad hoc network you just created on the other machine by providing password (if given).
