package javapractice;


import java.util.Arrays;


public class NumberSorting {
	
	//////////////********TO PRINT THE ARRAY**********//////////////
	
	public static void PrintArray(int arr[]) 
	{
		 for(int i=0; i<arr.length ; i++) 
         {
			 System.out.print(arr[i]+" ");
         }  
	}
//////////////********TO SORT THE ARRAY**********//////////////
	
	public static void ArraySort(int arr[]) {
		 for(int i=0; i<arr.length ; i++)
         {
        	for(int j=i+1;j<arr.length;j++)
        	{	
        		if(arr[i]>arr[j]) // for descending its 'smaller than sign' 
        		{
	        		
	        		int temp=arr[i];
	        		arr[i]=arr[j];
	        		arr[j]=temp;
	        			
        		}
        	}
         }	
	}
	
	public static void main(String[] args)   {
         int[] numArray = {2,7,8,2,3,9,1};
         int[] numArray3= {24,-2,0,9,-3,30};
         
   /////////////******** ASCENDING BUBBLE SORT *******///////////////////
         System.out.println("Entered array is: "); 
         PrintArray(numArray); 
         
         ArraySort(numArray);
       
         System.out.println("\narray in ascending order: ");
         PrintArray(numArray);
         
     ///////////****************SORT METHOD USE********************//////////////////
        
        
         System.out.println("\nEntered array is: "); 
         PrintArray(numArray3); 
         
         Arrays.sort(numArray3);
         
         System.out.println("\nModified array : " + Arrays.toString(numArray3));
         
    
         
}
}
