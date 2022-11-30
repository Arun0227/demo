import java.util.Arrays;
import java.util.Scanner;
public class add {//avg and sum
	public static void main(String[] args){
		System.out.println("enter the limit");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0,a;
		for (int i=1;i<=n;i++){
			System.out.println("enter number"+i+":");
			a=in.nextInt();
			sum=sum+a;
		}
		System.out.println("sum of"+sum);
		System.out.println("avg of"+sum/n);
	}
}