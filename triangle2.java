
import java.io.* ;
import java.util.Scanner;


public class triangle2{


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
				for(int i=1;i<=n;i++)
				{
					for(int k=n-i; k>0; k--)
					System.out.print(" ");
					
					for(int j=1;j<=2*i-1;j++)
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




