import java.util.HashMap;
import java.util.Scanner;

class urldatabase
{
    private static HashMap<String,Integer> urlDatabase = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Valid Commands : \n1. storeurl <url> \n2. get <url>\n3. count <url> \n4. list\n5. exit");            
            String userInput = sc.nextLine().trim();
            String[] userCommand = userInput.split(" ");
            if(userCommand.length == 0)
            {
                System.out.println("Please give input");
                continue;
            }
            else if(userCommand[0].trim().toLowerCase().equals("exit"))
            {
                break;
            }
            else
            {
                if(userCommand.length > 1 &&
                   userCommand[0].toLowerCase().trim().equals("storeurl") &&
                   userCommand[1].trim().length() > 0)
                {
                    urlDatabase.put(userCommand[1], 0);
                    continue;
                }
                else if(userCommand.length > 1 && 
                        userCommand[0].toLowerCase().trim().equals("get") &&
                        userCommand[1].trim().length() > 0 )
                {
                    if(urlDatabase.containsKey(userCommand[1]))
                    {
                        int usage = urlDatabase.get(userCommand[1]) + 1;
                        urlDatabase.put(userCommand[1], usage);
                    }
                    continue;
                }
                else if(userCommand.length > 1 &&
                        userCommand[0].toLowerCase().trim().equals("count") &&
                        userCommand[1].trim().length() > 0 )
                {
                    if(urlDatabase.containsKey(userCommand[1]))
                    {
                        int usage = urlDatabase.get(userCommand[1]);
                        System.out.println("Usage Count for " + userCommand[1] + " : " + String.valueOf(usage));
                    }
                    continue;
                }
                else if(userCommand.length == 1 && userCommand[0].toLowerCase().trim().equals("list"))
                {
                    System.out.println("Usage Count for all urls");
                    for(String key : urlDatabase.keySet())
                    {
                        int usage = urlDatabase.get(key);
                        System.out.println(key + " : " + String.valueOf(usage));

                    }
                    continue;
                }
                else
                {
                    System.out.println("Please give valid command ");
                    continue;
                }
            }
        }
        
    }

}
