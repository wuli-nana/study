#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main()
{
	int i, j;
	printf("100~200֮����������£�\n");
	for (i = 101; i < 200; i++)
	{
		for (j = 2; j < i - 1; j++)
		{
			int a = i % j;
			if (a == 0)
				break;
		}
		printf("%d\t", i);
	}
	printf("\n");
	system("pause");
	return 0;
}