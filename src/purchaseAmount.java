import java.util.Scanner;

public class purchaseAmount {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int amount=in.nextInt();
        if(amount<500){
        System.out.println("payable amount :"+amount);
        }
        else if(amount>=500 && amount<=1000){
            System.out.println("payable amount  :"+amount*0.90);
       }
        else{
            System.out.println("payable amount :"+amount*0.80);
        }
    }
}
