public class Main {
    public static void main(String[] args) {
        SistemGudang gudang = new SistemGudang();

        // daftarin barang
        gudang.tambahBarangBaru("B01", "Laptop", "Elektronik", 10);
        gudang.tambahBarangBaru("B02", "Mouse", "Elektronik", 20);
        gudang.tambahBarangBaru("B03", "Buku Tulis", "ATK", 50);

        gudang.tambahStok("B01", 5);

        gudang.kurangiStok("B02", 10);

        gudang.kurangiStok("B01", 100);

        gudang.cetakLaporan();
    }
}