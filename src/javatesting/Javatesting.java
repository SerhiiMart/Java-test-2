package javatesting;

//import java.math.BigDecimal;
import java.util.Scanner;

public class Javatesting {

	public static void main(String[] args) {
//		System.out.println("What's your name?");
//		
		Scanner scanner = new Scanner(System.in); 
//		String name = scanner.nextLine();
//		System.out.println("Hello " + name);
//		int x = scanner.nextInt();
//		int y = x * 35;
//		System.out.println("Number is : " + y);
//		BigDecimal money = scanner.nextBigDecimal();
//		System.out.println(Double.NaN);
//		System.out.println(Math.sqrt(-1));
//		System.out.println(Double.isNaN(Math.sqrt(-1)));
		
		
//		int a = 5;
//		double x = (double) a / 2;
//		System.out.println(x);
		
//		int x = 10;
//		int y = 20;
//		System.out.println(Integer.max(x, y));
//		System.out.println(Integer.compare(x, y));
//		String money = "3000";
//		Integer mObject = Integer.valueOf(money); //Object
//		int mInt = Integer.parseInt(money); // Integer
//		System.out.println(mObject);
//		System.out.println(mInt);
		
		String x = "Hello String";
		System.out.println(x + " and other ... \n things");
		x += " and f***** Java";
		System.out.println(x);
		
		String nameS = "Serhii";
		System.out.println(String.format("Hello %s", nameS));
		
	}
}
