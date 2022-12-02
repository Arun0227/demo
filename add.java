import java.util.Arrays;
import java.util.Scanner;
/*public class add {//avg and sum
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
}*/
//temp file add java 8
/*public class JavaHungry {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
            myList.stream()
                  .filter(n -> n%2 == 0)
                  .forEach(System.out::println);
    }
}*/

//new program
import java.util.stream.*;
import java.util.function.Function;

public class JavaHungry {
    public static void main(String args[]) {
            String input = "Java Hungry Blog Alive is Awesome";

            Character result = input.chars() // Stream of String       
                                    .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                                    .entrySet()
                                    .stream()
                                    .filter(entry -> entry.getValue() > 1L)
                                    .map(entry -> entry.getKey())
                                    .findFirst()
                                    .get();
            System.out.println(result);                    
    }
}