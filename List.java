public class List<T>
{
	Node<T> start, end, ptr;
	
	public List() {
		start = new Node<T>(null);
		end = null;
		ptr = start;
	}
	public List(T[] array) {
		start = new Node<T>(array[0]);
		start.lastNode = null;
		ptr = start;
		for(int i = 1; i < array.length; i++) {
			ptr.nextNode = new Node<T>(array[i]);
			ptr.lastNode = new Node<T>(array[i-1]);
			ptr = ptr.nextNode;
		}
		end = ptr;
		ptr = start;
	}
	public Node<T> append(T o) {
		Node<T> n = new Node<T>(o);
		if( end == null) {
			start = n;
			
		}
		else{
			end.nextNode = n;
			n.lastNode = end;
		}
		end = n;
		return n;
	}
	public Node<T> insert(T o) {
		Node<T> n = new Node<T>(o);
		n.nextNode = ptr;
		if(ptr.lastNode == null) {
			start = n;
			n.lastNode = null;
		} else{
			n.lastNode = ptr.lastNode;
		}
		ptr.lastNode.nextNode = n;
		ptr.lastNode = n;
		return n;
	}
	public T remove() {
		Node<T> n = ptr;
		if(ptr.nextNode == null) {
			if(ptr.lastNode == null) {
				ptr = null;
				return n.content;
			}
			ptr.lastNode.nextNode = null;
			ptr = null;
			return n.content;
		}
		ptr.nextNode.lastNode = ptr.lastNode;
		if(ptr.lastNode == null) {
			if(ptr.nextNode == null) {
				ptr = null;
				return n.content;
			}
			ptr.nextNode.lastNode = null;
			ptr = null;
			return n.content;
		}
		ptr.lastNode.nextNode = ptr.nextNode;
		ptr = null;
		return n.content;
	}
	public T current() {
		return ptr.content;
	}
	public T toFront() {
		ptr= start;
		return ptr.content;
	}
	public T toLast() {
		ptr = end;
		return ptr.content;
	}
	public T next() {
		ptr = ptr.nextNode;
		return ptr==null?null:ptr.content;
	}
	public boolean isEmpty() {
		return (start.content == null|| end.content == null);
	}
	public boolean hasAccess() {
		return ptr != null;
	}
}
