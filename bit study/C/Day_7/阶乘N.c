#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>

int factorielle(int n)
{
	if (n == 1)
	{
		return 1;
	}
	return n* factorielle(n-1);//�ݹ�
}
int main4()
{
	int n = 0;
	printf("������һ��������\n");
	scanf("%d", &n);
	printf("%d", factorielle(n));

	system("pause");
	return 0;
}