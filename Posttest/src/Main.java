import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, KodeFilm> daftarFilm = new HashMap<>();

        daftarFilm.put("F01",
                new KodeFilm("F01", "Avengers", 50000));

        daftarFilm.put("F02",
                new KodeFilm("F02", "Interstellar", 45000));

        daftarFilm.put("F03",
                new KodeFilm("F03", "Berlin", 40000));

        System.out.println("=== DAFTAR FILM ===");

        for (KodeFilm film : daftarFilm.values()) {
            System.out.println(film);
        }

        HashSet<String> kursiTerpakai = new HashSet<>();
        ArrayList<Pemesanan> riwayat = new ArrayList<>();

        prosesPesanan(
                "Ilham",
                "F01",
                "A1",
                daftarFilm,
                kursiTerpakai,
                riwayat
        );

        prosesPesanan(
                "Remdeng",
                "F02",
                "B4",
                daftarFilm,
                kursiTerpakai,
                riwayat
        );

        prosesPesanan(
                "Kurniawan",
                "F03",
                "A1",
                daftarFilm,
                kursiTerpakai,
                riwayat
        );

        System.out.println("\n=== RIWAYAT PEMESANAN ===");

        for (Pemesanan p : riwayat) {
            System.out.println(p);
        }
    }

    public static void prosesPesanan(
            String nama,
            String kodeFilm,
            String kursi,
            HashMap<String, KodeFilm> daftarFilm,
            HashSet<String> kursiTerpakai,
            ArrayList<Pemesanan> riwayat
    ) {

        if (!daftarFilm.containsKey(kodeFilm)) {

            System.out.println(
                    "Pesanan gagal! Kode film "
                            + kodeFilm
                            + " tidak ditemukan."
            );

            return;
        }

        if (kursiTerpakai.contains(kursi)) {

            System.out.println(
                    "Pesanan gagal! Kursi "
                            + kursi
                            + " sudah dipakai."
            );

            return;
        }

        KodeFilm film = daftarFilm.get(kodeFilm);

        kursiTerpakai.add(kursi);

        Pemesanan pemesanan = new Pemesanan(
                nama,
                film.judul,
                kursi,
                film.harga
        );

        riwayat.add(pemesanan);

        System.out.println(
                "Pesanan berhasil untuk "
                        + nama
                        + " (" + film.judul + ")"
        );
    }
}