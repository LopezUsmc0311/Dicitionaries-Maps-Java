/*
 * Dictionary and Map Day 8 HackerRank
 */
package solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Solution {

    
    
public static void main(String[] args) {  
Scanner in = new Scanner(System.in);
System.out.println("How many searches: ");
int n = in.nextInt();



Map<String, Long> phoneBook = new HashMap<>();


for (int i=0; i < n; i++)
    {
        System.out.println("name: ");
        String name = in.next();
        System.out.println("phone #: ");
        long phoneNumber = in.nextLong();
        phoneBook.put(name, phoneNumber);
    }

while(in.hasNext())
    {
        String name = in.next();  
        if(phoneBook.containsKey(name)== true)
        {
        System.out.println(name  + "=" +phoneBook.get(name));
               
        }else 
        {
        System.out.println("Not found");                
        }
            
    }



in.close();
}

    }



