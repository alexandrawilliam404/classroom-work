import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = add(a,b);
		System.out.println("The sum is: " + sum);
	}
	public static int add(int a, int b){
		return a+b;
	}
}