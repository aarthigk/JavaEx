import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ArrayEx {
public static void main(String a[])
{
	int[][] aa = {{1,2,34},{9,8,7}};
	System.out.println(aa[0][0]);
	System.out.println(aa[1][1]);
	
	int[] mm = {1,2,3,4};
	System.out.println(mm[0]);
	
	ArrayList<String> by= new ArrayList<String>();
	by.add("gty");
	by.add("tam");
	by.set(0, "gyiy");
	System.out.println(by.get(0));
	
	LinkedList<String> gh= new LinkedList<String>();
	gh.add("Hylo");
	System.out.println(gh.get(0));
	
	HashMap<String,String> mapp= new HashMap<String,String>();
	
	mapp.put("Super","Man");
	mapp.put("Bat", "Man");
	mapp.put("Spider", "Man");
	System.out.println(mapp);
	
	HashMap<String,Integer> mak=new HashMap<String,Integer>();
	mak.put("Man", 1);
	mak.put("women", 2);
	System.out.println(mak);
	
	
	


}
}
