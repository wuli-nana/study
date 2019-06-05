#define _CRT_SECURE_NO_WARNINGS 1


#include <stdio.h>
#include <stdlib.h>

//打印乘法口诀表函数的编写
void multTable(int n)
{
	int i = 0;
	for (i = 1; i <= n; i++)//行数
	{
		int j = 0;
		for (j = 1; j <= i; j++)
		{
			printf("%d*%d=%-3d  ", i, j, i*j);//列数
		}
		printf("\n");//输出每一行后换行
	}
}
//主函数
int main4()
{
	int input = 0;//设置一个值并初始化
	printf("请输入你想要打印多少的乘法表：\n>");
	scanf("%d", &input);//输入数字 
	multTable(input);//调用函数
	system("pause");

	return 0;
}