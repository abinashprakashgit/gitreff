package org.pro;

public class newsss {
	
	
	public static void main(String[] args) {
		 
		
		int limit=8;
		
		int fnum=0;
		int snum=1;
		int j=1;
		for (int i = 0; i < limit; i++) {
			
			
			if((fnum%j)== 0) {
			
				System.out.println(fnum);
			j++;
			
			
			}
			
			
			
			int tnum=fnum+snum;
			
			snum=fnum;
			fnum=tnum;
			
		}
		
		
		
		
		
	}

}
