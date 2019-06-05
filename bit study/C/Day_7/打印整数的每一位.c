#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>
//打印一个数字的每一位
int printfNumber(int n, int sn)
{
	if (n == 0)
	{
		return;
	}

	printfNumber(n / sn, sn);
	printf("\n");
	putchar("0123456789"[n % sn]);//递归
}
int main5()
{
	int n = 0,k = 10;
	printf("输入n值\n");
	scanf("%d", &n);
	printfNumber(n,k);//调用
	putchar('\n');

	system("pause");
}