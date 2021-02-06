import java.util.*;

//*******************************************************
// Test QStack
//
//*******************************************************
public class QStackTest {
	public static void main(String[] args) {
		QStack Qtest = new QStack();
		// test case 1
		Qtest.push(1);
		Qtest.push(2);
		Qtest.push(3);
		Qtest.push(4);
		Qtest.push(5);
		Qtest.pop();
		Qtest.pop();
		Qtest.pop();
		System.out.println(Qtest.top()); //Should print out 2
		Qtest.clear();
		// test case 2
		Qtest.push(2);
		Qtest.push(4);
		Qtest.push(8);
		Qtest.pop();
		Qtest.pop();
		System.out.println(Qtest.isEmpty()); //Should print out false
		Qtest.clear();
		// test case 3
		Qtest.push(3);
		Qtest.push(6);
		Qtest.push(9);
		Qtest.pop();
		System.out.println(Qtest.top()); //Should print out 6
		System.out.println(Qtest.isEmpty());//Should print out false
		Qtest.clear();
	}
}