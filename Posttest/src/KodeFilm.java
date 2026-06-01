public class KodeFilm {

    String kodeFilm;
    String judul;
    int harga;

    public KodeFilm(String kodeFilm, String judul, int harga) {
        this.kodeFilm = kodeFilm;
        this.judul = judul;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return kodeFilm + " - " + judul + " (Rp " + harga + ")";
    }
}