class abc
{

static void sort(int x[])
{

int t;
for(int i=0;i<x.length;i++)
{
for(int j=i+1;j<x.length;j++)
{
if(x[i]>x[j]){
t=x[i];
x[i]=x[j];
x[j]=t;
}
}
}
for(int i=0;i<x.length;i++){
System.out.println("sorted array " +x[i]);

}
}

public static void main(String args[]){
sort(new int[] {9,8,4,5,6,7,3,2});

}
}
