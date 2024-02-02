import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KuntaOperaatiot {

    public static void listaaMaakunnanKunnatNimenMukaan(List<Kunta> kunnat, Scanner scanner) {
        System.out.print("Minkä maakunnan kunnat haluat listata? ");
        String maakunta = scanner.nextLine(); // Käytä scanneria maakunnan nimen lukemiseen

        // Suodata halutun maakunnan kunnat ja järjestä ne aakkosjärjestyksessä
        List<Kunta> suodatetutKunnat = kunnat.stream()
                .filter(kunta -> kunta.getMaakunta().equalsIgnoreCase(maakunta))
                .sorted(Comparator.comparing(Kunta::getNimi))
                .collect(Collectors.toList());

        // Tulosta suodatetut ja järjestetyt kunnat
        if (suodatetutKunnat.isEmpty()) {
            System.out.println("Ei kuntia maakunnassa " + maakunta);
        } else {
            // suodatetutKunnat.forEach(System.out::println);
            // Tulosta suodatettujen ja lajiteltujen kuntien tiedot
            System.out.println("Kunnat maakunnassa " + maakunta + ":");
            for (Kunta kunta : suodatetutKunnat) {
                System.out.println(kunta.getNimi() + " - Väkiluku: " + kunta.getVaestoLuku());
            }
        }
    }

    public static void listaaSuurimmatKunnatVakiluvunMukaan(List<Kunta> kunnat, Scanner scanner) {

        kunnat.stream()
                .sorted(Comparator.comparingInt(Kunta::getVaestoLuku).reversed())
                .limit(10)
                .forEach(System.out::println);
    }

    public static void listaaKunnatSuuremmatKuinPintaAla(List<Kunta> kunnat, Scanner scanner) {

        System.out.print("Anna pinta-alan raja (km²), jonka ylittävät kunnat listataan: ");
        double raja = Double.parseDouble(scanner.nextLine());

        System.out.println("Kunnat, joiden pinta-ala ylittää " + raja + " km²:");
        kunnat.stream()
                .filter(kunta -> kunta.getPintaAla() > raja)
                .forEach(
                        kunta -> System.out.println(kunta.getNimi() + " - Pinta-ala: " + kunta.getPintaAla() + " km²"));
    }

    public static void listaaKunnatKoodinMukaan(List<Kunta> kunnat, Scanner scanner) {

        int maara = Integer.parseInt(scanner.nextLine());

        kunnat.stream()
                .sorted(Comparator.comparingInt(Kunta::getKoodi))
                .limit(maara)
                .forEach(System.out::println);
    }

}
