public class MultTable
{
	public static void main(String[] args)
	{
		for(int i = 1;i < 10;i++)//行循环
		{
			for(int j = 1;j <=i;j++)
				//每行输出小于行数的式子
			{
				System.out.print(i+"*"+j+"="+(i*j)+"\t" );
				//输出 i * j = i*j
			}
				System.out.print('\n');
				//换行
		}		
	}	
}