package App;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Service {

	HashMap<Integer, Account> Users = new HashMap<Integer, Account>(); 
			
			
	public void inputAccount(String FirstName, String SecondName) {
	
		Scanner sc = new Scanner (System.in);
		
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		
		
		addAccount(input1,input2,(Integer)100);
		
		sc.close();
		
	}	
	
	public void addAccount(String FirstName, String SecondName, Integer key) {
		
		Account acc = new Account(FirstName,SecondName,key);
		
		Users.put(key,acc);
		
	}
	
	
	public void removeAccount (int AccountNumber) {
	}
	
		
		//System.out.println("Please enter your name");
		
		//String User = scanner.nextLine();
	
		
		
	//hmap.put(121, "Tom");
	//hmap.put(2, "Jack");
	
	//Set set = hmap.entrySet();
	//Iterator iterator = set.iterator();
	//while(iterator.hasNext()) {
		//Map.Entry mentry = (Map.Entry)iterator.next(); 
		//System.out.println("key is: "+ mentry.getKey() + "& value is: ");
		//System.out.println(mentry.getValue());
	
	
	
}
