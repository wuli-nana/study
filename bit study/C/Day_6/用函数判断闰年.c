#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>

int judgeYear(int n)//判断闰年的函数
{
	if (n / 4 == 0 || n / 100 != 100 && n / 400 == 0)//闰年判断条件
		return 0;//是闰年是返回0
	else
		return 1;//不是闰年返回1
}

//主函数
int main3()
{
	int year = 0;
	scanf("%d", &year);//输入判断年份的函数
	if(0==judgeYear(year))//返回0时是闰年
		printf("%d是闰年", year);

	if (1 == judgeYear(year))
		printf("%d不是闰年", year);//返回1时不是闰年
	system("pause");
	return 0;
}