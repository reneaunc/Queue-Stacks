import java.util.*;

//*******************************************************
// Test QStack
//
//*******************************************************
public class SQueueTest {
	public static void main(String[] args) {
		SQueue Stest = new SQueue();
		// test case 1
		Stest.add(1);
		Stest.add(2);
		Stest.add(3);
		Stest.add(4);
		Stest.add(5);
		Stest.remove();
		System.out.println(Stest.peek()); //Should print out 2
		Stest.remove();
		System.out.println(Stest.peek()); //Should print out 3
		Stest.remove();
		System.out.println(Stest.peek()); //Should print out 4
		Stest.clear();
		// test case 2
		Stest.add(2);
		Stest.add(4);
		Stest.add(8);
		Stest.remove();
		System.out.println(Stest.peek()); //Should print out 4
		Stest.remove();
		System.out.println(Stest.peek()); //Should print out 8
		System.out.println(Stest.isEmpty()); //Should print out false
		Stest.clear();
		// test case 3
		Stest.add(3);
		Stest.add(6);
		Stest.add(9);
		Stest.remove();
		System.out.println(Stest.peek()); //Should print out 6
		System.out.println(Stest.isEmpty()); //Should print out false
		Stest.clear();
	}
}