import java.util.Scanner;

public class Zmienne {
    public String zmienne(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok a: ");
        int a=scan.nextInt();
        Scanner scan2=new Scanner(System.in);
        System.out.println("Podaj bok b: ");
        int b=scan2.nextInt();
        prostokat prostokat1=new prostokat(a,b);
        double g=prostokat1.obliczPromien();
        double y=prostokat1.obliczObwod();
        double t=prostokat1.obliczPole();
        String a1=Double.toString(t);
        String y1=Double.toString(y);
        String g1=Double.toString(g);
        String c=prostokat1.getBoka()+","+prostokat1.getBokb()+","+g1+","+a1+","+y1;
        return c;
    }
}
