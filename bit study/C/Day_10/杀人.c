#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdio.h>
/*
�ձ�ĳ�ط�����һ��ıɱ��������ͨ���Ų�ȷ��ɱ�����ֱ�Ϊ4��
���ɷ���һ��������Ϊ4�����ɷ��Ĺ��ʡ�
A˵�������ҡ�
B˵����C��
C˵����D��
D˵��C�ں�˵
��֪3����˵���滰��1����˵���Ǽٻ���
�����������Щ��Ϣ��дһ��������ȷ������˭�����֡� */
int main4()
{
	char murder[] = { 'a', 'b', 'c', 'd' };
	int i;
	char killer;
	for (i = 0; i < sizeof(murder) / sizeof murder[0]; i++)
	{
		killer = murder[i];
		if ((murder[0] != killer) + (murder[2] == killer)
			+ (murder[3] == killer) + (murder[3] != killer) == 3)
		{
			printf("killer is %c\n", killer);
		}
	}
	system("pause");
	return 0;
}