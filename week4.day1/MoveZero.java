package Week3.Day2;

public class MoveZero
{
	 static void moveZeroElementToEnd(int[] arr)
	 {  
		 // declare and initialize.
		 int size = arr.length;  
	     int count = 0;  
	  
	     // access all array elements.
	     for (int i = 0; i < size; i++)
	     {  
	    	 if (arr[i] != 0)
	    	 {  
	             arr[count++] = arr[i];  
	         }  
	     }  
	  
	     while (count < size)  
	     arr[count++] = 0;  
	 }  
	  
	 public static void main(String[] args) 
	 {  
	     int[] arr = {4,0,3,0,1,5,2,0};  
	     moveZeroElementToEnd(arr);   
   	     System.out.print("Array after moving zeros to end : ");  
	     for (int i = 0, size = arr.length; i < size; i++)  
	     System.out.print(arr[i] + " ");  
	 }  
}