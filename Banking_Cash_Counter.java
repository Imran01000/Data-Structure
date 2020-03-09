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
	static int value;
	static int choice;
	static int iteration = 0;

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
			System.out.println("Cash counter queue is full please customer come to later!!!");
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
				break;
				
			case 2:
				counterTotalMoney = counterTotalMoney - data;
				System.out.println("Current cash counter money is : "+counterTotalMoney);
				break;
			}
			queue[rear] = data;
			rear++;
		}
	}
	
	//TO REMOVE THE CUSTOMER FROM THE QUEUE.
	private static int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("No one is there in the cash counter queue");
		}
		else
		{
			value = queue[rear];
			System.out.println("customer is gone which had amount money"+value);
			for(int itr = 0 ; itr < rear-1 ;itr++)
			{
				queue[itr] = queue[itr+1];
			}
			rear--;
		}
		return value;
	}
	
	//TO DISPLAY THE QUEUE.
	private static void display()
	{
		for (int money : queue) {
			System.out.println(money);
		}

	}

	//MAIN METHOD
	public static void main(String[] args)
	{
		queue = new int[20];
		while(true)
		{
			System.out.println("Enter your choice");
			System.out.printf("1.enqueue\n2.dequeue");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Hii customer!!!");
				System.out.println("Enter the money amount");
				data = sc.nextInt();
				enqueue(data);
				break;

			case 2:
				dequeue();
				break;

			case 3:
				System.out.println("+++++++++++++++++++++++++++++++++++++");
				display();
				break;

			case 4:
				System.exit(1);
			}
		}
	}
}