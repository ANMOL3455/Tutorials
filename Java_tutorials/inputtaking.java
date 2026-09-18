/*

java has different ways of taking input and that includes :
1. using scanner class
>> this includes initialization of an object that will be stored inside a variable having the same type name with the 
object name.
>> we should import scanner class that is inside the other class .
>> for this command [import java.util.Scanner] is used 

1.1.  this class have different menthods to take different types of datas and they are:
nextInt()
nextDouble()
nextChar() and so on.....


*/
import java.util.Scanner;
public class inputtaking{
	public static void main(String... args){

		Scanner inputfunc = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int a = inputfunc.nextInt();
		System.out.println("Please enter the other number: ");
		int b = inputfunc.nextInt();
		System.out.println("The sum of  "+ a + " and " + b + " is "+ (a+b));
		
	}
	
	
	
}