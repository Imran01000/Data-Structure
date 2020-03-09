import java.io.*;
import java.util.*;
//NODE CLASS>
class Node<T>{
	T data;
	Node next;
}

//MAIN CLASS
public class Unordered_List<T> {
	Node head;
	Node previousNode;
	Node traverse;
	T takeInput ;
	Node currentNode;
	int count=0;
	static int listSize;
	static int takeIndex;
	boolean checkEmpty;

	//TO CHECK WHEATHER THE LINKEDLIST IS EMPTY OR NOT.
	private boolean isEmpty()
	{
		if(head == null)
		{
			System.out.println("Linkedlist is empty");	
			checkEmpty = true;
		}
		else
		{
			System.out.println("linked list is not empty");
			checkEmpty = false;
		}
		return checkEmpty;
	}

	//TO ADD THE ELEMENT TO THE LINKEDLIST.
	private void append(T data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node traverse = head;
			while(traverse.next != null)
			{
				traverse = traverse.next;
			}
			traverse.next = node;
		}
	}

	//TO ADD THE ELEMENT THE ELEMENT IN THE SPECIFIC POSITION.
	private void insertAt(int position , T data)
	{
		Node node  = new Node();
		node.data = data;
		node.next = null;

		traverse = head;
		while(true)
		{
			currentNode = traverse;
			traverse=traverse.next;
			count++;
			if(count == position)
			{
				previousNode = traverse.next;
				traverse.next = node;
				node.next = traverse.next;
			}
		}

		//TO GET THE ELEMENT INDEX.
	}
	private int index(T data)
	{
		traverse = head;
		while(!traverse.data.equals(data))
		{
			count++;
			traverse = traverse.next;
			if(traverse.data.equals(data))
				break;
			else if(traverse.next == null)
			{
				break;
			}
		}
		return count;
	}

	//TO DELETE THE SPECIFIC ELEMENT.
	private void delete(T data) {
		try {
			if(head.data.equals(data))
			{
				head=head.next;
			}
			else 
			{
				Node traverse=head;
				Node n1;
				while(true)
				{
					Node n2;
					previousNode = traverse;
					traverse = traverse.next;
					if(traverse.data.equals(data))
					{
						currentNode = traverse.next;
						previousNode.next = currentNode.next;
						break;
					}
					else if(traverse.next == null)
					{
						System.out.println("Can't delete string is not there!!");
					}

				}

			}
		}catch(NullPointerException e)
		{
			System.out.println();
		}
	}

	//TO DISPLAY THE ELEMENTS.
	private void show()
	{
		Node traverse = head;
		while(traverse != null)
		{
			System.out.println(traverse.data);
			traverse=traverse.next;
		}

	}

	//TO SEARCH THE PARTICULAR ELEMENT.
	private int size()
	{
		try {
			Node traverse = head;
			while(traverse.next != null)
			{
				count++;
			}
		}catch(NullPointerException e)
		{
			System.out.println();
		}
		return count;
	}

	//TO SEARCH THE PARTICULAR ELEMENT.
	private void search(T data)
	{
		Node traverse=head;
		try {
			while(true)
			{

				if(traverse.data.equals(data))
				{
					System.out.println("already present that string!!");
					break;
				}
				else if(traverse.next == null)
				{
					System.out.println("String is not there!!");
				}

				traverse=traverse.next;

			}
		}catch(NullPointerException e)
		{
			System.out.println();
		}
	}

	//MAIN METHOD.
	public static void main(String[] args)throws Exception 
	{
		Unordered_List<String> list = new Unordered_List<String>();
		Scanner sc = new Scanner(System.in);
		File f2 =new File("xyz.txt");
		f2.createNewFile();
		FileReader fr = new FileReader(f2);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		String[] l=line.split(" ");
		try
		{
			while(line!=null)
			{
				for (String string : l) 
				{
					list.append(string);
				}
				line=br.readLine();
				l=line.split(" ");
			}
		}catch(NullPointerException e)
		{
			System.out.println();
		}
		System.out.println("linkedlist values");
		list.show();
		System.out.println("Enter the string to add into the file");
		list.takeInput=sc.nextLine();
		list.append(list.takeInput);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		list.show();
		System.out.println("Enter the string to delete into the file");
		list.takeInput=sc.nextLine();
		list.delete(list.takeInput);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		list.show();
		System.out.println("Enter the string to be search");
		list.takeInput = sc.nextLine();
		list.search(list.takeInput);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		list.isEmpty();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Enter the string to get it position");
		list.takeInput = sc.nextLine();
		takeIndex = list.index(list.takeInput);
		System.out.println("position is : "+takeIndex);
		System.out.println();
		br.close();
		sc.close();
	}
}
