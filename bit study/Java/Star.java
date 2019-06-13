public class Star
{
	public static void main(String[] args)
	{
		for(int i = 1;i <= 6;i++)//定义行循环，一共六行
		{
			for(int j = 1;j <=i;j++)
			{
				System.out.print("*  " );//输出*，并且空两格，留足位置
			}
				System.out.print('\n');//换行
		}		
	}	
}