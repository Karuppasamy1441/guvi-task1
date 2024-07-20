import java.util.*;
public class SmallestNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=in.nextInt();
        System.out.println("Enter second number :");
        int b=in.nextInt();
        System.out.println("Enter third nmber :");
        int c=in.nextInt();
        int result=(a>b)?(b>c)?c:b :(a>c)?c:a;
        System.out.println("smallest Number is "+result);
    }
}
