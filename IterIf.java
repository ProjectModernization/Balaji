import java.util.Scanner;

public class IterIf {
	
	public static void main(String[] args){
		int Num1;
		int Num2;
		int result;
		String operator = "+";
		Scanner keyboard = new Scanner(System.in);
		
		
		for(int i = 0; i < 3; i++){
			System.out.println("Enter First Number     :");
			Num1 = keyboard.nextInt();
			System.out.println("Enter Second Number      :");
			Num2 = keyboard.nextInt();
			System.out.println("Enter operator (+ or *) : ");
			operator = keyboard.next();
			
			result = 0;
			
			if(operator.equals("+")){
				result = Num1 + Num2;
			} else if(operator.equals("*")){
				result = Num1 * Num2;
			}
			System.out.println("Result is = " + result);
		}
	}

}
