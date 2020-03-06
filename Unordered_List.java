import java.io.*;

class Node {
	String words;
	Node next;
}
// Main class
public class Unordered_List{
	String line="";
	Node head;
	
	//To insert the string in the list.
	private void insert(String words)
	{
		Node node = new Node();
		node.words = words;
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
	
	//To Display the list.
	private void show()
	{
		Node traverse = head;
		while(traverse.next != null)
		{
			System.out.println(traverse.words);
			traverse = traverse.next;
		}
	}
	public static void main(String[] args) throws IOException
	{	
		Unordered_List list = new Unordered_List();
		FileReader file = new FileReader("demoFile.txt");
		BufferedReader br = new BufferedReader(file);
		String line = br.readLine();
		String[] l = line.split(" ");
		try {

			while(line != null)
			{
				for (String s : l) 
				{		
					list.insert(s);
				}
				line = br.readLine();
				l = line.split(" ");

			}

		}catch(NullPointerException e)
		{
			System.out.println();
		}

		System.out.println("linked List value");
		list.insert("Hey");
		list.insert("I am new here");
		list.insert("How are you all?");
		list.show();
		br.close();
	}
}
