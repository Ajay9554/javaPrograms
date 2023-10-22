//
//public class arrays {
//
//	public static void main (String[] args)
//	{
//		int a[]= {1,2,3,4,5};
//	for(int b:a) {
//	System.out.println(b);	
//	}
//	
//}
//}
import java.util.*;

class arrays{
	public static void main(String[]args)
	{
		int a[]=new int[5];
		System.out.println("Enter the array element: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();	
		}
		Arrays.sort(a);
		System.out.println("\n array element: ");
			for(int b : a) {
			System.out.print(b+"  ");
		}
		
	}
}