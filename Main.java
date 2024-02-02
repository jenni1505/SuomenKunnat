
//import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
//import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // LuoKunnat-luokka lukee kunnat tiedostosta ja tallentaa ne listaan
        LuoKunnat kuntaHallinta = new LuoKunnat();
        kuntaHallinta.lueKunnatTiedostosta("kunnat.txt");

        // Haetaan kaikki kunnat listalle
        List<Kunta> kaikkiKunnat = kuntaHallinta.getKunnat();

        while (true) {
            System.out.println("\nValitse toiminto:");
            System.out.println("1. Listaa maakunnan kunnat nimen mukaan");
            System.out.println("2. Etsi kymmenen suurinta kuntaa väkiluvun mukaan");
            System.out.println("3. Etsi kunnat, joiden pinta-ala ylittää rajan");
            System.out.println("4. Lajittele kunnat koodin mukaan");
            System.out.println("6. Lopeta");
            System.out.print("Anna valintasi (1-6): ");
            int valinta = Integer.parseInt(scanner.nextLine());

            switch (valinta) {
                case 1:
                    KuntaOperaatiot.listaaMaakunnanKunnatNimenMukaan(kaikkiKunnat, scanner);
                    break;
                case 2:
                    KuntaOperaatiot.listaaSuurimmatKunnatVakiluvunMukaan(kaikkiKunnat, scanner);
                    break;
                case 3:
                    KuntaOperaatiot.listaaKunnatSuuremmatKuinPintaAla(kaikkiKunnat, scanner);
                    break;
                case 4:
                    KuntaOperaatiot.listaaKunnatKoodinMukaan(kaikkiKunnat, scanner);
                    break;
                case 5:
                    // toiminnallisuus poistettu, mutta voidaan lisätä jokin huippuidea myöhemmin.
                    // ps. muista tehdä KuntaOperaatiot -tiedostoon metodi
                    break;
                case 6:
                    System.out.println("Ohjelma lopetettu.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Virheellinen valinta. Yritä uudelleen.");
                    break;
            }
        }
    }
}
