import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result=1;

//        a raise to the power b

        while(b!=0){
            result*=a;
            b--;
        }
        System.out.println("a**b = "+result);

    }
}
