#define _CRT_SECURE_NO_WARNINGS 1
//斐波那契数
//斐波那契数列：1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
//如果设F(n）为该数列的第n项（n∈N*），
//那么这句话可以写成如下形式：:F(n) = F(n - 1) + F(n - 2)
#include <stdio.h>
#include <stdlib.h>
//应用循环的写法
int fib1(int n)
{
	int an_1 = 1, an_2 = 1;
	int an = 0, i = 0;
	if (n <= 2)//前两项
	{
		return 1;
	}
	for (i = 2; i < n; i++)//计算第三项往后，所以i从2开始
	{
		an = an_1 + an_2;
		an_2 = an_1;
		an_1 = an_2;
		
	}
	return an;
}
//应用函数递归的写法
int fib2(int n)
{
	if (n <= 2)//前两项
	{
		return 1;
	}

	return fib2(n-2)+fib2(n-1);//递归第三项往后
}
//主函数
int main1()
{
	int n = 0;
	printf("请输入一个数字\n");
	scanf("%d", &n);
	printf("%d", fib1(n));
	printf("%d", fib2(n));
	system("pause");
	return 0;
}
