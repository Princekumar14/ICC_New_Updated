package OtherTasks;
import java.util.*;

public class NestedForLoop {
	public static void main(String[] args){
	   int i,j,num;
	   System.out.print("Enter number of rows : ");
	   Scanner sc = new Scanner(System.in);
	   num = sc.nextInt();

	   for(i=1;i<=num;i++){
		for(j=1;j<=i;j++)
		  System.out.print(j);

	    System.out.println("");
	    }
	}

}
