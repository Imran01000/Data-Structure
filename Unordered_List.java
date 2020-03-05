import java.io.*;
class Node {
	String words;
	Node next;
}

public class Unordered_List{
	
//	Node head;
//	private void insert(String words)
//	{
//		Node node = new Node();
//		node.words=words;
//		node.next=null;
//		if(head == null)
//		{
//			head = node;
//
//		}
//		else
//		{
//			Node n=head;
//			while(n.next!=null)
//			{
//				n=n.next;
//			}
//			n.next=node;
//		}
//	}
//	private void show()
//	{
//		Node p=head;
//		while(p.next!=null)
//		{
//			System.out.println(p.words);
//			p=p.next;
//		}
//	}
	public static void main(String[] args) throws IOException
	{	
		Unordered_List list = new Unordered_List();
		File demoFile = new File("demoFile.txt");
		demoFile.createNewFile();
		FileReader file = new FileReader("demoFile.txt");
		BufferedReader br = new BufferedReader(file);
		String line = br.readLine();
		String[] array = new String[100];
		int i=0;
		while(i==array.length)
		{
			array[i]=line;
		}
		array = line.split(" ");
		
		while(line!=null || i==array.length)
		{
			System.out.println(array[i]);
			line = br.readLine();
			i++;
		}
		br.close();
	}
}
