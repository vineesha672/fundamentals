package fundamentals;

public class v16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,j=0,count=0;
		for(i=10;i<=99;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i);
		}
		
	}

}
