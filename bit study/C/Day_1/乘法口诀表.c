#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>

int main2()
{
	int a = 0, i = 0, j = 0;
	for (i = 1; i < 10; i++)
	{
		for (j = 1; j < i; j++)
		{
			a = i * j;
			printf("%d*%d = %d ", i, j, i*j);
		}
		printf("\n");
	}
	system("pause");
	return 0;

}