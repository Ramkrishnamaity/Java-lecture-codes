import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int sum=0;
        int i=1;
//        sum=1-2+3-4...n

        while(n>i){

            if(i%2==0)
                sum -= i;
            else
                sum += i;

            i++;
        }
        System.out.println("sum of the given series "+sum);
    }
}
