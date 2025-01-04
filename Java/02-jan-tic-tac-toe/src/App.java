import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char [][]arr=new char[3][3];
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				arr[i][j]=sc.next().charAt(0);
		//check if we got inputs correctly or not
		
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		

		int xCount=0;
		int oCount=0;
		
		//rows check
		for(int i=0;i<3;i++)
		{
			xCount=0;
			oCount=0;
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]=='X')
				{
					xCount++;
				}else
				{
					oCount++;
				}
			}
			//at the end of inner loop, 1 row is over
//			System.out.printf("%dth row X=%d and O=%d\n",i,xCount,oCount);
			if(xCount==3)
			{
				System.out.println("Meyyappan");
				return;	//or System.exit(0);
			}
			if(oCount==3)
			{
				System.out.println("Roshan");
				return;
			}
		}
		
		//cols check
		for(int j=0;j<3;j++)
		{
			xCount=0;
			oCount=0;
			for(int i=0;i<3;i++)
			{
				if(arr[i][j]=='X')
				{
					xCount++;
				}else
				{
					oCount++;
				}
			}
			//at the end of inner loop, 1 col is over
//			System.out.printf("%dth col X=%d and O=%d\n",j,xCount,oCount);
			if(xCount==3)
			{
				System.out.println("Meyyappan");
				return;	//or System.exit(0);
			}
			if(oCount==3)
			{
				System.out.println("Roshan");
				return;
			}
		}
		
		//diagonal 1
		xCount=0;
		oCount=0;
		for(int i=0;i<3;i++)
		{
			if(arr[i][i]=='X')
			{
				xCount++;
			}else
			{
				oCount++;
			}
		}
		//end of diagonal 1
		
		if(xCount==3)
		{
			System.out.println("Meyyappan");
			return;	//or System.exit(0);
		}
		if(oCount==3)
		{
			System.out.println("Roshan");
			return;
		}
		
		//2nd diagonal check
		xCount=0;
		oCount=0;
		for(int i=0;i<3;i++)
		{
			xCount=0;
			oCount=0;
			
				if(arr[i][2-i]=='X')
				{
					xCount++;
				}else
				{
					oCount++;
				}
			
			//end of diagonal 2 check
			
			if(xCount==3)
			{
				System.out.println("Meyyappan");
				return;	//or System.exit(0);
			}
			if(oCount==3)
			{
				System.out.println("Roshan");
				return;
			}
		}
	}

}
