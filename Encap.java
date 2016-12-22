
//for git hub branch
import java.util.*;
class Appl
{
private int sid=10;
private String sname="hai";
int getSid()
{
return sid;
}
String getSname()
{
return sname;
}
void setSid(int x)
{
sid=x;
}
void setSname(String n)
{
sname=n;
}
}
class Encap
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();

Appl a1=new Appl();
a1.setSid(20);
System.out.println(a1.getSid());
a1.setSname(s1);
System.out.println(a1.getSname());}  }                               