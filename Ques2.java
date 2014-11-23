import java.util.*;
class Ques2
{
public static void main(String s[])
{
int i,j,k;
Scanner scr= new Scanner(System.in);
System.out.print("How large do you want the array? " ); 
int arrlength=scr.nextInt();
int array[] = new int[arrlength];
for( i=0 ; i<array.length ; i++ ) 
{  
System.out.print( "Enter value " + (i+1) + ": " ); 
array[i] = scr.nextInt(); 
} 
System.out.println("where do you want to shift the array press L for left and R for right");
Scanner scr2 = new Scanner(System.in);

char choice= scr2.nextLine().charAt(0);

System.out.println("you selected "+choice);

System.out.println("enter the element to which you want to shift the array");
int shift = scr.nextInt();
System.out.println("enter the number to search in the array");

int number = scr.nextInt();
int temp=0;
k=array.length-1;
if(choice=='r')
{
temp=array[k];

for(j=0;j<shift;j++)
{
for(i=array.length-2;i>=0;i--)
{
array[i+1]=array[i];
}
array[0]=temp;
}
}
if(choice=='l')
{
for(j=0;j<shift;j++)
{
temp=array[0];
for(i=0;i<k;i++)
{
array[i]=array[i+1];
}
array[k]=temp;

}
}
for(i=0;i<array.length;i++)
{
System.out.println("shifted array"+array[i]);
}      
int low=0;
int high=k;
while(low<high)
{
int m= low+(high-low)/2;
if(array[m]==number)
{
System.out.println("your number "+array[m]+" is at location "+m);
}
if(array[low]<array[m])
{
if(array[low]<=number && number<array[m])
{
high = m-1;
}
else low=m+1;
}
else
{
if(array[m]<=number && number<array[high])
{
low=m+1;
}
else
high=m-1;
}
}
}
}