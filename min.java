class abc
{
int min(int x[])
{
int m1,l;
l=x.length;
m1=x[0];
for(int i=1;i<l;i++)
{
if(x[i] <m1)
m1=x[i];
}
return m1;
}
public static void main(String s[])
{
int m;
abc a1=new abc();
int a[]={2,5,7,6,5,3,1,4};
m=a1.min(a);
System.out.println("The smallest element is"+m);

}
}