#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>

int judgeYear(int n)//�ж�����ĺ���
{
	if (n / 4 == 0 || n / 100 != 100 && n / 400 == 0)//�����ж�����
		return 0;//�������Ƿ���0
	else
		return 1;//�������귵��1
}

//������
int main3()
{
	int year = 0;
	scanf("%d", &year);//�����ж���ݵĺ���
	if(0==judgeYear(year))//����0ʱ������
		printf("%d������", year);

	if (1 == judgeYear(year))
		printf("%d��������", year);//����1ʱ��������
	system("pause");
	return 0;
}