import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = sc.nextInt();

        if(age<=12){
            System.out.println("child");
        }
        else if(age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("adult");
        }
    }
}
