package com.sample.Employee;

class Overload
{
	
    void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}
class OverRiding extends Overload
{
	
	void demo(int a)
	{
		a=a+10;
		System.out.println("new value "+ a);
	}
	void demo(int a,int b)
	{
		a=a+b;
		b=b-a;
		System.out.println("new value "+a+ ","+b);
	}
	double demo(double a)
	{
		return a*a*a;
	}
    public static void main (String args [])
    {
        OverRiding Obj = new OverRiding();
        double result;
        Obj.demo(10);
        Obj.demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);
        Overload ob=new Overload();
        ob.demo(5);
        ob.demo(10,10);
        System.out.println("After return :" +ob.demo(5.5));
    }
}