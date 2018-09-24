package pack;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class classs {
	
    
		static Scanner in = new Scanner(System.in);
		public static void main(String[] args){
		
		ArrayList<String> Listinfosp=new ArrayList<String> ();
		Listinfosp.add("java is oop");
		Listinfosp.add("java is very easy");
		Listinfosp.add("siri is an assistant for ios");
		

		ArrayList<String> Listislamicinfos=new ArrayList<String> ();		
		Listislamicinfos.add("allah is one");
		Listislamicinfos.add("muhammed is the prof of islam");
		Listislamicinfos.add("there is 1billion muslims is the world");
		
		
		ArrayList<String> Listeduc=new ArrayList<String> ();
		Listeduc.add("einstein is one who discovered the theory of relativity");
		Listeduc.add("newton is one who discovered gravity");
		Listeduc.add("1+1=2");
		
		
		
		HashMap<String,ArrayList<String>>  s=new HashMap<String, ArrayList<String>>();
		
		s.put("allah", Listislamicinfos);
		s.put("java", Listinfosp);
		s.put("educ", Listeduc);
		
		
		
		
		System.out.println(s.get("allah"));
		
		}
}