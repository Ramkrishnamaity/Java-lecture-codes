import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int row = sc.nextInt();

//        for(int i=row;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for(int i=1;i<=row;i++){
            for(int j=1;j<=(row-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}