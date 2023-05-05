package Lab1;
import java.util.Scanner;
//Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
public class Reverse {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int reverse=0;
		System.out.println("Enter positive integer");
		int num=sc.nextInt();
		if(num<0) {
			System.out.println("Enter a positive number  ");
		}
		else {
		while(num != 0 && num>0)   {  
		int remainder = num % 10;  
		reverse = reverse * 10 + remainder;  
		num = num/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
	}
}


