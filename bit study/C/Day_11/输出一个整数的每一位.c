#define _CRT_SECURE_NO_WARNINGS 1

//��һ��������ÿһλ��
#include <stdio.h>
#include <stdlib.h>
int main9()
{
	int input = 0;
	printf("������һ������\n", input);
	scanf("%d", &input);
	while (input)
	{
		printf("%d ", input % 10);
		input = input / 10;
	}
	system("pause");
	return 0;
}