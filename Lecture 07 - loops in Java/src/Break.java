import java.util.Scanner;

public class Break {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num=5;
        int ans;
        while(true){
            if(num%5==0 && num%7==0){
                ans=num;
                break;
            }
            num++;
        }
        System.out.println(ans);
    }
}
