#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>
#include <stdlib.h>
void swap(int*pa, int*pb)//交换数值函数的定义
{
	int temp;
	temp = *pa;
	*pa = *pb;
	*pb = temp;
}
//因为形参不能改变实参
//所以传值时传的是两个数的地址,并交换地址。
//即完成了数值的交换。

int main2()
{
	int num1 = 0, num2 = 0;//定义需要交换的两个数并初始化
	scanf("%d%d", &num1, &num2);//输入两个数的值
	printf("%d %d\n", num1, num2);//打印交换前两个数的值

	swap(&num1, &num2);//调用函数
	printf("%d %d", num1, num2);//打印交换后两个数的值
	system("pause");
	return 0;
}