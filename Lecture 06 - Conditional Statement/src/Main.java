
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Integer :");
        int input = sc.nextInt();

        if(input%2!=0){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
}