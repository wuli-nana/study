#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>
//��ӡһ�����ֵ�ÿһλ
int printfNumber(int n, int sn)
{
	if (n == 0)
	{
		return;
	}

	printfNumber(n / sn, sn);
	printf("\n");
	putchar("0123456789"[n % sn]);//�ݹ�
}
int main5()
{
	int n = 0,k = 10;
	printf("����nֵ\n");
	scanf("%d", &n);
	printfNumber(n,k);//����
	putchar('\n');

	system("pause");
}