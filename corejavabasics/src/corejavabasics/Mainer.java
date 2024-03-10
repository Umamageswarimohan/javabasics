package corejavabasics;
import java.util.Scanner;
public class Mainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hai...");
		Scanner scanner=new Scanner(System.in);
		System.out.print("FIRST NUM");
		int num1=scanner.nextInt();
		System.out.print("SECOND NUM");
		int num2=scanner.nextInt();
		int sum=num1+num2;
		System.out.println("sum: "+sum);
		scanner.close();

	}

}
