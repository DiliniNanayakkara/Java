# Java 

import java.util.*;
public class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
			double Fno =sc.nextDouble();

		System.out.println("Enter the second number: ");
			double Sno =sc.nextDouble();

		System.out.println("Enter an operator <+,-,*,/>: ");
			String OP =sc.next();
		
	switch(OP){

		case "+":
			double sum=Fno+Sno;
			System.out.println(Fno + "+"+ Sno +"= "+ sum);
			break;

		case "-":
			double sub=Fno-Sno;
			System.out.println(Fno + "-"+ Sno +"= "+ sub);
			break;

		case "*":
			double mult=Fno*Sno;
			System.out.println(Fno + "*"+ Sno +"= "+ mult);
			break;

		case "/":
			double div=(Fno/Sno);
			System.out.println(Fno + "/"+ Sno +"= "+ div);
			break;
		
		default:
			System.out.println("Incorrect Operator");
			break;
		}
	}
}
