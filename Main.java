import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		Scanner input = new Scanner(System.in);
		System.out.println("done");
		{
		System.out.println("LIST");
		List<String> list = new List<String>();
		System.out.print("next |-> ");
		String in = input.next();
		int i;
		while(in.compareTo("404") != 0){
			System.out.print("next |-> ");
			in = input.next();
			list.append(in);
			i = 0;
			list.toFront();

			while(list.hasAccess()) {
				i++;
				System.out.println(i+":\t"+list.current());
				list.next();
			}
			
		}
		}
		{
		System.out.println("QUEUE");
		Queue<String> queue = new Queue<String>();
		System.out.print("next |->");
		String in = input.next();
		while(in.compareTo("404") !=0) {
			queue.enqueue(in);
			System.out.print("next |->");
			in = input.next();
		}
		while (!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
		}
	}
}
