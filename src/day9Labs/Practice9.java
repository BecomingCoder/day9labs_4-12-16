package day9Labs;

import java.math.BigDecimal;
import java.util.*;

public class Practice9 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		BigDecimal m = new BigDecimal("0.2");
		
		BigDecimal m1 = new BigDecimal("0.7");
		
		BigDecimal res = m.add(m1);
		
		System.out.println(res);
		
		
		try {
			
			
			int x = getValidNumberInRange(0, 500000);
			
			int y = getValidNumberInRange(1, 500000);
			
			//int res = x/y;
			System.out.println(res);	
		}
		catch(ArithmeticException e) {
			System.out.println("You cannot have y as zero!");
		}
		catch(Exception e) {
			System.out.println("General Error!");
		}
		
	}

	public static int readValidInteger() {
		while (true) {
			try {
				System.out.println("Please enter an integer: ");
				int input = sc.nextInt();
				//sc.nextLine();
				return input;
			}
			catch(InputMismatchException e) {
				System.out.println("You cannot input a string!");
				//sc.nextLine();
			}
			catch(ArithmeticException e) {
				System.out.println("You cannot have y as zero!");
				//sc.nextLine();
			}
			catch(Exception e) {
				System.out.println("General Error!");
				//sc.nextLine();
			}
			finally {
				sc.hasNextLine();
			}
		}
	}

	public static int readValidIntegerNoExp() {
		while (true) {
			if (sc.hasNextInt())
				break;
			sc.nextLine();
			
			}
		int x = sc.nextInt();
		sc.nextLine();
		return x;
	}

	public static int getValidNumberInRange(int min, int max) {
		
		int input = readValidIntegerNoExp();
		while ((input < min) || (input > max)) {
			System.out.println();
			input = readValidIntegerNoExp();
		}
		return input;
	}
}