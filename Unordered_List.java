import java.io.*;
import java.util.*;
class Node{
	String data;
	Node next;
}

public class Unordered_List {
	Node head;
	Node n2;
	Node traverse;
	String takeInput="";
	Node n1;
	boolean checkEmpty;
	
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
	private void insert(String data)
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

	private void delete(String data) {
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
					n2=traverse;
					traverse=traverse.next;
					if(traverse.data.equals(data))
					{
						n1=traverse.next;
						n2.next=n1.next;
						break;
					}
				}

			}
		}catch(NullPointerException e)
		{
			System.out.println();
		}
	}

	private void show()
	{
		Node traverse = head;
		while(traverse != null)
		{
			System.out.println(traverse.data);
			traverse=traverse.next;
		}

	}

	private void search(String data)
	{
		Node traverse=head;
		try {
				while(true)
				{
			
					if(traverse.data.equals(data))
					{
						System.out.println("already present that string");
						break;
					}
					traverse=traverse.next;
					
				}
		}catch(NullPointerException e)
		{
			System.out.println();
		}
	}
	public static void main(String[] args)throws Exception 
	{
		Unordered_List list = new Unordered_List();
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
					list.insert(string);
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
		list.insert(list.takeInput);
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
		br.close();
		sc.close();
	}
}
