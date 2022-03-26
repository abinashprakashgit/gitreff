package org.pro;

public class pro1 {
	
	public static void main(String[] args) {
		String s = "welcome to programing class";
		String[] split = s.split(" ");
		for (String string : split) {
			char charAt = string.charAt(0);
			char upperCase = Character.toUpperCase(charAt);
			String substring = string.substring(1);
			String Output = upperCase+substring;
			System.out.print(Output+" ");
			}
		
		
	
	
	}

}
