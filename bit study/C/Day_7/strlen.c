#define _CRT_SECURE_NO_WARNINGS 1
int myStrlen(char * str)
{
	if (*str == '\0')
	{
		return 0;
	}
	return 1 + myStrlen(str + 1);
}
int main()
{
	printf("%d\n", myStrlen("bitekeji"));
	system("pause");
	return 0;
}