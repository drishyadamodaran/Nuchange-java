# Problem statement 
Develop a program in Java(urldatabase) that can be run in the command line as per given requirements
below. 
# Requirements 
1. To start the program: run java urldatabase. Further, the program will wait for the user to enter the
following commands.
2. The command storeurl shall take a URL as a parameter and save that into a table with a unique
short key and a count(usage count) initialized to 0.
a. Use local variables instead of a database to store the data.
b. Use any appropriate logic to generate the unique short key.
2. The command get shall take a URL as a parameter and return the unique short key after
incrementing the usage count.
3. The command count shall take a URL as a parameter and should return the latest usage count.
4. The command list should return all urls and counts. The return value is in JSON.
5. The command exit should terminate the program
# Example Commands usage
1. To start the program: run java urldatabase.
2. Commands:
-  storeurl google.com
-  get google.com
-  count google.com
-  list
2. To exit the program enter exit

# Pre-requisities
In order to write and run a Java program,you need to install Java SE Development Kit(JDK) and java runtime environment. The code can be written in any editor such as VS Code, Sublime or IDE such as eclipse etc


# Implementation
The program is implemented by using HashMap since it needs to store the data in (key,values) in pairs.
### HashMap
HashMap<K, V> is a part of Java’s collection since Java 1.2. This class is found in `java.util package`. It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to another object (value). If you try to insert the duplicate key, it will replace the element of the corresponding key.

HashMap is similar to HashTable, but it is unsynchronized. It allows to store the null keys as well, but there should be only one null key object and there can be any number of null values.  This class makes no guarantees as to the order of the map. To use this class and its methods, you need to `import java.util.HashMap` package or its superclass.
# Usage
The program runs in the command line where the user has to enter the command `javac urldatabase.java` from the folder where it contains.
A class file named urldatabase has been created and then enter the command `java urldatabase` which then starts to run the program.
![Screenshot (47)](https://user-images.githubusercontent.com/56961626/141655541-d7261670-caff-4512-9625-c338685bd122.png)
![Screenshot (48)](https://user-images.githubusercontent.com/56961626/141655543-7e528de4-53df-428d-91d3-a9e2dea013fd.png)
