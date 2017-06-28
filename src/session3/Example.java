/*What happens when the following is compiled and executed*/

package session3;

public class Example {
	int x;
	int y; // declared as instance variables, x=0, y=0
	String name; // similarly name = null

	public static void main(String args[]) {
		Example pnt = new Example();
		System.out.println("pnt is " + pnt.name + " " + pnt.x + " " + pnt.y);
	}
}
// When the code is compiled and run no errors are thrown.
// the answer is d. the program prints pnt is null 0 0