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
		printf("电脑赢\n");
	}
	else if (ret == 'O')
	{
		printf("玩家赢\n");
	}
	else if (ret == 'Q')
	{
		printf("平局\n");
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
		printf("请选择\n：>");
		scanf("%d", &input);
		switch(input)
		{
		case 1:
			game();
			break;
		case 0:
			printf("退出游戏\n");
			break;
		default:
			printf("输入错误，请重新选择\n");
		}
	} 
	while (input);
	return 0;
}