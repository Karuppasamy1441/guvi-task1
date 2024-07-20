public class ReverseNumber {
    public static void main(String[] args){
        int num=678;
        int reverse=0;
        while(num>0){
            int d=num%10;
            reverse =reverse*10 +d;
            num =num/10;
        }
        System.out.println(reverse);
    }
}
