#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>
int  main()
{
	int n = 25;
	int tmp = n;
	int i;

	for (i = 31; i >= 0; i -= 2)
	{
		putchar((n >> i & 1) + '0');
	}
	putchar('\n');
	for (i = 30; i >= 0; i -= 2)
	{
		putchar((n >> i & 1) + '0');
	}
	system("pause");
	return 0;

}
