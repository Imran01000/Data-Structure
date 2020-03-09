import java.util.Scanner;
public class Palindrome_Checker {
	static int size;
	static int front1 = 0;
	static int rear1 = 0;
	static int front2 = size;
	static int rear2 = size;
	static char[] palindrome;
	private static boolean checkEmpty;
	private static boolean takeValue;

	private static boolean isEmpty()
	{
		if((front1 == 0 && rear1 ==0) && (front2 == size && rear2 == size))
		{
			checkEmpty = true;
		}
		else
		{
			checkEmpty = false;
		}
		return checkEmpty;
	}
	private static void addFront(char data)
	{
		if((front1 == 0 && rear1 == size) || (front2 == size && rear2 == 0))
		{
			System.out.println("The deque is overflow");
		}
		else
		{
			palindrome[rear1] = data;
			rear1 = rear1 + 1;
		}
	}
	private static void display()
	{
		for (char c : palindrome) {
			System.out.println(c);
		}
	}
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of deque");
		size = sc.nextInt();
		palindrome = new char[size];
		front2 = size;
		rear2 = size;
		System.out.println("Is deque is empty?");
		takeValue= isEmpty();
		System.out.println(takeValue);
		addFront('c');
		display();
		
	}
}
