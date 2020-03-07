import java.util.Scanner;

public class Balanced_parantheses
{
	static int size = 0;
	static int top = 0;
	int[] stack = new int[size];
	static boolean checkEmpty;
	static boolean check;
	
	private boolean isStackEmpty()
	{
		if(top == 0)
		{
			checkEmpty = true;
		}
		else
		{
			checkEmpty = false;
		}
		return checkEmpty;
	}



	public static void main(String[] args)
	{
		Balanced_parantheses bp = new Balanced_parantheses();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your stack");
		size = sc.nextInt();
		check = bp.isStackEmpty();
		System.out.println("Is stack empty?");
		System.out.println(check);
		sc.close();
		

	}

}
