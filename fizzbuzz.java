
import java.io.* ;
import java.util.Scanner;


public class fizzbuzz{


public static int input()
{
	int a;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter number");
    a=in.nextInt();
	return(a);
}
public static void fizzbuzzprint(int n)
{
				for(int i=1;i<=n;i++)
				{
				if(i%5==0 && i%3==0)
					System.out.println("fizzbuzz");
				else if(i%3==0)
					System.out.println("fizz");
				else if(i%5==0)
					System.out.println("buzz");
				else
					System.out.println(i);	
				}
}
	
	public static void main(String[] args) 
	{
		int num;
		num=input();
        fizzbuzzprint(num);

    }

}




