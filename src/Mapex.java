import java.util.HashMap;
import java.util.Map;
public class Mapex {
	
	//public void DemoHash()
	  public static void main(String[] args)
	{
		String[] name= {"aarti","arti","arthi"};
		char[] sname= {'a','b','c','d'};
		
		HashMap<String,Character> hp= new HashMap<String,Character> ();
		for(int i =0;i<name.length;i++)
		hp.put(name[i], sname[i])	;
		for (String key : hp.keySet()) // iterate over all keys
            System.out.println(key +  "=" + hp.get(key)); 
		
		
	}
  /* {
        double[] gpa = new double[] {4.0, 3.0, 2.0, 1.0, 0.0};
        char[] letter = new char[] {'A', 'B', 'C', 'D', 'F'};
        Map<Character, Double> map = new HashMap<Character, Double>();
        for (int i=0; i < gpa.length; i++)
            map.put(letter[i], gpa[i]); // insert key/value into map
        for (Character key : map.keySet()) // iterate over all keys
            System.out.println(key +  "=" + map.get(key)); // print key and value
        
            }*/
}