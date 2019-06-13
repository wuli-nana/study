public class Class03
{
	public static void printIsGreatThan10(int n)
	{
		if(n > 10)
		{
			System.out.printf("%d 是大于10的%n",n);
		}
	}
	public static void printColor(String color)
	{
		switch(color)
		{
			case "Red":
				System.out.println("红色");
				break;
			case"Yellow":
				System.out.println("黄色");
				break;
			default:
				System.out.println("不知道是什么颜色");
				break;
		}
	}
	
	public static void foreach(int [] array)
	{
		for (int )
	}
	public static void main( String[] args)
	{
		printGreaterThan(100);
		printGreaterThan(9);
		
		printColor(args [0]);
	}
}