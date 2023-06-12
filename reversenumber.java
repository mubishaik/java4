package array2;
import java.util.Scanner;
public class reversenumber {
	public static void main(String[] args) {
		
	
	int num; int i =0;
	Scanner sc=new Scanner(System.in);         
	System.out.print("Enter the number ");
	 num=sc.nextInt(); 
	 
		 System.out.println("original number"+num);
		 int reverse =0;
		 for(i=0;i<=3;i++){
		 int rem = num % 10; 
		 reverse = reverse * 10 + rem; 
		 num = num / 10; 
		 if(num==0)break;

		 }
		 System.out.println(reverse);
		 }
	
}
