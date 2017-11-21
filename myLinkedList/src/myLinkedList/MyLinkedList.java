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
		Node a,b;
		
		while(temp.getNext() != null && k<=index)
		{
			temp = temp.getNext();
			k++;
		}
		a=temp.getNext(); 
		b=im.getNext();
		b=a;
			
	}
	
	public String get(int index)
	{
		return null;
		
	}
	
	public void delete(int index)
	{
		
	}
	
	public void delete(String data)
	{
		
	}
	
	public void reverse()
	{
		
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

