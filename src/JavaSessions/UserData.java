package JavaSessions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {
		
		// Hashmap is class and you have to store value in the form of key and generics
		
	//	HashMap<String, String> userMap = new HashMap<String, String>();
		Map<String, String> usermap = new HashMap<String, String>();
		
		usermap.put("Id", "1");
		usermap.put("name", "Sumit");
		usermap.put("City", "Banglore");
		usermap.put(null, "pune");
		usermap.put(null, "Hyderabad");   // only one null key and and multiple null values in HashMap
		
		System.out.println(usermap.get("Id"));
		System.out.println(usermap.size());
		
		
		for (Map.Entry m : usermap.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
			
		}
		
		
		// Hashtable : 
		
		Hashtable<String, Integer> productTable = new Hashtable<String, Integer>();
		
		productTable.put("Macbook", 65000);
		productTable.put("iPhoneX", 120000);
	//	productTable.put(null, null);  // doesnot allow to store any null key or value 
	
		
		System.out.println(productTable);
		
		for (Map.Entry m : productTable.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
			
		}
		
		//HashMap is not synchronized  --  not ThreadSafe...
		
		
		
		
		
		

	}

}
