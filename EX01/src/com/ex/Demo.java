package com.ex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {
	
	public static void DuplSt(String s) {
		
		char[] charArray = s.toCharArray();
		Map<Character,Integer> c= new HashMap<Character,Integer>();
		for(char e : charArray) {
			
		if(c.containsKey(e)) {
			

			c.put(e, c.get(e)+1);
		}else {
			c.put(e, 1);
		}			
			
		}
		
		/*
		 * for(Map.Entry<Character, Integer> entry : c.entrySet()) {
		 * 
		 * if(entry.getValue()>1) {
		 * System.out.println("Key "+entry.getKey()+"value"+entry.getValue()); }
		 * 
		 * }
		 */
		c.entrySet().forEach(e->{
			if(e.getValue()>1) {
				System.out.println("Key "+e.getKey()+"value"+e.getValue());
			}
		});
	}

	public static void main(String[] args) {
		
		Set s1 = new HashSet();
		
		String s2= new String("ram");
		String s3= new String("ram");
		String s4= new String("ram");
		String s5= new String("ram");
		
		String s6="ram";
		s6.concat("rrrr");
		System.out.println(s6);
		
		s1.add(s2);
		s1.add(s3);
		s1.add(s4);
		s1.add(s5);
		System.out.println(s1);
		String s="aaacccde";
		DuplSt(s);
		
		Map<String,Integer> m= new HashMap<String,Integer>();
		
		m.put("a",-1);
		m.put("c",-2);
		m.put("d",3);
		
		
		m.entrySet().forEach( e-> {
		if(e.getValue()<0) {
			m.put(e.getKey(),-(e.getValue()));
		}
		}
				
				);
		
	
		m.entrySet().forEach(e->{
			System.out.println(""+e.getValue());
			}
		);

	}
	
	

}
