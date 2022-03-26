package org.pro;

public class pro2 {
	
	public static void main(String[] args) {
		String s = "welcome to programing class";
		String[] s1 = s.split(" ");
		
		for (String a : s1) {
			String rev="";
			for (int i =a.length()-1; i >=0; i--) {
				char ca = a.charAt(i);
				rev = rev +ca;
				
				
				
			}
			System.out.print(rev+" ");
		}
		
		
		
	
	
	}
	
	

}
