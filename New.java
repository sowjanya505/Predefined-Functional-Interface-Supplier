####Demo Program For Supplier to supply 6-digit Random OTP:

	import java.util.function.*;
	import java.util.*;
	class New
	{	
		public static void main(String[] args)
		{
		Supplier<String> otps=()->{
		String otp="";
		for(int i =1;i<=6;i++)
		{
		otp=otp+(int)(Math.random()*10);
		}
		return otp;
		};
	System.out.println(otps.get());
	System.out.println(otps.get());
	System.out.println(otps.get());
	System.out.println(otps.get());

	 }


output::

492499
055284
531389
925530


