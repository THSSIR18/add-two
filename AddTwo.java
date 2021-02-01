//scaner Demo
import java.util.Scanner;
public class AddTwo
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int aNum= sc.nextInt();
		System.out.print("Enter a second Integer ");
		int bNum =sc.nextInt();
		int theSum = aNum + bNum;
		System.out.println("The total is " + theSum );
	}
}