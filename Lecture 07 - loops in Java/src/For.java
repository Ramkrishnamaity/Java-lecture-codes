import java.util.Scanner;


public class For {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter n :");

        int n=sc.nextInt();

//        for(int start=1;start<=n;start++){
//            System.out.println(start);
//        }

        int start=n;
        for(;;){
            if(start<1)
                break;
            System.out.println(start);
            start--;
        }

    }
}
