#define _CRT_SECURE_NO_WARNINGS 1
#include <iostream>
#include"matrix.h"
using namespace std;//��˹����Ԫ��ȥ�������Է�����
/*
int main_Gauss1()
{
	matrix A, X; //A �����������Է�������������,X ���淽����Ľ�
	int i, j, k, l, n;
	double temp;
	cout << "���������Է������ά��: n = ";
	cin >> n;
	A(n, n + 1); cout << "���������Է�������������:\n A = " << endl;
	A.input();
	for (i = 1; i <= n; i++) //�б任Ϊ��������
	{
		temp = A(i, i); k = 0;
		for (j = i + 1; j <= n; j++) //ѡ����Ԫ
		{
			if (fabs(A(j, i))>fabs(temp)){ temp = A(j, i); k = j; }
		}
		if (k>i)A.M_h(i, k); //ѡ��Ԫ���н���
		for (j = i + 1; j <= n; j++)
		{
			temp = -A(j, i) / A(i, i);
			A.M_h(temp, i, j);
		}
	}
	//cout<<"����:A=\n";A.print(8);
	for (i = n; i >= 1; i--) //�ش����
	{
		temp = 0;
		for (j = 1; j <= n - i; j++)
			temp += A(i, i + j)*X(i + j);
		X(i) = (A(i, n + 1) - temp) / A(i, i);
	}
	cout << "���Է�����Ľ�Ϊ(�� x1 �� xn ˳������): \nX = " << endl;
	X.print(8);
	return 0;
}
*/
