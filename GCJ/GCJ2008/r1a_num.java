import java.util.*;
class r1a_num
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long test=sc.nextInt();
        for(int i=1;i<=test;i++){
           long n=sc.nextInt();
           double a=Math.sqrt(5);
           double b=Math.pow((3+a),n);
           long t=(long)b;
           long res=t%1000;
           if(res<100)
            System.out.println("Case #"+i+": 0"+res);
           else
            System.out.println("Case #"+i+": "+res);}
    }
}
