# Java 

import java.util.*;
public class Number_Type{

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number of inputs :");
		int num =sc.nextInt();

		if(num % 4 == 0 && num % 128 == 0 && num % 25 ==0 && num % 100 ==0 ){
			System.out.println("Type A & Type B");

		}else if(num % 25 == 0 && num % 100 !=0 ){
			System.out.println("Type A");

		}else if(num % 4 == 0 && num % 128 !=0 ){
			System.out.println("Type B");

		}else{
			System.out.println("Not");	
			}	
				
	}
