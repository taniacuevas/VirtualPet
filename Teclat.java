import java.util.Scanner;

public class Teclat {

    Scanner sc = new Scanner(System.in);

    public int llegirEnter(String missatge) {
        System.out.print(missatge);
        int numero = sc.nextInt();
        return numero;
    }

    public String llegirText(String missatge) {
        System.out.print(missatge);
        String text = sc.next();
        return text;
    }
}
