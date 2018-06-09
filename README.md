# Hibernate
In this Section I have covered all basic Concepts of Hiberante with example and I am using HSQLDB as underlying Database.

#HSQLDB SET UP
Step 1 − Download HSQLDB bundle

Download the latest version of HSQLDB database from the following link https://sourceforge.net/projects/hsqldb/files/. 

Step 2 − Extract the HSQLDB zip file

Extract the zip file and place it into the C:\ directory. After extraction, you will get a file structure as shown in the following screenshot.

Extract HsqlDB
Step 3 − Create a default database

There is no default database for HSQLDB, therefore, you need to create a database for HSQLDB. Let us create a properties file named server.properties which defines a new database named demodb. Take a look at the following database server properties.

server.database.0 = file:hsqldb/demodb
server.dbname.0 = testdb
Place this server.properties file into HSQLDB home directory that is C:\hsqldb- 2.3.4\hsqldb\.

Now execute the following command on command prompt.

\>cd C:\hsqldb-2.3.4\hsqldb
hsqldb>java -classpath lib/hsqldb.jar org.hsqldb.server.Server
After execution of the above command, you will receive the server status as shown in the following screenshot.

Default Database
Later, you will get to find the following folder structure of the hsqldb directory in the HSQLDB home directory that is C:\hsqldb-2.3.4\hsqldb. Those files are temp file, lck file, log file, properties file, and script file of demodb database created by HSQLDB database server.

Create Database
Step 4 − Start the database server

Once you are done creating a database, you have to start the database by using the following command.

\>cd C:\hsqldb-2.3.4\hsqldb
hsqldb>java -classpath lib/hsqldb.jar org.hsqldb.server.Server --database.0
file:hsqldb/demodb --dbname.0 testdb
