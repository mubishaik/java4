package array2;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		int n; int i =0;
		Scanner sc=new Scanner(System.in);         
		System.out.print("Enter the number of number ");  
		 n=sc.nextInt();  
		 int m=0,flag=0;        
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }
		 }
		 }
