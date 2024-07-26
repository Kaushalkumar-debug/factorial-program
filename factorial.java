import java.util.Scanner;
public class factorial {
   public static void main(System[]args){
int n;
System.out.println("enter a number");
Scanner r=new Scanner(System.in);
n=r.nextInt();
int fact=1;
for(int i=1;i<=n;i++){
    fact=fact*i;
    System.out.println(fact);
}
   } 
}
