

public class Continue {
    public static void main(String[] args) {

        int start=1;
        while(start<=50){
            if(start%3==0) {
                start++;
                continue;
            }
            System.out.println(start);
            start++;
        }
    }
}
