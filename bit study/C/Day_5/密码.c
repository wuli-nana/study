#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>

int main1()
{
	char psw[10] = "";
	char passwold[] = "passwold";
	int i = 0, j = 0;
	for (i = 0; i < 3; i++)
	{
		printf("ÇëÊäÈëÃÜÂë\n");
		scanf("%s", psw);
		if (strcmp(psw,passwold ) == 0)
		{
			printf("ÃÜÂëÕýÈ·\n");
			break;
		}
		else
		{
			printf("ÃÜÂë´íÎó");
		}
			
	}
	return 0;
}