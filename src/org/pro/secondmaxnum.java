package org.pro;

public class secondmaxnum {

	public static void main(String[] args) {
		int given[] = {1,11,30,29,5};
		
		int fmax=0;
		int smax =0;
		
		
		for (int i = 0; i < given.length; i++) {
			
		    
		     
		     if (given[i]>fmax) {
		    	 smax =fmax;
		    	 fmax = given[i];	
			}
			else if (given[i]>smax) {
		    	 
		    	 smax= given[i];
				}
				
		}
		
		System.out.println(smax);
		System.out.println(fmax);
		
		
		
	}

}
