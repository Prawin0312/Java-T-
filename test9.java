interface Calculator
 {
 int sum(int x,int y);
 int product(int x,int y);
 double divide(int x,int y);
 }
class AbcCalc implements Calculator
{
	public int sum(int x,int y)
	{
	return x+y;
	}
	public int product(int x,int y)
	{
	return x*y;
	}
	public double divide(int x,int y)
	{
	return x/y;
	}
}
class XyzCalc implements Calculator
{
	public int sum(int x,int y)
	{
	return (x-(-y));
	}
	public int product(int x,int y)
	{
	return x*y;
	}
        public double divide(int x,int y)
        {
        return x/y;i
        }
}
class test9
{
public static void main(String[] args)
{
Calculator a = new XyzCalc();
System.out.println(a.sum(10,20));
System.out.println(a.product(10,20));
System.out.println(a.divide(20,10));
}
}


