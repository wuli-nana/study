#define _CRT_SECURE_NO_WARNINGS 1

#include "game.h"

void menu()
{
	printf("*****************************\n");
	printf("*****************************\n");
	printf("**********1. play ***********\n");
	printf("**********0. exit ***********\n");
	printf("*****************************\n");
	printf("*****************************\n");

}


void game()
{
	char arr[ROW][COL] = { 0 };
	char ret;

	initArr(arr, ROW, COL);
	displayArr(arr, ROW, COL);

	while (1)
	{
		computerMove(arr, ROW, COL);
		ret = judgeWin(arr, ROW, COL);
		if (ret != ' ')
		{
			break;

		}
		displayArr(arr, ROW, COL);
		playerMove(arr, ROW, COL);
		if (ret != ' ')
		{
			break;

		}
		displayArr(arr, ROW, COL);
	}
	if (ret =='X')
	{
		printf("����Ӯ\n");
	}
	else if (ret == 'O')
	{
		printf("���Ӯ\n");
	}
	else if (ret == 'Q')
	{
		printf("ƽ��\n");
	}
	displayArr(arr, ROW, COL);

}

int main()
{

	int input;
	srand((unsigned int)time(NULL));
	do
	{
		menu();
		printf("��ѡ��\n��>");
		scanf("%d", &input);
		switch(input)
		{
		case 1:
			game();
			break;
		case 0:
			printf("�˳���Ϸ\n");
			break;
		default:
			printf("�������������ѡ��\n");
		}
	} 
	while (input);
	return 0;
}