import java.util.Scanner;

public class Prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows ");
        int row = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++)
                System.out.print(m);
            for(int n=i-1;n>=1;n--)
                System.out.print(n);

            System.out.println();
        }

    }
}