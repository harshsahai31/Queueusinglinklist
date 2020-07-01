package Queues;

public class Queue {
	private int size;
	private Node head;// front
	private Node head2;  // rear

	private static class Node{
		private int data;
		private Node next;
		public Node(int data){
			this.data=data;
			this.next=next;
		}

	} public boolean isempty(){
		boolean p = false;
		if(head==null){
			p=true;
		} return p;
	}  public void enqueue(int data) {
		Node n = new Node(data);
		if(head==null){
			head=n;
			head2=n;
			size++;
		}else{
			head2.next=n;
			head2=n;
			size++;
		}
		} public Node dequeue(){
		Node n =null;
		if(head!=null){
			if(head.next!=null){
				n = new Node(head.data);
				head = head.next;
				size--;
			} else{
				n = new Node(head.data);
				head = null;
				head2 = null;
				size--;
			}

		} return n;

	}  public Node getpeak(){
		Node n = null;
		if(head!=null){
			n = new Node(head.data);

		} return n;
	} public int getSize(){
		return size;
	}

	public static void main(String[] args) {
		Queue qu = new Queue();
		qu.enqueue(1);
		qu.enqueue(2);
		qu.enqueue(3);
		qu.enqueue(4);
		System.out.println(qu.getpeak().data);
		System.out.println(qu.dequeue().data);
		System.out.println(qu.dequeue().data);
		System.out.println(qu.dequeue().data);

	}
}
