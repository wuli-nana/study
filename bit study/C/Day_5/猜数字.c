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
		printf("��������Ҫ�µ�����\n");
		scanf("%d", number);
		if (number > rand_num)
		{
			printf("�´���\n");
		}
		else if (number < rand_num)
		{
			printf("��С��\n");
		}
		else
		{
			printf("�¶���\n");
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
		printf("��ѡ��:>");
		scanf("%d", &input);
		switch (input)
		{
		case 1:
			game();
			break;
		case 2:
			break;
		default:
			printf("�������\n");
			break;
		}
	} while (input);

	system("pause");
	return 0;
}