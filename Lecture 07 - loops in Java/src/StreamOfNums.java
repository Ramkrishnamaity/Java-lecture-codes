import java.util.Scanner;

public class StreamOfNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter num:");
        int num=sc.nextInt();
        int sum=0;
//        while(num!=-1){
//            sum+=num;
//            System.out.println("Enter num:");
//            num=sc.nextInt();
//        }

//        do{
//            sum+=num;
//            System.out.println("Enter num:");
//            num=sc.nextInt();
//        }while(num!=-1);
        while(true){
            if(num==-1)
                break;
            sum+=num;
            System.out.println("Enter num:");
            num=sc.nextInt();
        }

        System.out.println(sum);
    }
}
