#define _CRT_SECURE_NO_WARNINGS 1


#include <stdio.h>
#include <stdlib.h>

//��ӡ�˷��ھ������ı�д
void multTable(int n)
{
	int i = 0;
	for (i = 1; i <= n; i++)//����
	{
		int j = 0;
		for (j = 1; j <= i; j++)
		{
			printf("%d*%d=%-3d  ", i, j, i*j);//����
		}
		printf("\n");//���ÿһ�к���
	}
}
//������
int main4()
{
	int input = 0;//����һ��ֵ����ʼ��
	printf("����������Ҫ��ӡ���ٵĳ˷���\n>");
	scanf("%d", &input);//�������� 
	multTable(input);//���ú���
	system("pause");

	return 0;
}