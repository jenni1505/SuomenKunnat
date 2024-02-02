import java.util.Comparator;

public class KuntaComparator {

    public static Comparator<Kunta> byKoodi() {
        return Comparator.comparingInt(k -> k.getKoodi());
    }

    public static Comparator<Kunta> byNimi() {
        return Comparator.comparing(Kunta::getNimi);
    }

    public static Comparator<Kunta> byMaakuntaJaNimi() {
        return Comparator.comparing(Kunta::getMaakunta)
                .thenComparing(Kunta::getNimi);
    }

    public static Comparator<Kunta> byVaestoLuku() {
        return Comparator.comparingInt(Kunta::getVaestoLuku).reversed();
    }

    public static Comparator<Kunta> byPintaAla() {
        return Comparator.comparingDouble(Kunta::getPintaAla).reversed();
    }
}
