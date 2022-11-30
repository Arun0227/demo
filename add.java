import java.util.Arrays;
import java.util.Scanner;
public class joes {//avg and sum
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

//temp file add java 8

import java.util.*;
import java.util.stream.*;
public class JavaHungry {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
            myList.stream()
                  .filter(n -> n%2 == 0)
                  .forEach(System.out::println);
    }
}
