#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>
int main()
{
	int a[10] = { 0 };
	int max = 0, i = 0;
	printf("请输入十个整数：");
	for (i = 0; i < 10; i++)
	{
		scanf("%d", &a[i]);
	}
	max = a[1];
	for (i = 1; i<10; i++)
	{
		if (a[i] > max)
			max = a[i];
	}
	printf("%d", max);
	system("pause");
	return 0;
}