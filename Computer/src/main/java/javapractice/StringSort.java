package javapractice;

import java.util.Arrays;

public class StringSort{
	
	
	public static void main(String[] args)   
	{
		 
			String[] brands = {"Nike", "Adidas", "MK", "UnderArmour", "Holister","BananaRepublic", "Amazon"};  
			
			int len = brands.length;  
 
			for(int i = 0; i<len; i++)   
			{  
			for (int j = i+1; j<len; j++)   
			{  
		
			if(brands[i].compareTo(brands[j])>0)  
			{  
		
			String temp = brands[i];  
			brands[i] = brands[j];  
			brands[j] = temp;  
			}  
			}  
			}  
			 
			System.out.println(Arrays.toString(brands));  
			
		
			
	}  
}