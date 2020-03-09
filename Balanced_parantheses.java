iimport java.util.Scanner;

public class Balanced_parantheses
{
	//VARIABLES.
	static int size;
	static int top = -1;
	static char[] stack;
	static boolean checkEmpty;
	static boolean check;
	static int choice;
	static char data;
	static int value;
	static int itr=0;
	
	//TO CHECK WHEATHER THE STACK IS EMPTY OR NOT.
	private boolean isStackEmpty()
	{
		if(top == -1)
		{
			checkEmpty = true;
		}
		else
		{
			checkEmpty = false;
		}
		return checkEmpty;
	}
	 
	//TO PUSH THE ELEMENT TO THE STACK.
	private void push(char data) 
	{
		if(top == size)
		{
			System.out.println("Stack is overflow!!!");
		}
		else
		{
			top++;
			stack[top] = data;
		}
	}
	
	//TO REMOVE THE ELEMENT FROM THE STACK.
	private int pop()
	{
		if(isStackEmpty())
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			data = stack[top];
			stack[top] = 0;
			top--;
		}
		return data;
	}
	//TO TAKE THE TOP ELEMENT OF STACK.
	private int peek() 
	{
		return stack[top];
	}
	
	//TO RETURN TOTAL SIZE OF STACK.
	private int totalSize()
	{
		return size;
	}
	
	//TO DISPLAY THE STACK.
	private void display()
	{
		for (char c : stack) {
			System.out.println(c);
		}
	}

	//MAIN METHOD.
	public static void main(String[] args)
	{
		Balanced_parantheses bp = new Balanced_parantheses();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your stack");
		size = sc.nextInt();
		stack = new char[size];
		System.out.println("Enter you choice");
		System.out.printf("1.push\n2.pop\n3.peek\n4.size\n5.display\n6.To exit");
		choice = sc.nextInt();
		while(true)
		{
			switch(choice)
			{
			case 1:
				System.out.println("Enter the character");
				data = sc.next().charAt(0);
				bp.push(data);
				break;
				
			case 2:
				value = bp.pop();
				System.out.println("Deleted element is : "+value);
				break;
				
			case 3:
				value = bp.peek();
				System.out.println("the top element is : "+value);
				break;
				
			case 4:
				value = bp.totalSize();
				System.out.println("Total size of stack : "+value);
				break;
				
			case 5:
				System.out.println("++++++++++++++++++++");
				bp.display();
				break;
			case 6:
				System.exit(1);
				
			}
			System.out.printf("1.push\n2.pop\n3.peek\n4.size\n5.display\n6.To exit");
			choice = sc.nextInt();
			itr++;
			
		}
		
	}
	
}
