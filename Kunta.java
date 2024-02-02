public class Kunta implements Comparable<Kunta> {
    private int koodi;
    private String nimi;
    private String maakunta;
    private int vaestoLuku;
    private double pintaAla;

    public Kunta(int koodi, String nimi, String maakunta, int vaestoLuku, double pintaAla) {
        this.koodi = koodi;
        this.nimi = nimi;
        this.maakunta = maakunta;
        this.vaestoLuku = vaestoLuku;
        this.pintaAla = pintaAla;
    }

    @Override
    public String toString() {
        return "Kunta{" +
                "koodi=" + koodi +
                ", nimi='" + nimi + '\'' +
                ", maakunta='" + maakunta + '\'' +
                ", vaestoLuku=" + vaestoLuku +
                ", pintaAla=" + pintaAla +
                '}';
    }

    @Override
    public int compareTo(Kunta toinen) {
        return toinen.getVaestoLuku() - this.getVaestoLuku();
    }

    // Korjattu getter ja setter
    public int getKoodi() {
        return koodi;
    }

    public void setKoodi(int koodi) {
        this.koodi = koodi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getMaakunta() {
        return maakunta;
    }

    public void setMaakunta(String maakunta) {
        this.maakunta = maakunta;
    }

    public int getVaestoLuku() {
        return vaestoLuku;
    }

    public void setVaestoLuku(int vaestoLuku) {
        this.vaestoLuku = vaestoLuku;
    }

    public double getPintaAla() {
        return pintaAla;
    }

    public void setPintaAla(double pintaAla) {
        this.pintaAla = pintaAla;
    }
}
