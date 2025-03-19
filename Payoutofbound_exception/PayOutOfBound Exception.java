import java.util.*;
import java.io.*;

class PayOutOfBoundsException extends Exception
{
 PayOutOfBoundsException(String msg)
{
   System.out.println("Pay out of bounds "+msg);
}}

public class userdefined
{
   public static void main(String args[]) throws PayOutOfBoundsException
{
  Scanner sc=new Scanner(System.in);
float sal;
System.out.print("enter the salary");
sal=sc.nextFloat();
if(sal<10000|| sal>50000)
throw new PayOutOfBoundsException(sal+" is not in range");
else
System.out.println("gets 30% hike");
}
}