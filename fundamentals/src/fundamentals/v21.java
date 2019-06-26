package fundamentals;
import java.util.*;
public class v21 {
	
	

	public static void main(String args[])
	{

	Scanner s=new Scanner(System.in);
	System.out.println("enter the number:");
	int n=s.nextInt();
	int z=0;
	while(n>0)
	{
	z=(z*10)+(n%10);
	n=n/10;
	}
	System.out.println(z);
	}

	}


