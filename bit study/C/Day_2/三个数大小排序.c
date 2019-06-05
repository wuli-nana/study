#define _CRT_SECURE_NO_WARNINGS 1

int main()
{
	int a = 0, b = 0, c = 0, t = 0;
	printf("请输入三个整数");
	scanf("%d,%d,%d", &a, &b, &c);
	if (a < b)
		a = b;
	if (b < c)
		a = c;
	printf("%d,%d,%d", a, b, c);
	return 0;
}