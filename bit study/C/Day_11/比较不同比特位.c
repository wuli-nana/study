#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>
#include <stdlib.h>

int differNum(int number1,int number2)
{
	int count = 0;
	int i;
	while (number1)
	{
		count += (number2 % 2) ^ (number1 % 2);
		number1 = number1 / 2;
		number2 = number2 / 2;
	}
	return count;
}
int main7()
{
	int input1 = 0,input2 = 0;
	printf("请输入两个数字\n");
	scanf("%d%d", &input1,&input2);
	printf("%d",differNum(input1, input2));
	system("pause");
	return 0;
}