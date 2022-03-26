package org.pro;

import java.util.Iterator;

public interface classA {
	
	public static void main(String[] args) {
		
int s []={1,2,3,4,5};
        
        int fmax=0;
        int smax=0;
        
        for(int i=0;i<s.length;i++){
            
            if(fmax<s[i]){
            	smax=fmax;
               fmax=s[i];
            }
            else if(smax<s[i]){
                
                smax=s[i];
                
            }
            
            
            
        }
        
        
        System.out.println(fmax);
        System.out.println(smax);
        
		
		
		
		
		
		
	}
	

}
