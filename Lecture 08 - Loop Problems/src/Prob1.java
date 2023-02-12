import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Integer");
        int num=sc.nextInt();
        int count=0;

        while(num!=0){          /* or (num>0)  */
            count++;
            num/=10;
        }
        System.out.println(count+" Digits");
    }
}
