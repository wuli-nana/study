#define _CRT_SECURE_NO_WARNINGS 1
//쳲�������
//쳲��������У�1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
//�����F(n��Ϊ�����еĵ�n�n��N*����
//��ô��仰����д��������ʽ��:F(n) = F(n - 1) + F(n - 2)
#include <stdio.h>
#include <stdlib.h>
//Ӧ��ѭ����д��
int fib1(int n)
{
	int an_1 = 1, an_2 = 1;
	int an = 0, i = 0;
	if (n <= 2)//ǰ����
	{
		return 1;
	}
	for (i = 2; i < n; i++)//�����������������i��2��ʼ
	{
		an = an_1 + an_2;
		an_2 = an_1;
		an_1 = an_2;
		
	}
	return an;
}
//Ӧ�ú����ݹ��д��
int fib2(int n)
{
	if (n <= 2)//ǰ����
	{
		return 1;
	}

	return fib2(n-2)+fib2(n-1);//�ݹ����������
}
//������
int main1()
{
	int n = 0;
	printf("������һ������\n");
	scanf("%d", &n);
	printf("%d", fib1(n));
	printf("%d", fib2(n));
	system("pause");
	return 0;
}
