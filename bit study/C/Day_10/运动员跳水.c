#define _CRT_SECURE_NO_WARNINGS 1
//5位运动员参加了10米台跳水比赛，有人让他们预测比赛结果

//比赛结束后，每位选手都说对了一半，请编程确定比赛的名次。

#include <stdio.h>
#include <stdlib.h>
int main1()
{
	int a, b, c, d, e;
	for (a = 1; a <= 5; a++)
	{
		for (b = 1; b <= 5; b++)
		{
			for (c = 1; c <= 5; c++)
			{
				for (d = 1; d <= 5; d++)
				{
					for (e = 1; e <= 5; e++)
					{
						if ((b == 2) + (a == 3) == 1 &&
							(b == 2) + (e == 4) == 1 &&
							(c == 1) + (d == 2) == 1 &&
							(c == 5) + (d == 3) == 1 &&
							(e == 4) + (a == 1) == 1 &&
							a != b && a != c && a != d && a != e &&
							b != a && b != c && b != d && b != e &&
							c != b && a != c && c != d && c != e &&
							a != d && d != c && b != d && d != e &&
							e != b && e != c && e != d && a != e )
						{
							printf("a = %d\n"
								"b = %d\n"
								"c = %d\n"
								"d = %d\n"
								"e = %d\n"
								, a, b, c, d, e);
						}
					}
				}
			}
		}
	}
	system("pause");
	return 0;
}