import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any Integer :");
        int x = scan.nextInt();
        System.out.println(x);

        System.out.print("Enter any Long Integer :");
        long y = scan.nextLong();
        System.out.println(y);

        System.out.print("Enter any Byte Integer :");
        byte z = scan.nextByte();
        System.out.println(z);

        System.out.print("Enter any Short Integer :");
        short s = scan.nextShort();
        System.out.println(s);

        System.out.print("Enter any Float :");
        Float f = scan.nextFloat();
        System.out.println(f);

        System.out.print("Enter any Double :");
        double d = scan.nextDouble();
        System.out.println(d);

        System.out.print("Enter any Boolean :");
        boolean b = scan.nextBoolean();
        System.out.println(b);

        System.out.print("Enter any Line :");
        String s1 = scan.next();
        System.out.println(s1);

        System.out.print("Enter any line:");
        String s2 = scan.nextLine();
        System.out.println(s2);

        System.out.print("Enter any Character :");
        char c = scan.next().charAt(0);
        System.out.println(c);

    }

}
