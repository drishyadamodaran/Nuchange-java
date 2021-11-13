# Architecture
The program is implemented by using **HashMap** since it needs to store the data in (key,values) in pairs.
## HashMap
HashMap<K, V> is a part of Java’s collection since Java 1.2. This class is found in `java.util package`. It provides the basic implementation of the Map interface of Java. 
It stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to another object (value). 
If you try to insert the duplicate key, it will replace the element of the corresponding key.

HashMap is similar to HashTable, but it is unsynchronized. It allows to store the null keys as well, but there should be only one null key object and there can be any number 
of null values.  This class makes no guarantees as to the order of the map. To use this class and its methods, you need to `import java.util.HashMap` package or its superclass.

## Internal working
In this, we will see how hashmap's get and put method works internally.How Hashing is done and how value is fetched by key and how the key-value pair stored.

##### Initially Empty hashMap: Here, 
```java
private static HashMap<String,Integer> urlDatabase = new HashMap<>();
```

*Inserting Key-Value Pair:*
### Using put() method
put() method of HashMap is used to insert a mapping into a map. This means we can insert a specific key and the value associated.<br>
```java
if(userCommand.length > 1 
    && userCommand[0].toLowerCase().trim().equals("storeurl") && 
    userCommand[1].trim().length() > 0)
 {
    urlDatabase.put(userCommand[1], 0);
    continue;
 }
 if(urlDatabase.containsKey(userCommand[1]))
  {
     int usage = urlDatabase.get(userCommand[1]) + 1;
     urlDatabase.put(userCommand[1], usage);
  }
 ```
                

### Using get method()

Now lets try some get method to get a value.<br>
*Checking if a key is present and if present, print usage count value*<br>
```java
   if(urlDatabase.containsKey(userCommand[1]))
    {
     int usage = urlDatabase.get(userCommand[1]);
     System.out.println("Usage Count for " + userCommand[1] + " : " + String.valueOf(usage));
    }
   continue;
   for(String key : urlDatabase.keySet())
    {
    //mapping
    int usage = urlDatabase.get(key);
    // Printing value for the corresponding key
    System.out.println(key + " : " + String.valueOf(usage));
    }
  ```

### equals() method*

equals method is used to check that 2 objects are equal or not. This method is provided by Object class. You can override this in your class to provide your own implementation. 
HashMap uses equals() to compare the key whether the are equal or not. If equals() method return true, they are equal otherwise not equal. 
 
```java
if(userCommand.length > 1 &&
userCommand[0].toLowerCase().trim().equals("storeurl") &&
userCommand[1].trim().length() > 0)
```
 

## Running the program
The five commands will be listed ie., 1.storeurl 2.get 3.list 4.count 5 exit
- storeurl `storeurl <url>` is used for storing the url entered by the user into the hashmap.
- get command is used for fetching the url ie., `get <url>`.
- `list` command returns the url list alongwith the number of times it has been fetched using get command.
- count command `count <url>` returns the usage of that particular url.
- Finally, `exit` command to exit from the program.
  ![Screenshot (48)](https://user-images.githubusercontent.com/56961626/141656394-15cb1eab-9cb4-49c6-a645-45203ecebb91.png)
![Screenshot (47)](https://user-images.githubusercontent.com/56961626/141656398-786beb53-5948-475e-8cb1-c6f36e2b3b32.png)
