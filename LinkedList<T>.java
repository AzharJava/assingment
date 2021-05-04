public class LinkedList<T> {
	
	private Node<T> head;
	
	//This internal class represents Node in Linked List
	private static class Node<T>{
		
		private T data;
		private Node<T> next;
		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	
//This method returns size
//length of Linked List
		 
	public int size() {
		int length = 0;
		if(head ==  null) {
			return length;
		}
		
		Node<T> currentNode = head;
		while (currentNode != null) {
			length ++;
			currentNode = currentNode.next;
		}
		return length;
	}
	
	
	 //This method insert Node in Linked List
	 
	public void insert(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head == null) {
			head = newNode;
		}else {
			Node<T> currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			 currentNode.next = newNode;
		}
	}
	
		 // Method which traverse Linked List and display all data.
	 
	public void displayLinkedList() {
		Node<T> currentNode = head;
		while(currentNode!= null) {
			System.out.print(currentNode.data+"->");
			currentNode = currentNode.next;
		}
		System.out.println(currentNode);
	}
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.insert(5);
		linkedList.insert(10);
		linkedList.insert(15);
		linkedList.insert(20);
		linkedList.insert(25);
		
		System.out.println("Linked List is:");
		linkedList.displayLinkedList();
		
		System.out.println("Size of Linked List is :"+linkedList.size());
		
	}
}



//OUTPUT
//Linked List is:
//5->10->15->20->25->null
//Size of Linked List is :5
