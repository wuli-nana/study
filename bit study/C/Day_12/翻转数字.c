#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>

/*��������ķ���ֵvalue�Ķ�����λģʽ�����ҷ�ת���ֵ�� 

�磺 
��32λ������25���ֵ�������и�λ�� 
00000000000000000000000000011001 
��ת�󣺣�2550136832�� 
10011000000000000000000000000000 
���������أ� 
2550136832 */

unsigned int reverse_bit(unsigned int value)
{
	int i,;
	int tmp, sum = 0;
	for (i = 0; i < 32; i++, value /= 2)
	{
		tmp = value % 2;
		sum = sum * 2 + tmp;
	}
	return sum;
}
int main()
{
	int value = 25;
	printf("%u", reverse_bit(value));
	system("pause");
	return 0;
}