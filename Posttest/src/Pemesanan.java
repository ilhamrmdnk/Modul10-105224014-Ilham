public class Pemesanan {

    String nama;
    String judulFilm;
    String kursi;
    int harga;

    public Pemesanan(String nama, String judulFilm, String kursi, int harga) {
        this.nama = nama;
        this.judulFilm = judulFilm;
        this.kursi = kursi;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Nama: " + nama
                + " | Film: " + judulFilm
                + " | Kursi: " + kursi
                + " | Harga: Rp " + harga;
    }
}