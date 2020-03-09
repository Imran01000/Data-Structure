import java.util.Scanner;
public class Palindrome_Checker {
	static int size;
	static int front1 = 0;
	static int rear1 = 0;
	static int front2;
	static int rear2;
	static char[] palindrome;
	static boolean checkEmpty;
	static boolean takeValue;
	static int choice;
	static char data;
	
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
	
	private static void addRear(char data)
	{
		if((front1 == 0 && rear1 == size) || (front2 == size && rear2 == 0))
		{
			System.out.println("The deque is overflow");
		}
		else
		{
			System.out.println(rear2);
			palindrome[rear2-1] = data;
			rear2--;
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
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.printf("1.Add from front\n2.Add from rear\n3.display\n");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the character to add from front");
				data = sc.next().charAt(0);
				addFront(data);
				break;
				
			case 2:
				System.out.println("Enter the character to add from rear");
				data = sc.next().charAt(0);
				addRear(data);
				break;
				
			case 3:
				System.out.println("+++++++++++++++++++++");
				display();
				break;
				
			default :
					System.out.println("Invalid value");
			}
		}
		
	}
}
