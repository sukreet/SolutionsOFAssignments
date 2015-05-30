
import java.io.* ;
import java.util.Scanner;


public class triangle1{


public static int input()
{
	int a;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter number");
    a=in.nextInt();
	return(a);
}
public static void triangle(int n)
{
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<=i;j++)
					System.out.print("*");
				System.out.println("");
			    }
}
	
	public static void main(String[] args) 
	{
		int num;
		num=input();
        triangle(num);

    }

}



