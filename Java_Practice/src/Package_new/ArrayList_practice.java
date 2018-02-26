package Package_new;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Stack;
import java.util.Vector;

import javax.swing.Spring;

public class ArrayList_practice {
	
	public void Array(){
		
	/*	
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		//al.add("Manoj");
		al.add(40);
		System.out.println(al);
		Integer[] a=new Integer[al.size()];
		al.toArray(a);
		int sum=0;
		for (Integer a1:a)
		{
		sum=sum+a1;
		System.out.println(a1);
		}
		System.out.println(sum);
		
		}
	*/
/*	Vector v=new Vector();
	Vector v1=new Vector();
	int i;
	int j;
	for (i=0;i<10;i++){
		v.addElement(i);
		System.out.println(v);
		
	}
	for  (j=10;j>0;j--){
		v.removeElement(j);
		System.out.println(v);
		
	}
	System.out.println(v);
	v.addElement("Manoj");
	System.out.println(v);
	v.remove(0);
	System.out.println(v);
	System.out.println(v.size());
	v.clear();
	System.out.println(v);
	}
	*/
		
	Stack st=new Stack();
	st.push("manoj");
	st.push("Ithape");
	st.push("Earandoli");
	st.push("Oman");
	
	System.out.println(st.size());
	System.out.println(st);
	st.pop();
	System.out.println(st);	
	System.out.println(st.search("Ithape"));
	}
	
		
		
	}
	
