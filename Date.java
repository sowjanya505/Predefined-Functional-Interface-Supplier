###Demo Program for  Supplier to supply System Date:

	import java.util.function.*;
	import java.util.*;	
	class Date
	{	
		public static void main(String[] args)
		{		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		}
 }



output ::

>java Date 
Fri May 24 11:34:06 IST 2020
Fri May 24 11:34:06 IST 2020
Fri May 24 11:34:06 IST 2020

