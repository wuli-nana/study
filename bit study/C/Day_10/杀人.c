#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdio.h>
/*
日本某地发生了一件谋杀案，警察通过排查确定杀人凶手必为4个
嫌疑犯的一个。以下为4个嫌疑犯的供词。
A说：不是我。
B说：是C。
C说：是D。
D说：C在胡说
已知3个人说了真话，1个人说的是假话。
现在请根据这些信息，写一个程序来确定到底谁是凶手。 */
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