#define _CRT_SECURE_NO_WARNINGS 1

#include <stdio.h>
#include <stdlib.h>

/*void reverse_part(char *str, int start, int end)
{
	int i, j;
	char tmp;

	for (i = start, j = end; i < j; i++, j--)
	{
		tmp = str[i];
		str[i] = str[j];
		str[j] = tmp;
	}
}
*/
void reverse_part(char*arr, int start,int end)
{
	int i, j;
	char temp;
	for (i = start, j = end; i < j; i++,j--)
	{
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
int main6()
{
	char arr[] = "i am a student" ;
	int i, start = 0, end;
	for (i = 0; arr[i]; i++)
	{
		if (arr[i] == ' ')
		{
			end = i - 1;
			reverse_part(arr, start, end);
			start = i + 1;//给start重新赋值
		}
	}
	reverse_part(arr, start, i - 1);
	reverse_part(arr, 0, i - 1);

	puts(arr);
	system("pause");
	return 0;
}