#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>
#include <stdlib.h>
int main()
{
	int a = 0, b = 0, t = 0;
	printf("请任意输入两个整数:");
	scanf("%d,%d", &a, &b);
	{
		t = a;
		a = b;
		b = t;
	}
	printf("交换内容得到：a = %d,b = %d\n", a, b);
	system("pause");
	return 0;
}
