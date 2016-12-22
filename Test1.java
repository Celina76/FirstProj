//for git hub

class Electronics
{
void cmpyName()
{
System.out.println("Samsung");
}}
class Radio extends Electronics
{
void speakerFreq()
{
System.out.println("Five sound base speakers");
}
void cmpyName()
{
System.out.println("Panasonic");
}
}
class Tv extends Electronics
{
void dispInch()
{
System.out.println("48 inch");
}}
class Cdplayer extends Electronics
{
void mulpDisk()
{
System.out.println("more 2 cd can be used");
}}
class Test1
{
public static void main(String a[])
{
Radio r=new Radio();
Tv t=new Tv();
Cdplayer c=new Cdplayer();
r.cmpyName();
r.speakerFreq();
t.dispInch();
t.cmpyName();
c.mulpDisk();
c.cmpyName();
}
}

