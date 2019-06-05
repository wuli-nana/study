#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>

int oneNumber(int num)
{
	int count = 0,i;
	int number = num;
	for (int i = num; i; i /= 2)
	{
		if (1==i % 2)
		{
			count++;
		}
	}
	return count;
}

int main1()
{
	int input = 0;
	printf("请输入一个数字");
	scanf("%d", &input);
	printf("%d", oneNumber(input));
	system("pause");
	return 0;
}