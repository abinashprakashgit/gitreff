package org.pro;

import java.util.Iterator;

public class pro3 {
	public static void main(String[] args) {
		String s = "Anand @ 12345 Add: ORM- Chennai";
		int lowercase =0;
		int Uppercase =0;
		int number =0;
		int special =0;
		for (int i = 0; i < s.length(); i++) {
			char ca = s.charAt(i);
			if (ca>='a' && ca<='z') {
				lowercase++;
				
			}
			else if (ca>= 'A' && ca<='Z') {
				Uppercase++;
				
			}
			else if (ca>='0' && ca<='9') {
				number++;
				
			}
			else {
				special++;
			}
			
			
			
		}
		System.out.println(lowercase);
		System.err.println(Uppercase);
		System.out.println(number);
		System.out.println(special);
		
		
}
}