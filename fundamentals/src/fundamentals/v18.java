package fundamentals;
import java.util.*;
public class v18 {
	
	

	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int y=s.nextInt();
	  int z=0;
	  int i;
	while(y!=0)
	{ 
	i=y%10;
	z=z+i;
	y=y/10;	
	}
	   System.out.println("sum\t"+z);
	}
}
