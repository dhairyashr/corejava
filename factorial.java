import java.util.Scanner;
public class factorial
{
public static void main(String [] args )
{
Scanner sc = new Scanner(System.in);
int i,n,p=1;
System.out.println("enter number");
n = sc.nextInt();
for(i=n;i>0;i--)
{
p=p*i;
}
System.out.println("factorial of number"+p);
}
}