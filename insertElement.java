import java.util.Scanner;
class insertElement{
public static void main(String args[]){
int i,size,pos,element;
int arr[]=new int[40];
Scanner in=new Scanner(System.in);
System.out.println("enter the array size");
size=in.nextInt();
System.out.println("enter the array elements");
for(i=0;i<size;i++){
arr[i]=in.nextInt();
}
System.out.println("enter the element which to be inserted");
element=in.nextInt();
System.out.println("enter the postion for new inserting element");
pos=in.nextInt();
//now creating space for the required position
for(i=size;i>pos;i--){
arr[i]=arr[i-1];
}
arr[pos]=element;
System.out.println("inserted the element successfuly");
System.out.println("now the new array is:");
for(i=0;i<size+1;i++){
System.out.println(arr[i] +" ");
}
}
}