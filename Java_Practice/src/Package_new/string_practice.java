package Package_new;

import java.util.Calendar;
import java.util.Date;

import javax.swing.Spring;

public class string_practice {

	public static void String_pract(Spring args[]){
		/*//This is normal method
		String strname="manoj1232";
		System.out.println(strname);
		
		//By using character array
		
		char[] newarray={'M','A','N','O','J','I'};
		String newarray1=new String(newarray);
		System.out.println(newarray1);
	}
	
*/
		String mj="   Manoj         ";
		/*String i="ITHAPE";
		//By using concat method we can connect 2 string
		System.out.println(mj.concat(i));
		System.out.println("Manoj"+"G"+"Ithape");
		
		*/
	System.out.println(mj.toLowerCase());	
	System.out.println(mj.toUpperCase());
	System.out.println(mj.trim().length());
	System.out.println(mj.length());
	Date date=new Date();
	System.out.println(date.toString());
	System.out.println(date.getTime());
	System.out.println(date.getHours());
	
	
	}
}
