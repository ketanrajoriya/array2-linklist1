import java.util.*;
class Quest7
{
public static void main(String s[])
{
int i,j,k,sum;
Scanner scr = new Scanner(System.in);
System.out.print("How large do you want the array? " ); 
int arrlength=scr.nextInt();
int array[] = new int[arrlength];
int array2[][] = new int[arrlength][arrlength];
for( i=0 ; i<array.length ; i++ ) 
{  
System.out.print( "Enter value " + (i+1) + ": " ); 
array[i] = scr.nextInt(); 
} 

System.out.println("enter the sum");
int number = scr.nextInt();

for(i=0;i<array.length;i++)
{
//sum=0;
sum=array[i];

//array2[i][0]=array[i];

for(j=(i+1);j<array.length;j++)
{
if(sum==number)
{
System.out.println("sum founded bw index"+i+"  "+(j-1));
}
if(sum>number ||j == array.length)
{
break;
}

sum=sum+array[j];
}
}
}
}
