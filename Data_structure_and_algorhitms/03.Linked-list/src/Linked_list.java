
public class Linked_list<T> {
	protected int sizeOfList;
	protected Node<T> head;
	protected Node<T> tail;
	
	
	public Linked_list(){
		this.head=this.tail=null;
		this.sizeOfList=0;
	}
	
	//Access method
	
	public int getSize(){
		return this.sizeOfList;
	}
	
	
	public void print() {
		Node<T> temp = this.head;
		while(temp != null) {
			System.out.print(temp.getData()+" ");
		}
	}
	
	// Modifier method
	
	public void insert_front(T d) {
		Node<T> n = new Node<T>(d,head);
		this.head = n;
		this.sizeOfList++;
	}
	
	public void insert_back(T d) {
		Node<T> n = new Node<T>(d,null);
		this.tail.setNext(n);
		this.sizeOfList++;	
	}
	
}
