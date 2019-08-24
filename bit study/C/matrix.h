#define _CRT_SECURE_NO_WARNINGS 1
#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
class m2d //��ά����ڵ���
{
public:
	double num;
	m2d* next_h;
	m2d* next_l;
};
class matrix //���������
{
public:
	int m; //��������
	int n; //��������
	m2d* mtr; //��������ͷָ��
	matrix()
	{
		m = 0; n = 0; mtr = 0;
	}
	double& operator()(int i, int j); //��λ������ i �� j �е� num ������
	double& operator()(int i); //��λ������ i ��(��)�� num ������
	m2d* M_p(int i, int j); //��λ������ i �� j �е�ָ��
	void print(int M_n); //��Ļ�������
	void input(); //�Ӽ����������
	void M_copy(); //�½���̬������ԭ������Ϣ���������У���ֹ���ú� ��ʱ�����޸�
	void M_h(double k, int i, int j); //�б任������ i �е� k ���ӵ��� j ��
	void M_h(double k, int i); //�б任������ i �г� k ��
	void M_h(int i, int j); //�б任�������� i �к͵� j ��
	void M_delete(); //�������Ķ�̬������ʱ�ͷ��ڴ�ռ�
	matrix operator +(matrix M_B); //����ӷ�����
	matrix operator -(matrix M_B); //�����������
	matrix operator *(matrix M_B); //�������
private:
	void add_h(int h); //������
	void add_l(int l); //������
};
m2d* matrix::M_p(int i, int j) //��λ������� i �� j �У�����ֵΪ�ô��� ָ��
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
	//cout<<"���� 5:"<<m<<' '<<n<<' '<<mtr<<endl;
	return temp;
}
double& matrix::operator()(int i, int j) //��λ������� i �� j ��,����ֵ Ϊ�ô���ֵ num �����ã������ num ���޸ġ�
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
double& matrix::operator()(int i) //��λ������ i ��(��)�� num ������
{
	if (m == 0 || (m == 1 && n >= 1))return (*this)(1, i);
	if (n == 1 && m>1)return (*this)(i, n);
}
void matrix::add_h(int h) //������
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
void matrix::add_l(int l) //������
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
void matrix::print(int M_n) //��Ļ�������,�� n=0 ʱ��Ĭ�ϸ�ʽ���,�� �����ָ��λ��С��
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
void matrix::input() //�Ӽ����������
{
	int m_h, m_l, i1, i2;
	m2d* p;
	m2d* p1;
	if (m == 0 && n == 0)
	{
		cout << "��������������������:";
		cin >> m_h >> m_l;
		(*this)(m_h, m_l);
		cout << "���������:" << endl;
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
void matrix::M_copy() //�½���̬������ԭ������Ϣ���������У���ֹ�� �ú���ʱ�����޸�
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
void matrix::M_h(double k, int i, int j) //�б任������ i �е� k ���ӵ���j ��
{
	if (i>0 && j>0 && i <= m&&j <= m)
	{
		for (int I = 1; I <= n; I++)
			(*this)(j, I) = k*(*this)(i, I) + (*this)(j, I);
	}
}
void matrix::M_h(double k, int i) //�б任������ i �г� k ��
{
	if (i>0 && i <= m)
	{
		for (int I = 1; I <= n; I++)
			(*this)(i, I) = k*(*this)(i, I);
	}
}
void matrix::M_h(int i, int j) //�б任�������� i �к͵� j ��
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
void matrix::M_delete() //�������Ķ�̬������ʱ�ͷ��ڴ�ռ�
{
	for (int i = m; i>0; i--)
	{
		for (int j = n; j>0; j--)
			delete M_p(i, j);
	}m = 0; n = 0; mtr = 0;
}
matrix matrix::operator +(matrix M_B) //����ӷ�����
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
matrix matrix::operator -(matrix M_B) //�����������
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
matrix matrix::operator *(matrix M_B) //�������
{
	matrix TEMP;
	double temp;
	int i, j, k;
	if ((*this).n != M_B.m)cout << "����!ǰһ������������ͺ�һ����������� ��ͬ���޷���ˡ�\n";
	else
	{
		for (i = 1; i <= (*this).m; i++)
		{
			for (j = 1; j <= M_B.n; j++)
			{
				temp = 0;
				for (k = 1; k <= (*this).n; k++)
					temp = temp + ((*this)(i, k))*(M_B(k, j));
				//if(fabs(temp)<1e-15)temp=0; //��̫С��������
				TEMP(i, j) = temp;
			}
		}
	}
	return TEMP;
}
/************************** �� �� Ϊ matrix �� �� �� Ա �� �� �� �� *******************************/
matrix operator *(double k, matrix M_A) //���˾���
{
	matrix M_T; int i, j;
	for (i = 1; i <= M_A.m; i++)
	{
		for (j = 1; j <= M_A.n; j++)
			M_T(i, j) = k*M_A(i, j);
	}return M_T;
}
matrix operator ~(matrix MAT) //������ת��
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
matrix E(int N) //���� N �׵�λ����
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
matrix inv(matrix MAT) //�������
{
	MAT.M_copy();
	matrix TEMP, T;
	int i, j, k;
	double temp, temp2 = 1;
	if (MAT.m != MAT.n)cout << "����!�����Ƿ����޷��������" << endl;
	else
	{
		T = MAT;
		TEMP = E(MAT.m);
		for (i = 1; i <= MAT.m; i++) //����������� T
		{
			for (j = 1; j <= MAT.m; j++)
				T(i, MAT.m + j) = TEMP(i, j);
		}
		//cout<<"���� 1:T="<<endl;T.print();
		for (i = 1; i <= T.m - 1; i++) //��߻�Ϊ�����Ǿ���
		{
			k = 0;
			temp = T(i, i);
			for (j = i + 1; j <= T.m; j++) //������Ԫ
			{
				if (fabs(T(j, i))>fabs(temp))
				{
					temp = T(j, i); k = j;
				}
			}
			if (k>i)T.M_h(i, k);//�н���
			//cout<<"���� 2.1:T="<<endl;T.print(8);
			if (T(i, i) == 0){ cout << " �� �� ! �� �� �� �� �� �� �� "; temp2 = 0; break; }//temp2 �ж��Ƿ��쳣����ѭ��
			else //����������
			{
				for (j = i + 1; j <= T.m; j++)
				{
					temp = -T(j, i) / T(i, i);
					T.M_h(temp, i, j);
				}
			}
			//cout<<"���� 2.3:T="<<endl;T.print();
		}
		//cout<<"���� 3:T="<<endl;T.print();
		if (temp2 != 0) //��߻��ɵ�λ���󣬲��ҵõ�����ֵ
		{
			for (i = 1; i <= T.m; i++) //�󲿷ֶԽ���ȫ���� 1
			{
				temp = 1 / (T(i, i));
				T.M_h(temp, i);
			}
			//cout<<"���� 4.1:T="<<endl;T.print();
			for (i = T.m; i>1; i--) //����λ����
			{
				for (k = i - 1; k >= 1; k--)
				{
					temp = -T(k, i);
					T.M_h(temp, i, k);
				}
			}
			for (i = 1; i <= T.m; i++) //��ȡ�����
			{
				for (j = 1; j <= T.m; j++)
					TEMP(i, j) = T(i, j + T.m);
			}
		}

	}
	return TEMP;
}
matrix AUG(matrix M_A, matrix M_B) //���������
{
	if (M_A.m != M_B.m)cout << "����!��������������һ�¡�" << endl;
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
double norm(matrix M_A) //�������Ķ�����
{
	double M_T = 0;
	for (int i = 1; i <= M_A.m || i <= M_A.n; i++)
	{
		if (M_A.m == 1 && M_A.n>1)M_T += M_A(1, i)*M_A(1, i);
		if (M_A.n == 1 && M_A.m>1)M_T += M_A(i, 1)*M_A(i, 1);
	}return sqrt(M_T);
}
/***************************** �� �� Ϊ �� �� �� �� �� �� �� �� �� *****************************/