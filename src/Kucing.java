public class Kucing {
    String nama;
    int umur;
    String kelamin;
    String ras;
    String warnaRambut;

    public Kucing(String nama, int umur, String kelamin, String ras, String warnaRambut) {
        this.nama = nama;
        this.umur = umur;
        this.kelamin = kelamin;
        this.ras = ras;
        this.warnaRambut = warnaRambut;
    }

    void turu() {
        System.out.println("Kur.. Kur.. Kur...");
    }

    void ngeong() {
        System.out.println("Rawr.. Rawrr...");
    }

    void makan() {
        System.out.println("nyam..nyam...");
    }

    void infoKucingRawrHD() {
        System.out.println("Nama Kucing: " + nama);
        System.out.println("Umur Kucing: " + umur);
        System.out.println("Jenis Kelamin Kucing: " + kelamin);
        System.out.println("Ras Kucing: " + ras);
        System.out.println("Warna Rambut Kucing: " + warnaRambut);
    }

    public static void main(String[] args) {

        Kucing tia = new Kucing("Tia", 3, "Betina", "Kampung", "Oren");
        tia.infoKucingRawrHD();
        tia.makan();
        tia.ngeong();
        tia.turu();gay kontol
        System.out.println("");

        Kucing arifin = new Kucing("Arifin", 2, "Jantan", "Himalaya", "Putih");
        arifin.infoKucingRawrHD();
        arifin.makan();
        arifin.ngeong();
        arifin.turu();
        System.out.println("");

        Kucing rusdi = new Kucing("Rusdi", 4, "Jantan", "Ngawi Persia", "Hitam Legam");
        rusdi.infoKucingRawrHD();
        rusdi.makan();
        rusdi.ngeong();
        rusdi.turu();
        System.out.println("");
    }
}

