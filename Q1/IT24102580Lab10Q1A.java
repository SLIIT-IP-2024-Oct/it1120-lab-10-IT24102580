import java.util.Scanner;
public class IT24102580Lab10Q1A {
	
	// method to see if mark is in the valid range or not
	public static String isvalidRange (double mark) {

		assert (mark >= 0 && mark <= 100) : "Invalid Mark";
		
		return "Mark is validated";

	}

public static void main (String...args) {
	
	Scanner sc = new Scanner (System.in);

	System.out.print ("Enter your exam mark : ");
	double input = sc.nextInt ();

	System.out.println ("Your mark "+input+" is "+isvalidRange(input));

 }
}