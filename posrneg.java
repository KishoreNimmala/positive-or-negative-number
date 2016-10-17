import java.io.*;
import java.util.Scanner;
class posrneg
{
public static void main(String[] args)
{
Scanner a=new Scanner(System.in);
double n=a.nextInt();
if(n>0.0)
{
System.out.println("Entered number is positive:"+n);
}
else if(n<0.0)
{
System.out.println("Entered number is negative:"+n);
}
else 
{
System.out.println("Entered number is ZERO");
}
}
}
