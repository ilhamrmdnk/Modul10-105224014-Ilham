public class Anggota {

    String idAnggota;
    String nama;
    String tipe;

    public Anggota(String idAnggota, String nama, String tipe) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.tipe = tipe;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Anggota anggota = (Anggota) obj;

        return idAnggota.equals(anggota.idAnggota);
    }

    @Override
    public int hashCode() {
        return idAnggota.hashCode();
    }

    @Override
    public String toString() {
        return idAnggota + " - " + nama + " (" + tipe + ")";
    }
}