import java.util.Scanner;
class javaProgramme
{
	public static void main(String[] args)
	{
		byte age;
		Scanner sc =new Scanner(System.in);
		System.out.println("Input your Age...");
		
		age = sc.nextByte();
		
		if(age>=18)
		{
			System.out.println("You are an Adult");
		}
		else
		{
			System.out.println("You are a Minor");
		}
	}
}