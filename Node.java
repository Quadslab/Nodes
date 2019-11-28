public class Node<T>
{
	public T content;
	public Node<T> nextNode, lastNode;
	Node (T content) {
		this.content = content;
	}
}
