class armstrong
{
public static void main(String args[])
{
int r,sum=0;
int n=153;
int temp=n;
while(n>0)
{
r=n%10;
n=n/10;
sum=sum+(r*r*r);
}
if(temp==sum)
{
System.out.print("armstrong no");
}
else
{
System.out.println("not");
}

}}
