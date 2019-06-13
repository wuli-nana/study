/*
*
*
*
*
*
*/


class date
{
	private int year;
	private int month;
	private int day;
	
	//构造方法
	public date(int year, int month, int day)
	{
		//基本检查
		if(year<1900||year>2100)
		{
			System.out.println("Warning-year")；
			return ;
		}
		if(month<1||year>12)
		{
			System.out.println("Warning-month")；
			return ;
		}
		if(day<1||day > getDayOfMonth)
		{
			System.out.println("Warning-day")；
			return ;
		}
		//涉及 
		this.year =year;
		this.month=month;
		this.day =day;
		
	}
	
	public void addDate(int days)
	{
		if(days<0)
		{
			System.out.println("days不合法");
			return;
		}
		day+=days;
		while (day>getDayOfMonth(year,month))
		{
			day -= getDayOfMonth(year,month)
			month++;
			if(month>12)
			{
				month=1;
				year++;
			}
			
		}
		
	}
	public void sub(int days)
	{
		if(days<0)
		{
			System.out.println("days不合法");
			return;
		}
		
		days -=days;
		while(day < 1)
		{
			month--;
			if(month < 1)
			{
				month = 12;
				year--;
			}
		}
		
		//days是整数
	}
	public String toString(int days)
	{
		return String.format("%4d-%2d-%d"year,month,day)
	}
	
	public static final int[] DAY_OF_MONTH =
	{31, 28, 31, 30, 31, 30, 31, 31, 31, 30, 31, 30, 31}
	public static int getDayOfMonth(int year, int month) 
	{
		int day = DAY_OF_MONTH[month - 1];
		if (month == 2 && isLeapYear(year))
		{
			day = 29;
		}
		return days;
	}
	
	public static boolean isLeapYear(int year)
	{
		if((year % 4 = 0 &&year%100!=0)||yer)
	}
}

public class Class06
{
	public static void main(String[] args)
	{
		
	}
}