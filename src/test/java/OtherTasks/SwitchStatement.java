package OtherTasks;
import java.util.*;

public class SwitchStatement {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		double num1=sc.nextDouble();
		
		System.out.println("Enter num2 : ");
		double num2=sc.nextDouble();
		
		System.out.println("Enter operator ( +,-,*,/ ) ");
		char operator = sc.next().charAt(0);
		
		double result = 0;
		
		switch(operator) {
		 case'+':
			 result=num1+num2;
			 break;
		 case'-':
			 result=num1-num2;
			 break;
		 case'*':
			 result=num1*num2;
			 break;
		 case'/':
			 result=num1/num2;
			 break;	 
		 
		 default: 
			 System.out.println("Srry!! operator is not valid or Correct");
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}

}
