####A sample program for Supplier to supply Random Passwords


import java.util.function.*;
import java.util.*;
class Test3
{	
	public static void main(String[] args)
	{
	Supplier<String> s=()->
	{
	String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
	Supplier<Integer> d=()->(int)(Math.random()*10);
	Supplier<Character> c=()->symbols.charAt((int)(Math.random()*29));
	String pwd="";
	for(int i =1;i<=8;i++)
	{
	if(i%2==0)
	{
	pwd=pwd+d.get();
	}
	else
	{
	pwd=pwd+c.get();
	}
	}
	return pwd;
	};
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	}
}



Output: G2W3Y8W5 
	W7M8$0L3 
	T5T5N2F3 
	O9N2L0V2 
	A4I1$1P6

