public class Judge{






	public Judge()
	{


	}

	public int findJudge(int n, int [][] trust){
		int count = 0;
		int judge = 0;
		int x = 0;


		while( x < n-1)
		{	

			for (int a = 0;a < n-1;a++) 
			{

				if (judge == trust[x][1]) 
			{
				count++;
				
			}
			else
				x++;
			}
			judge++;
			
		}
	


			if (count == n-1)
			{
				for (int y = 0;y < n-1;y++) 
				{
					if (judge == trust[y][0]) 
					{
						return -1;
					
					}
				
				}
				return judge;
				
		}
		

		
			return -1;
			
		


		
	}

	public static void main(String[] args) {
		Judge j = new Judge();

		int [][] trust = {{1,2},{4,2},{3,3}};
		int judgeIs = j.findJudge(4,trust);
		System.out.println(judgeIs);
		
		
	}


}








