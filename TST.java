package tst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class TST {
	
	
	static Scanner reader = new Scanner (System.in);
    public static void main(String[] args) {
    	
    
ArrayList<String> Listbarca=new ArrayList<String>();
Listbarca.add("mes que un club");
Listbarca.add("forca barca");
Listbarca.add("som lagent blaugrana");



ArrayList<String> Listjava=new ArrayList<String>();
Listjava.add("Java and oop");
Listjava.add("Java work for android");
Listjava.add("Java is very fast");



ArrayList<String> ListAndroid=new ArrayList<String>();
ListAndroid.add("Android is an os , the most populary");
ListAndroid.add("New version of Android avelibe");
ListAndroid.add("All today news about Android");



HashMap<String,ArrayList<String>>  s=new HashMap<String, ArrayList<String>>();



s.put("barca", Listbarca);
s.put("java", Listjava);
s.put("Android", ListAndroid);



System.out.println(s.get("barca"));



    }
}