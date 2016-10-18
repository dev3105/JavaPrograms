import java.io.*;
class check
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in = new DataInputStream(System.in);
        int t=Integer.parseInt(in.readLine());
        int A[]=new int[t];
        for(int i=0;i<t;i++)
        {A[i]=Integer.parseInt(in.readLine());}
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<t-1;j++)
            {
              if(A[j]<A[j+1])
              {
                  A[j+1]=A[j]+A[j+1]; //a=2;b=3;b=5;
                  A[j]=A[j+1]-A[j]; //b=5-2=3 a=3
                  A[j+1]=A[j+1]-A[j]; //5-3 = 2
              }
            }
          }
          System.out.println("The result");
          for(int i=0;i<t;i++) {
                if(i==0)
                System.out.println(A[i]);
              else  if(A[i-1]!=A[i])
              System.out.println(A[i]);
        }
}
}
