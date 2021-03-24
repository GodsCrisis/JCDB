import java.util.Scanner;

public class Menu {
    public static int menu(){
        System.out.println("Co chcesz zrobić? ");
        System.out.println("1.zaloguj się ");
        System.out.println("2.zamknij ");
        Scanner scan=new Scanner(System.in);
        int c=scan.nextInt();
        return c;

    }
}
