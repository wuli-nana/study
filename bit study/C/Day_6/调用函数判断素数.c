#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>
#include <stdlib.h>
void swap(int*pa, int*pb)//������ֵ�����Ķ���
{
	int temp;
	temp = *pa;
	*pa = *pb;
	*pb = temp;
}
//��Ϊ�ββ��ܸı�ʵ��
//���Դ�ֵʱ�������������ĵ�ַ,��������ַ��
//���������ֵ�Ľ�����

int main2()
{
	int num1 = 0, num2 = 0;//������Ҫ����������������ʼ��
	scanf("%d%d", &num1, &num2);//������������ֵ
	printf("%d %d\n", num1, num2);//��ӡ����ǰ��������ֵ

	swap(&num1, &num2);//���ú���
	printf("%d %d", num1, num2);//��ӡ��������������ֵ
	system("pause");
	return 0;
}