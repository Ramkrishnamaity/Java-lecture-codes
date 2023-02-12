import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the termination point:");
        int n=sc.nextInt();
        int start=1;

//        while(start<=n){
//            System.out.println(start);
//            start++;
//        }

        int sum=0;
        while(start<=n){
            sum+=start;
            start++;
        }
        System.out.println(sum);

    }
}
