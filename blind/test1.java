import java.io.*;
class test1{
    public static void main(String args[])throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        int n=Integer.parseInt(in.readLine());
        for(int i=1;i<=10;i++)
        {
            if(i%n==0)
             System.out.println("Test Successful at "+i);
        }
    }
}
