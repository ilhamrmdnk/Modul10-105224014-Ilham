import java.util.*;

public class Main {

    public static void main(String[] args) {

        //nmr 1
        System.out.println("===== SOAL 1 =====");

        HashMap<String, Buku> katalogBuku = new HashMap<>();

        katalogBuku.put("B001", new Buku("B001", "Pemrograman Berorientasi Objek"));
        katalogBuku.put("B002", new Buku("B002", "Metode Numerik"));
        katalogBuku.put("B003", new Buku("B003", "Jaringan Komputer"));

        System.out.println(katalogBuku.get("B002"));

        //nmr 2
        System.out.println("\n===== SOAL 2 =====");

        HashSet<Anggota> daftarAnggota = new HashSet<>();
        Anggota a1 = new Anggota("A001", "Ilham", "Mahasiswa");
        Anggota a2 = new Anggota("A002", "Remdeng", "Dosen");
        Anggota a3 = new Anggota("A003", "Kurniawan", "Mahasiswa");
        // data duplikat
        Anggota a4 = new Anggota("A001", "Remdeng Duplicate", "Dosen");

        daftarAnggota.add(a1);
        daftarAnggota.add(a2);
        daftarAnggota.add(a3);
        daftarAnggota.add(a4);

        System.out.println("Daftar Anggota:");

        for (Anggota a : daftarAnggota) {
            System.out.println(a);
        }

        //nmr 3
        System.out.println("\n===== SOAL 3 =====");

        Deque<String> antrean = new ArrayDeque<>();

        antrean.addLast("A001#B001");
        antrean.addFirst("A002#B002");
        antrean.addLast("A003#B003");
        antrean.addFirst("A002#B003");

        System.out.println("Isi Antrean:");
        System.out.println(antrean);

        //nmr 4
        System.out.println("\n===== SOAL 4 =====");

        HashSet<String> bukuDipinjam = new HashSet<>();

        while (!antrean.isEmpty()) {

            String data = antrean.pollFirst();

            String[] pecah = data.split("#");

            String idAnggota = pecah[0];
            String isbn = pecah[1];

            boolean anggotaAda = false;

            for (Anggota a : daftarAnggota) {

                if (a.idAnggota.equals(idAnggota)) {
                    anggotaAda = true;
                    break;
                }
            }

            if (!anggotaAda) {
                System.out.println("Gagal: Anggota tidak terdaftar");
                continue;
            }

            if (!katalogBuku.containsKey(isbn)) {
                System.out.println("Gagal: Buku tidak ditemukan");
                continue;
            }

            if (bukuDipinjam.contains(isbn)) {
                System.out.println("Gagal: Buku sedang dipinjam");
                continue;
            }

            bukuDipinjam.add(isbn);

            System.out.println(
                "Berhasil: "
                + idAnggota
                + " meminjam "
                + katalogBuku.get(isbn).judul
            );
        }

        System.out.println("\nBuku Sedang Dipinjam:");
        System.out.println(bukuDipinjam);
    }
}