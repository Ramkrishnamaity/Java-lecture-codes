import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Emter any integer");
        int num=sc.nextInt();
        int sum=0;
        int digit;

        while(num>0){
            digit=num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println("Sum = "+sum);
    }
}
