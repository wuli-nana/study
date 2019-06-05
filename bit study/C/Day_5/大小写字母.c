#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdio.h>
#include <ctype.h>
#define isSmallLetter(ch)((ch)<'z'&&(ch)>='a')

int isBigLetter(char ch)
{
	return ch >= 'A'&&ch <= 'Z';
		
}
int main()
{
	char ch;
	while (1)
	{
		ch = getchar();
		if (isSmallLetter(ch))
		{
			putchar(ch - ('a' - 'A'));
		}
		else if (isBigLetter(ch))
		{
			putchar(ch + ('a' - 'A'));
		}
		else if (isalnum(ch))
		{
			//do nothing
		}
		else if (ch == '@')
		{
			break;
		}
		else
		{
			putchar(ch);
		}
	}

	
	system("pause");
	return 0;
}