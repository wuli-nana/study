#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdio.h>
#include <time.h>

void menu()
{
	printf("******************************\n");
	printf("*********   1. play  *********\n");
	printf("*********   2. exit  *********\n");
	printf("******************************\n");
}

void game()
{
	int number = 0;
	int rand_num = rand() % 100;

	while (1)
	{
		printf("请输入你要猜的数字\n");
		scanf("%d", number);
		if (number > rand_num)
		{
			printf("猜大了\n");
		}
		else if (number < rand_num)
		{
			printf("猜小了\n");
		}
		else
		{
			printf("猜对了\n");
			break;
		}
	}
}
int main2()
{
	srand((unsigned)time(NULL));
	int input = 0;
	do
	{
		menu();
		printf("请选择:>");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 2:
			break;
		default:
			printf("输入错误\n");
			break;
		}
	} while (input);

	system("pause");
	return 0;
}