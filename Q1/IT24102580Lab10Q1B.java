import java.util.Scanner;
public class IT24102580Lab10Q1B {

	public static String isvalidRange (double number) {

		assert (number >= 0 && number <= 100) : "Invalid Mark";
		
		return "validated";

	}
	
	// method to calculate grade
	public static char calculateGrade (double mark1) {

			if (mark1 >= 75) {

				return 'A';

			} else if (mark1 >= 60) {

				return 'B';
			
			} else if (mark1 >= 50) {

				return 'C';
			
			} else if (mark1 >= 40) {

				return 'D';
			
			} else {
				
				return 'F';
			}
		
	} 
	
	// method to calculate if valid grade assigned for marks
	public static char isvalidGrade (double mark2) {

		char grade = calculateGrade (mark2);
		
		assert ((mark2 >= 75 && calculateGrade (mark2) == 'A') || (mark2 >= 60 && calculateGrade (mark2) == 'B')) ||
			(mark2 >= 50 && calculateGrade (mark2) == 'C') || (mark2 >= 40 && calculateGrade (mark2) == 'D') ||
			(mark2 >= 0 && calculateGrade (mark2) == 'F') : "Invalid grade assigned";

		return grade;		
	}


public static void main (String...args) {
	
	Scanner sc = new Scanner (System.in);

	System.out.print ("Enter your exam mark : ");
	double input = sc.nextInt ();

	System.out.println ("Your mark "+input+" is "+isvalidRange(input));
	System.out.println ("Your grade for "+input+" is "+isvalidGrade(input));

 }
}