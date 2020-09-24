package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar  = new ArrayList();
		
		ar.add(100); //0
		ar.add(200); //1
		ar.add(300); //2
		ar.add(400); //3
		ar.add(500); //4
		ar.add(600); //5
		System.out.println(ar.size());
		System.out.println(ar.get(5));
		//System.out.println(ar.get(6)); //Indexoutofboundexception
		
		for (int k = 0; k<ar.size(); k++) {
			System.out.println(ar.get(k));
		}
			ar.remove(2);
			
			//Default virtual capacity of array list is 10
			//Physical capacity is a capacity that is actually filled with values (Suppose only two values are filled then PC :2)
			//Virtual capacity is a capacity that is not physically present (Suppose only two values are filled then VC :8)
			
			
		ArrayList<String> names = new ArrayList<String> ();
		
			names.add("SUMIT");
			names.add("RAWAT");
			
			ArrayList<Integer> empage  = new ArrayList<Integer> ();
			empage.add(25);
			empage.add(35);
			
			
			System.out.println(names.get(0)+ " " + empage.get(0));
			
			for(int k = names.size()-1 ; k >= 0 ; k--)
			{
				System.out.println(names.get(k));
			}
			
			for (String n : names) {
				System.out.println(n);
			}
			
			names.forEach((a)->System.out.println(a));  //lamda expression (For each loop)
			
			
		}
	}


