package myLinkedList;

public class LinkedTest {

	public static void main(String[] args) 
	{
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add(0,"biryani");
		linkedList.add(1,"thali");
		linkedList.add(1,"rice");

		for (String item : linkedList) {
			System.out.println(item);
		}
	}

}
