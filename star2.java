
import java.io.* ;
import java.util.Scanner;


public class star2{


public static int input()
{
	int a;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter number");
    a=in.nextInt();
	return(a);
}
public static void printstar(int n)
			{
				for(int i=0;i<n;i++)
				System.out.println("*");
			}

	public static void main(String[] args) {
		int num;
		num=input();
        printstar(num);

    }

}

