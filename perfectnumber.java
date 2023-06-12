package array2;
import java.util.Scanner;
public class perfectnumber {

public static void main(String[] args) {
	int n; int i =0;
	
	Scanner sc=new Scanner(System.in);         
	System.out.print("Enter the number of numbers in an array ");  
	 n=sc.nextInt();  
	 System.out.print("number of elements in an array " + n);  
	 int[] arr = new int[n]; 
		int[] sum = new int[n];  
	 for(i=0;i<n;i++) {
		 arr[i]= sc.nextInt();
	 }
	 for(i=0;i<n;i++) {
		 
		 System.out.print(arr[i] + "	");
	 }
	 System.out.println(" ");
	 
	 for(i=0;i<n;i++) {
	int j=1;  
	while(j <= arr[i]/2)  
	{  
	if(arr[i] % j == 0)  
	{    
	sum[i]= sum[i] + j;  
	} 
	j++;  
	}  
	 }
	 for(i=0;i<n;i++) {
	if(sum[i]==arr[i])  
	{  
	System.out.println(arr[i]+" is a perfect number.");  
	}  
	else  
	
	System.out.println(arr[i]+" is not a perfect number.");   
	 }
}

}