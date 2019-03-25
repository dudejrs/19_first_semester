
public class Node<T> {
	private T data ;
	private Node<T> nextNode;
	
	// Construct method
	
	public Node() {
		this(null,null);
	}	
	
	
	public Node(T d, Node<T> n) {
		this.data = d;
		this.nextNode= n;
	}
	
	
	//Access method
	
	public Node<T> getNext(){
		return this.nextNode;
	}
	
	public T getData(){
		return this.data;
	}
	
	
	//Modifier method
	
	public void setNext(Node<T> n){
		this.nextNode = n;
	}
	
	public void setData(T d) {
		this.data = d;
	}
	
}
