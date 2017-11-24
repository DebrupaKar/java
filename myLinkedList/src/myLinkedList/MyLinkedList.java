package myLinkedList;

import java.util.Iterator;

public class MyLinkedList implements Iterable<String>
{
	private Node head;

	public void add(String data) 
	{
		Node newNode = new Node(data);
		if (head == null) 
		{
			head = newNode;
			return;
		}
		
		Node lastNode = head;
		
		while (lastNode.getNext() != null) 
		{
			lastNode = lastNode.getNext();
		}
		
		lastNode.setNext(newNode);
	}
	
	public void add(int index, String data)
	{
		int k=0;
		Node temp = head;
		Node im = new Node(data);
		
		while(temp.getNext() != null && k<index-1)
		{
			temp = temp.getNext();
			k++;
		}
	
		im.setNext(temp.getNext());
		temp.setNext(im);	
	}
	
	public String get(int index)
	{
		int k=0;
		Node temp = head;
		
		while(temp.getNext() != null & k<=index)
		{
			if(k==index)
				break;
			temp = temp.getNext();
			k++;
		}
		
		
		return temp.getData();
		
	}
	
	public void delete(int index)
	{
		int k=0;
		Node temp = head;
		
		while(temp.getNext() != null && k<=index)
		{
			
			if(k==(index-1))
				break;
			temp = temp.getNext();
			k++;
		}
		
		temp.setNext(temp.getNext().getNext());
	}
	
	public void delete(String data)
	{
		Node temp = head;
		Node temp1=head;
		
		while(temp.getNext() != null)
		{
			if(temp.getData()==data)
				break;
			
			temp1=temp;
			temp = temp.getNext();
		}
	
		temp1.setNext(temp.getNext());                                                                                                                                                                                         
	}
	
	public void reverse()
	{
		Node temp=head;
		int count =0;
		
		int i=0;
		
		while(temp.getNext()!=null)
		{
			t[i] = temp.getData();
			System.out.println(t[i]);
			i++;
			temp=temp.getNext();
		}
		//System.out.println(count);
		
//		for(int j= count-1 ; j>0 ; j--)
//		{
//				System.out.println(t[i]);
//		}
	}

	private class Node {

		private String data;
		private Node next;
		int index;

		public Node(String data) {
			super();
			this.data = data;
		}

		public Node(String data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}
		
		

	}
	
	public Iterator<String> iterator() 
	{
		class BoxIterator implements Iterator<String> 
		{

			Node current = head;
			
			@Override
			public boolean hasNext() 
			{
				if(current == null)
				{
					return false;
				}
				
				else
				{
					return true;
				}
			}

			@Override
			public String next() 
			{
				String data = current.getData();
				current = current.getNext();
				return data;
			}

		}
		BoxIterator iterator = new BoxIterator();
		return iterator;
	}
}

