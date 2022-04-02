
public class Pattern {

	public static void main(String[] args) {
		
		int n=3,stars;
		
		for (int i=0;i<3;i++)// how many stars has print
		{
			stars = i+1;//1 //2 //3
			
			for (int j=0;j<stars;j++) //it is going to print
			{
				
				System.out.print("*");
			}
			System.out.print("\n");
		}
		//*** //0th iteration
		//** //1st
		//* //2nd
		
		// i stars   n
		// 1   3     3   
	    // 1   2     3
		// 2   1     3
		
		}

	}

