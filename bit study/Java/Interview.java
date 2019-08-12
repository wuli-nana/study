class Base{
	{
		System.out.println("Base的构造代码块1");
		
	}
	Base()
	{
		System.out.println("Base的构造方法");
	}
	{
		System.out.println("Base的构造代码块2");
		
	}
	static{
		System.out.println("Base的静态方法1");
	}
	static{
		System.out.println("Base的静态方法2");
	}
	
}
class Derived extends Base{
	{
		System.out.println("Derived的静态代码块1");
		
	}
	Derived()
	{
		this(18);
		System.out.println("Derived 的无参构造方法");
	}
	Derived(int n)
	//super 隐含super方法
	{
		
		System.out.println("Derived 的有参构造方法");
	}
	{
		System.out.println("Derived 的静态代码块2");
		
	}
	static{
		System.out.println("Derived 的静态方法1");
	}
	static{
		System.out.println("Derived 的静态方法2");
	}
}
public class Interview
{
	public static void main(String[] args){
		System.out.println("开始");
		new Derived();
		new Derived();
		System .out.println("结束");
	}
}