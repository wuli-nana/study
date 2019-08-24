#define _CRT_SECURE_NO_WARNINGS 1
#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
class m2d //二维链表节点类
{
public:
	double num;
	m2d* next_h;
	m2d* next_l;
};
class matrix //定义矩阵类
{
public:
	int m; //矩阵行数
	int n; //矩阵列数
	m2d* mtr; //矩阵链表头指针
	matrix()
	{
		m = 0; n = 0; mtr = 0;
	}
	double& operator()(int i, int j); //定位到矩阵 i 行 j 列的 num 的引用
	double& operator()(int i); //定位到向量 i 行(列)的 num 的引用
	m2d* M_p(int i, int j); //定位到矩阵 i 行 j 列的指针
	void print(int M_n); //屏幕输出矩阵
	void input(); //从键盘输入矩阵
	void M_copy(); //新建动态链表，将原矩阵信息拷贝到其中，防止调用函 数时矩阵被修改
	void M_h(double k, int i, int j); //行变换，将第 i 行的 k 倍加到第 j 行
	void M_h(double k, int i); //行变换，将第 i 行乘 k 倍
	void M_h(int i, int j); //行变换，交换第 i 行和第 j 行
	void M_delete(); //清除矩阵的动态链表，及时释放内存空间
	matrix operator +(matrix M_B); //矩阵加法运算
	matrix operator -(matrix M_B); //矩阵减法运算
	matrix operator *(matrix M_B); //矩阵相乘
private:
	void add_h(int h); //新增行
	void add_l(int l); //新增列
};
m2d* matrix::M_p(int i, int j) //定位到矩阵第 i 行 j 列，返回值为该处的 指针
{
	m2d* temp;
	if (m == 0 && (i>0) && (j>0)){ mtr = new m2d; m = 1; n = 1; }
	temp = mtr;
	if (i>m) add_h(i - m);
	if (j>n) add_l(j - n);
	for (int p1 = 1; p1<i; p1++)
	{
		temp = temp->next_h;
	}
	for (int p2 = 1; p2<j; p2++)
		temp = temp->next_l;
	//cout<<"测试 5:"<<m<<' '<<n<<' '<<mtr<<endl;
	return temp;
}
double& matrix::operator()(int i, int j) //定位到矩阵第 i 行 j 列,返回值 为该处的值 num 的引用，方便对 num 的修改。
{
	m2d* temp;
	if (m == 0 && (i>0) && (j>0)){ mtr = new m2d; m = 1; n = 1; }
	temp = mtr;
	if (i>m) add_h(i - m);
	if (j>n) add_l(j - n);
	for (int p1 = 1; p1<i; p1++)
	{
		temp = temp->next_h;
	}
	for (int p2 = 1; p2<j; p2++)
		temp = temp->next_l;
	double &_t = temp->num;
	return _t;
}
double& matrix::operator()(int i) //定位到向量 i 行(列)的 num 的引用
{
	if (m == 0 || (m == 1 && n >= 1))return (*this)(1, i);
	if (n == 1 && m>1)return (*this)(i, n);
}
void matrix::add_h(int h) //新增行
{
	int i1, i2;
	m2d* p;
	m2d* p1;
	m2d* p2;
	p = mtr;
	for (i1 = 1; i1<m; i1++)
		p = p->next_h;
	p2 = p;
	for (i2 = 0; i2<h; i2++)
	{
		p->next_h = new m2d;
		p1 = p->next_h;
		p2 = p1;
		for (i1 = 1; i1<n; i1++)
		{
			p1->next_l = new m2d;
			p1 = p1->next_l;
			p = p->next_l;
			p->next_h = p1;
		}
		p = p2;
		m = m + 1;
	}
}
void matrix::add_l(int l) //新增列
{
	int i1, i2;
	m2d* p;
	m2d* p1;
	m2d* p2;
	p = mtr;
	for (i1 = 1; i1<n; i1++)
		p = p->next_l;
	p2 = p;
	for (i2 = 0; i2<l; i2++)
	{
		p->next_l = new m2d;
		p1 = p->next_l;
		p2 = p1;
		for (i1 = 1; i1<m; i1++)
		{
			p1->next_h = new m2d;
			p1 = p1->next_h;
			p = p->next_h;
			p->next_l = p1;
		}
		p = p2;
		n = n + 1;
	}
}
void matrix::print(int M_n) //屏幕输出矩阵,当 n=0 时按默认格式输出,否 则输出指定位数小数
{
	int i1, i2;
	m2d* p = mtr;
	m2d* p1;
	for (i1 = 1; i1 <= m; i1++)
	{

		p1 = p;
		for (i2 = 1; i2 <= n; i2++)
		{
			if (M_n == 0)
				cout << setw(10) << p1->num;
			else
				cout << setw(M_n + 4) << setprecision(M_n) << p1->num;
			if (i2 != n)
				p1 = p1->next_l;
		}
		cout << endl;
		if (i1 != m)
			p = p->next_h;
	}
}
void matrix::input() //从键盘输入矩阵
{
	int m_h, m_l, i1, i2;
	m2d* p;
	m2d* p1;
	if (m == 0 && n == 0)
	{
		cout << "请输入矩阵的行数及列数:";
		cin >> m_h >> m_l;
		(*this)(m_h, m_l);
		cout << "请输入矩阵:" << endl;
	}
	p = mtr;
	for (i1 = 1; i1 <= m; i1++)
	{
		p1 = p;
		cout << "\t";
		for (i2 = 1; i2 <= n; i2++)
		{
			cin >> p1->num;
			if (i2 != n)
				p1 = p1->next_l;
		}
		if (i1 != m)
			p = p->next_h;
	}
}
void matrix::M_copy() //新建动态链表，将原矩阵信息拷贝到其中，防止调 用函数时矩阵被修改
{
	matrix _M, _T;
	_T.m = m; _T.n = n; _T.mtr = mtr;
	int i, j;
	for (i = 1; i <= m; i++)
	{
		for (j = 1; j <= n; j++)
			_M(i, j) = _T(i, j);
	}
	mtr = _M.mtr;
}
void matrix::M_h(double k, int i, int j) //行变换，将第 i 行的 k 倍加到第j 行
{
	if (i>0 && j>0 && i <= m&&j <= m)
	{
		for (int I = 1; I <= n; I++)
			(*this)(j, I) = k*(*this)(i, I) + (*this)(j, I);
	}
}
void matrix::M_h(double k, int i) //行变换，将第 i 行乘 k 倍
{
	if (i>0 && i <= m)
	{
		for (int I = 1; I <= n; I++)
			(*this)(i, I) = k*(*this)(i, I);
	}
}
void matrix::M_h(int i, int j) //行变换，交换第 i 行和第 j 行
{
	double temp;
	if (i>0 && j>0 && i <= m&&j <= m&&i != j)
	{
		for (int I = 1; I <= n; I++)
		{
			temp = (*this)(j, I); (*this)(j, I) = (*this)(i, I); (*this)(i, I) = temp;
		}
	}
}
void matrix::M_delete() //清除矩阵的动态链表，及时释放内存空间
{
	for (int i = m; i>0; i--)
	{
		for (int j = n; j>0; j--)
			delete M_p(i, j);
	}m = 0; n = 0; mtr = 0;
}
matrix matrix::operator +(matrix M_B) //矩阵加法运算
{
	matrix M_T;
	if (this->m == M_B.m&&this->n == M_B.n)
	{
		for (int i = 1; i <= this->m; i++)
		{
			for (int j = 1; j <= this->n; j++)
				M_T(i, j) = (*this)(i, j) + M_B(i, j);
		}
	}return M_T;
}
matrix matrix::operator -(matrix M_B) //矩阵减法运算
{
	matrix M_T;
	if ((*this).m == M_B.m && (*this).n == M_B.n)
	{
		for (int i = 1; i <= (*this).m; i++)
		{
			for (int j = 1; j <= (*this).n; j++)
				M_T(i, j) = (*this)(i, j) - M_B(i, j);
		}
	}return M_T;
}
matrix matrix::operator *(matrix M_B) //矩阵相乘
{
	matrix TEMP;
	double temp;
	int i, j, k;
	if ((*this).n != M_B.m)cout << "错误!前一个矩阵的列数和后一个矩阵的行数 不同，无法相乘。\n";
	else
	{
		for (i = 1; i <= (*this).m; i++)
		{
			for (j = 1; j <= M_B.n; j++)
			{
				temp = 0;
				for (k = 1; k <= (*this).n; k++)
					temp = temp + ((*this)(i, k))*(M_B(k, j));
				//if(fabs(temp)<1e-15)temp=0; //将太小的数清零
				TEMP(i, j) = temp;
			}
		}
	}
	return TEMP;
}
/************************** 以 上 为 matrix 类 及 成 员 函 数 定 义 *******************************/
matrix operator *(double k, matrix M_A) //数乘矩阵
{
	matrix M_T; int i, j;
	for (i = 1; i <= M_A.m; i++)
	{
		for (j = 1; j <= M_A.n; j++)
			M_T(i, j) = k*M_A(i, j);
	}return M_T;
}
matrix operator ~(matrix MAT) //求矩阵的转置
{
	int I, J;
	matrix TEMP;
	for (I = 1; I <= MAT.m; I++)
	{
		for (J = 1; J <= MAT.n; J++)
			TEMP(J, I) = MAT(I, J);
	}
	return TEMP;
}
matrix E(int N) //创建 N 阶单位矩阵
{
	int I, J;
	matrix TEMP;
	for (I = 1; I <= N; I++)
	{
		for (J = 1; J <= N; J++)
		{
			if (I == J)TEMP(I, J) = 1;
			else TEMP(I, J) = 0;
		}
	}
	return TEMP;
}
matrix inv(matrix MAT) //求逆矩阵
{
	MAT.M_copy();
	matrix TEMP, T;
	int i, j, k;
	double temp, temp2 = 1;
	if (MAT.m != MAT.n)cout << "错误!矩阵不是方阵，无法求逆矩阵。" << endl;
	else
	{
		T = MAT;
		TEMP = E(MAT.m);
		for (i = 1; i <= MAT.m; i++) //创建增广矩阵 T
		{
			for (j = 1; j <= MAT.m; j++)
				T(i, MAT.m + j) = TEMP(i, j);
		}
		//cout<<"测试 1:T="<<endl;T.print();
		for (i = 1; i <= T.m - 1; i++) //左边化为上三角矩阵
		{
			k = 0;
			temp = T(i, i);
			for (j = i + 1; j <= T.m; j++) //找列主元
			{
				if (fabs(T(j, i))>fabs(temp))
				{
					temp = T(j, i); k = j;
				}
			}
			if (k>i)T.M_h(i, k);//行交换
			//cout<<"测试 2.1:T="<<endl;T.print(8);
			if (T(i, i) == 0){ cout << " 错 误 ! 该 矩 阵 不 可 逆 。 "; temp2 = 0; break; }//temp2 判断是否异常结束循环
			else //化成上三角
			{
				for (j = i + 1; j <= T.m; j++)
				{
					temp = -T(j, i) / T(i, i);
					T.M_h(temp, i, j);
				}
			}
			//cout<<"测试 2.3:T="<<endl;T.print();
		}
		//cout<<"测试 3:T="<<endl;T.print();
		if (temp2 != 0) //左边化成单位矩阵，并且得到返回值
		{
			for (i = 1; i <= T.m; i++) //左部分对角线全化成 1
			{
				temp = 1 / (T(i, i));
				T.M_h(temp, i);
			}
			//cout<<"测试 4.1:T="<<endl;T.print();
			for (i = T.m; i>1; i--) //化单位矩阵
			{
				for (k = i - 1; k >= 1; k--)
				{
					temp = -T(k, i);
					T.M_h(temp, i, k);
				}
			}
			for (i = 1; i <= T.m; i++) //提取逆矩阵
			{
				for (j = 1; j <= T.m; j++)
					TEMP(i, j) = T(i, j + T.m);
			}
		}

	}
	return TEMP;
}
matrix AUG(matrix M_A, matrix M_B) //算增广矩阵
{
	if (M_A.m != M_B.m)cout << "错误!两个矩阵行数不一致。" << endl;
	else
	{
		M_A.M_copy();
		for (int i = 1; i <= M_B.m; i++)
		{
			for (int j = 1; j <= M_B.n; j++)
				M_A(i, M_B.n + j) = M_B(i, j);
		}
	}
	return M_A;
}
double norm(matrix M_A) //求向量的二范数
{
	double M_T = 0;
	for (int i = 1; i <= M_A.m || i <= M_A.n; i++)
	{
		if (M_A.m == 1 && M_A.n>1)M_T += M_A(1, i)*M_A(1, i);
		if (M_A.n == 1 && M_A.m>1)M_T += M_A(i, 1)*M_A(i, 1);
	}return sqrt(M_T);
}
/***************************** 以 上 为 矩 阵 常 用 运 算 的 函 数 *****************************/