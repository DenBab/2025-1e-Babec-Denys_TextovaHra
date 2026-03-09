package randombull.randombull.CelaHra;
import java.util.Scanner;
import java.util.Random;

public class HraMain {
    public static void main(String[] args) {

        uvodJmeno();


    }


    private static void uvodJmeno() {
        System.out.println();
        System.out.println();
        System.out.println("Hej bracho, vitej ve hre!");
        System.out.println();
        System.out.println("Abych ti nemusel rikat bracho, jak se jmenujes?");
        System.out.println();
        Hrac hrac = new Hrac();
        Scanner sc = new Scanner(System.in);
        hrac.jmeno = sc.nextLine();
        System.out.println();
        System.out.println("Hmm, tak jo " + hrac.jmeno + " pokusim se ti vysvetlit jak to tady funguje.");
        System.out.println("Mas inventar a v nem veci, take mas moznosti. Vzdy ti napisu jestli chces udelat to nebo to. Jo, mimochodem mas 10 hp (zivotu)");
        System.out.println("Tahle hra ma vice koncu, takze si zkus to dohrat vickrat. A ted pojdme zacit.");
        System.out.println();
    }
}



