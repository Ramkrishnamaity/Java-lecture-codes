import java.util.Scanner;


public class Do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n :");
        int n=sc.nextInt();
        int start=1;
        do{
            System.out.println(start);
            start++;
        }while(start<=n);





    }

}
