import java.util.Scanner;
public class Banking_Cash_Counter {

	//VARIABLES.
	final static int size = 20;
	static int front = 0;
	static int rear = 0;
	static int[] queue;
	static int data;
	static int counterTotalMoney = 10000;
	static boolean checkEmpty;
	static boolean takeValue;
	static int choice;
	
	//USING SCANNER TO TAKE AN INPUTS FROM USER.
	static Scanner sc = new Scanner(System.in);
	private static boolean isEmpty()
	{
		if(front == rear)
			checkEmpty = true;
		else
			checkEmpty  = false;
		return checkEmpty;
	}

	//TO ADD THE CUSTOMER IN THE QUEUE.
	private static void enqueue(int data)
	{
		if(rear == size)
		{
			System.out.println("Queue is overflow now!!!");
		}
		else
		{	
			System.out.println("Enter your choice");
			System.out.printf("Press 1 for deposit\nPress 2 for withdraw");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				counterTotalMoney = counterTotalMoney + data;
				System.out.println("Current cash counter money is : "+counterTotalMoney);
			case 2:
				counterTotalMoney = counterTotalMoney - data;
				System.out.println("Current cash counter money is : "+counterTotalMoney);

			}
			queue[rear] = data;
			rear++;
		}
	}
	
	//MAIN METHOD
	public static void main(String[] args)
	{

		queue = new int[20];
		System.out.println("Enter the money amount");
		data = sc.nextInt();
		enqueue(data);

	}
}