import java.util.Scanner;

public class SwapNumbers {
public static void main(String[] args) {
	
	int a;
	int b;
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter two numbers : ");
	a = s.nextInt();
	b = s.nextInt();
	
	System.out.println("Befor swapping: a = " + a + " b = " + b);
	a = a * b;
	b = a / b;
	a = a / b;
	System.out.println("After swapping: a = " + a + " b = " + b);
}
}
