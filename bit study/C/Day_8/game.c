#define _CRT_SECURE_NO_WARNINGS 1

#include "game.h"
//��ʼ������
void initArr(char arr[ROW][COL], int row, int col)
{
//	int i = 0;
//	int j = 0;
//	for (i = 0; i < row; i++)
//	{
//		for (j = 0; j < col; j++)
//		{
//			arr[i][j] = ' ';
//		}
//	}
//
	memset(&arr[0][0], ' ', row*col*sizeof(arr[0][0]));
	//��ʼ�����飬ȫ����Ϊ�ո�
}
//��ӡ����
void displayArr(char arr[ROW][COL], int row, int col)
{
	int i = 0;
	for (i = 0; i < row; i++)
	{
		int j = 0;
		for (j = 0; j < col; j++)
		{
			printf(" %c ",arr[i][j]);
			if (j<col - 1)
			{
				printf("|");
			}
		}
		printf("\n");
		if (i < row-1)
		{
			for (j = 0; j < col; j++)
			{
				printf("---");
				if (j<col - 1)
				{
					printf("|");
				}
			}
		}
		printf("\n");
	}
}
//��������
void computerMove(char arr[ROW][COL], int row, int col)
{
	int x = 0;
	int y = 0;
	printf("�������ӣ�>\n");
	while (1)
	{
		x = rand() % row;
		y = rand() % col;

		if (arr[x][y] == ' ')
		{
			arr[x][y] = 'X';
			break;
		}
	}
}

//�������
void playerMove(char arr[ROW][COL], int row, int col)
{
	int x = 0;
	int y = 0;
	printf("������ӣ�>\n");
	printf("����������");
	while (1)
	{
		scanf("%d%d", &x, &y);
		int a = x - 1, b = y - 1;
		if (x >= 0 && x <= row&& x >= 1 && x <= row)
		{
			if (arr[a][b] == ' ')
			{
				arr[a][b] = 'O';
				break;
			}
			else
			{
				printf("����������ռ�ã�����������\n");
			}
		}
		else
		{
			printf("����������������������\n");
		}
	}
}

char judgeWin(char arr[ROW][COL], int row, int col)
{
	int i = 0;
	for (i = 0; i < col; i++)
	{
		if (arr[i][0] == arr[i][1]
			&& arr[i][1] == arr[i][2]
			&& arr[i][2] == arr[i][0]
			&& arr[i][0] != ' ')
		{
			return arr[i][0];
		}
	}
	for (i = 0; i < col; i++)
	{
		if (arr[0][i] == arr[1][i] 
			&& arr[1][i] == arr[2][i] 
			&& arr[2][i] == arr[0][i]
			&& arr[0][i] != ' ')
		{
			return arr[0][i];
		}
	}
	if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] == arr[2][2]&&arr[0][0] !=' ')
	{
		return arr[0][0];
	}
	if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[0][0] == arr[0][2]&& arr[0][2] !=' ')
	{
		return arr[0][2];
	}
	//�ж�ƽ��
	 if(1 == isFull(arr, row, col))
	 {
			return 'Q';
	 }
		return ' ';
}
int isFull(char arr[ROW][COL], int row, int col)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < row; i++)
	{
		for (j = 0; i < col; j++)
		{
			if (arr[i][j] == ' ')
				return 0;
		}

	}
	return 1;
}


