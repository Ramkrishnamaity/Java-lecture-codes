import java.util.Scanner;

import static java.lang.System.exit;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer");
        int num = sc.nextInt();
        int i=1;
        int fact=1;

//        int fact=1;
//        if(num==0 && num==1){
//            fact=1;
//        }
//        else {
//            while (i<=num){
//                fact*=i;
//                i++;
//            }
//        }
//        System.out.println("Factorial = "+fact);

        while(i<=num){
            fact*=i;
            System.out.println("factorial 0f " + i +" = " + fact);
            i++;
        }

    }
}
