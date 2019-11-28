public class Stack<T>
{
	Node<T> end;

	Stack() {

	}

	public T push(T content) {
		Node<T> n = new Node<T>(content);
		n.lastNode = end;
		end.nextNode = n;
		end = n;
		return content;
	}
	public T pop() {
		Node<T> n = end;
		end = end.lastNode;
		if(end == null) return n.content;
		end.nextNode = null;
		return n.content;
	}
	public T top(){
		return end.content;
	}
	public boolean isEmpty() {
		return(end == null);
	}
}
