import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("2");
            }
            System.out.println();
        }

    }
}
