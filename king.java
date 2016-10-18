import java.util.*;
class king
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a1,b1;
		char a=(sc.next()).charAt(0);
		char b=(sc.next()).charAt(0);
		if(((a>=48)&&(a<=57))&&((b>=48)&&(b<=57)))
			System.out.println(Character.getNumericValue(a)+Character.getNumericValue(b));
		else
			System.out.println("Invalid Input");
	}
}