import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any Integer");
        int num=sc.nextInt();
        int copyNum=num;
        int count=0;
        int digit;
        int reverseNum=0;

        while(copyNum!=0){
            count++;
            copyNum/=10;
        }

        while(num>0){
            digit=num%10;
            reverseNum = digit+reverseNum*10;
            num/=10;
        }

        System.out.println("reverse of given num "+reverseNum);
    }
}
