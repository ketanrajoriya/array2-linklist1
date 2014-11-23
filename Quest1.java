import java.util.*;
class Quest1
{
public static void main(String s[])
{
int i,j,k;
Scanner scr = new Scanner(System.in);
System.out.print("How large do you want the array? " ); 
int arrlength=scr.nextInt();
int array[] = new int[arrlength];
for( i=0 ; i<array.length ; i++ ) 
{  
System.out.print( "Enter value " + (i+1) + ": " ); 
array[i] = scr.nextInt(); 
} 

System.out.println("enter the sum");
int number = scr.nextInt();

for(i=0;i<array.length-2;i++)
{
for(j=(i+1);j<array.length-1;j++)
{
for(k=(j+1);k<array.length;k++)
{
if((array[i]+array[j]+array[k])==number)
{
System.out.println("first_number    "+array[i]+"   second_number   "+array[j]+"   third_number   "+array[k]);
}
}
}
}
}
} 