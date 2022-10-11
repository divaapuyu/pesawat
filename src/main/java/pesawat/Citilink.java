
package pesawat;
public class Citilink extends tiket {

    private int jumlahPenumpang, harga;
    private String kotaTujuan, noPesawat, noKursi;


    public Citilink( String kotaTujuan, String noPesawat, String noKursi, String bookingID, String nik, String nama, String jenisKelamin, String tglBerangkat, String tglKembali, String kotaAsal) {
        super(bookingID, nik, nama, jenisKelamin, tglBerangkat, tglKembali, kotaAsal);
        this.jumlahPenumpang = jumlahPenumpang;
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public int getHarga() {

        if (super.getKotaAsal().equalsIgnoreCase("Surabaya")) {

            if ((getKotaTujuan().equalsIgnoreCase("Lombok")) || (getKotaTujuan().equalsIgnoreCase("Bali"))) {
                this.harga = 700000;
            } else if ((getKotaTujuan().equalsIgnoreCase("Jakarta")) || (getKotaTujuan().equalsIgnoreCase("Yogyakarta"))) {

                this.harga = 800000;
            } else if ((getKotaTujuan().equalsIgnoreCase("Balikpapan")) || (getKotaTujuan().equalsIgnoreCase("Makasar"))) {

                this.harga = 850000;
            }
        } else if (super.getKotaAsal().equalsIgnoreCase("Jakarta")) {

            if ((getKotaTujuan().equalsIgnoreCase("Lombok")) || (getKotaTujuan().equalsIgnoreCase("Bali"))) {
                this.harga = 1000000;
            } else if ((getKotaTujuan().equalsIgnoreCase("Surabaya")) || (getKotaTujuan().equalsIgnoreCase("Yogyakarta"))) {

                this.harga = 750000;
            } else if ((getKotaTujuan().equalsIgnoreCase("Balikpapan")) || (getKotaTujuan().equalsIgnoreCase("Makasar"))) {

                this.harga = 900000;
            }
        }
        return harga;
    }

    public String getKotaTujuan() {
        return kotaTujuan;
    }

    public String getNoPesawat() {
        return noPesawat;
    }

    public String getNoKursi() {
        return noKursi;
    }

    public int getTotal() {
        return getHarga() * getJumlahPenumpang();
    }

    @Override
    public String getTglkembali() {
        return super.getTglkembali();
    }
    @Override
    public String getTglberangkat() {
        return super.getTglberangkat(); 
    }
    @Override
    public String getJenis_kelamin() {
        return super.getJenis_kelamin();
    }
    
    public void printSemua() {
        System.out.println("===< PRINT DATA PENUMPANG CITILINK >===");
        System.out.println("BookingID \t\t: " + getBookingID());
        System.out.println("NIK \t\t\t: " + getNik());
        System.out.println("Nama \t\t\t: " + getNama());
        System.out.println("Jenis Kelamin \t\t: " + getJenis_kelamin());
        System.out.println("Kota Asal \t\t: " + getKotaAsal());
        System.out.println("Kota Tujuan \t\t: " + getKotaTujuan());
        System.out.println("Tgl Berangkat \t\t: " + getTglberangkat());
        System.out.println("Tgl Kembali \t\t: " + getTglkembali());
        System.out.println("No Pesawat \t\t: " + getNoPesawat());
        System.out.println("No Kursi \t\t: " + getNoKursi());
        System.out.println("Harga Tiket \t\t: " + getHarga() + "\n");

        }

}