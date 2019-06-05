#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>
#include <stdlib.h>

int main5()
{
	int arr[] = { 1, 1, 2, 3, 4, 4, 3, 2, 5 };
	int i,number = 0;
	for (i = 0; i < sizeof(arr) / sizeof(arr[0]); i++)
	{
		number ^= arr[i];
	}
	printf("%d", number);
	system("pause");
	return 0;
}