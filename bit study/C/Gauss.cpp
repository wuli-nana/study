#define _CRT_SECURE_NO_WARNINGS 1
#include <iostream>
#include"matrix.h"
using namespace std;//高斯列主元消去法解线性方程组
/*
int main_Gauss1()
{
	matrix A, X; //A 用来保存线性方程组的增广矩阵,X 保存方程组的解
	int i, j, k, l, n;
	double temp;
	cout << "请输入线性方程组的维数: n = ";
	cin >> n;
	A(n, n + 1); cout << "请输入线性方程组的增广矩阵:\n A = " << endl;
	A.input();
	for (i = 1; i <= n; i++) //行变换为上三角形
	{
		temp = A(i, i); k = 0;
		for (j = i + 1; j <= n; j++) //选列主元
		{
			if (fabs(A(j, i))>fabs(temp)){ temp = A(j, i); k = j; }
		}
		if (k>i)A.M_h(i, k); //选主元后行交换
		for (j = i + 1; j <= n; j++)
		{
			temp = -A(j, i) / A(i, i);
			A.M_h(temp, i, j);
		}
	}
	//cout<<"测试:A=\n";A.print(8);
	for (i = n; i >= 1; i--) //回代求解
	{
		temp = 0;
		for (j = 1; j <= n - i; j++)
			temp += A(i, i + j)*X(i + j);
		X(i) = (A(i, n + 1) - temp) / A(i, i);
	}
	cout << "线性方程组的解为(从 x1 到 xn 顺序排列): \nX = " << endl;
	X.print(8);
	return 0;
}
*/
