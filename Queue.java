public class Queue<T>
{
	Node<T> start, end;

	Queue() {

	}

	public T enqueue(T content) {
		
		Node<T> n = new Node<T>(content);
		if(start == null) {
			start = n;
			end = n;
		}
		else{
			end.nextNode = n;
			n.lastNode = end;
			end = n;
		}
		return content;
	}
	public T dequeue() {
		Node<T> n = start;
		start = start.nextNode;
		if(start == null) return n.content;
		start.lastNode = null;
		return n.content;
	}
	public T front(){
		return start.content;
	}
	public boolean isEmpty() {
		return(start == null);
	}
}
