import java.util.*;
class pri
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a1,b1;
		char a=(sc.next()).charAt(0);
		char b=(sc.next()).charAt(0);
		boolean chk= ((Character.isLetter(a))||(Character.isLetter(b)));
		if(chk==true) {
			System.out.println("Invalid Input");
		}
		else {
			int c=(Character.getNumericValue(a))+(Character.getNumericValue(b));
			System.out.println(c);
		}
	}
} 