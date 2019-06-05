#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>

int factorielle(int n)
{
	if (n == 1)
	{
		return 1;
	}
	return n* factorielle(n-1);//递归
}
int main4()
{
	int n = 0;
	printf("请输入一个正整数\n");
	scanf("%d", &n);
	printf("%d", factorielle(n));

	system("pause");
	return 0;
}