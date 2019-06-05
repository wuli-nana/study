#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>

void printArray(int * arr, int n)
{
	int i;
	for (i = 0; i < n; i++)
	{
		printf("%d ", arr[i]);
	}
	putchar('\n');
}

int main()
{
	int n,i;
	int arr[] = {0};
	printf("ÇëÊäÈëÐÐÊý");
	scanf("%d", &n);
	for (i = 1;i < n;n++)
	{
		arr[i] = 1;
		int j;
		for (j = i - 1; j > 0; j--)
		{
			arr[j] += arr[j - 1];
		}
		arr[0] = 1;
		printArray(arr, i+1);
		printf("\n");
	}
	system("pause");
	return 0;
}