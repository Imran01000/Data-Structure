
public class Banking_Cash_Counter {
	
	final int size = 20;
	static int front = 0;
	static int rear = 0;
	static int[] queue;
	static int counterTotalMoney = 10000;
	static boolean checkEmpty;
	static boolean takeValue;
	
	private static boolean isEmpty()
	{
		if(front == rear)
			checkEmpty = true;
		else
			checkEmpty  = false;
	return checkEmpty;
	}
	
	public static void main(String[] args)
	{
		queue = new int[20];
		takeValue = isEmpty();
		System.out.println(takeValue);
	}
}