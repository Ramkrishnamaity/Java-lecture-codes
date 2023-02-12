

public class ConditionalOperator {
    public static void main(String[] args) {
        int num=18;

        if(num%2==0 && num%3==0){
            System.out.println(num);
        }

        if(num%3==0 || num%5==0){
            System.out.println(num);
        }
    }
}
