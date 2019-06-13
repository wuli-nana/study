public class Practice
{
	//利用递归来编写n!
	public static long factorial1(int n)
	{
		if (n == 0||n == 1)//1!=1	0!=1
		{
			return 1;
		}
		else
		{
			return factorial1(n-1)*n;
		}
	}
	//利用循环计算n！
	public static long factorial2(int n)
	{
		long fact = 1;
		//一共循环n次
		for(int i = 1; i <= n; i++)
		{
			fact = fact * i;	
		}
		return fact;
		
	}
	public static double calcE1(int n)
	{
		double e = 0;
		for(int i = 1;i < n ;i++)
		{
			e = e + ((double)(1) / factorial1(i));
			//转换为double类型
			
		}
		return e;
	}
	public static double calcE2(double precision)
	{
		double e = 0;
		int n = 0;
		while (true)
		{
			double item = 1.0/factorial1(n++);
			e += item;
			if (item < precision)
			{
				break;
			}
		}
		return e;
	}
	
	
	
	public static String  reverse(String s)
	{
		int length = s.length;
		for(int i = length-1; i >= 0; i--)
		{
			char ch = s.charAt(i);
			r = r + ch;
		}
		return r;
	}
	public static void main(String[] args)
	{
		int n = 12;
		long fact1 = factorial1(n);
		System.out.printf("阶乘是%d%n",fact1);
		long fact2 = factorial2(n);
		
		System.out.printf("阶乘是%d%n",fact2);
		
		double e =calcE1(10);
		System.out.printf("e = %f%n",e);
		e = calcE(1E-4);
		System.out.printf("e = %f%n",e);
		
		System.out.println(reverse("hello"));
	}

}