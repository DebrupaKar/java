package myLinkedList;

public class LinkedTest {

	public static void main(String[] args) 
	{
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add(2,"e");

//		for (String item : linkedList) {
//			System.out.println(item);
//		}
		
//		linkedList.delete(2);
//		//String s = linkedList.get(2);
//		
//		//System.out.println(s);
//		System.out.println("\nNew");
//		for (String item : linkedList) {
//			System.out.println(item);
//		}
		
//		linkedList.delete("c");
//		
//		for (String item : linkedList) {
//			System.out.println(item);
//		}
		
		linkedList.reverse();
	}
}
