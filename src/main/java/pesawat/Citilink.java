
package pesawat;

/**
 *
 * @author HabibFr
 */
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
        return super.getTglkembali(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTglberangkat() {
        return super.getTglberangkat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    public void printSemua() {
        System.out.println("===< preview tiket citilink >===");
        System.out.println("BookingID : " + getBookingID());
        System.out.println("NIK : " + getNik());
        System.out.println("Nama : " + getNama());
        System.out.println("Kota Asal : " + getKotaAsal());
        System.out.println("Kota Tujuan : " + getKotaTujuan());
        System.out.println("Tgl Berangkat : " + getTglberangkat());
        System.out.println("Tgl Kembali : " + getTglkembali());
        System.out.println("No Pesawat : " + getNoPesawat());
        System.out.println("No Kursi : " + getNoKursi());
        System.out.println("Harga Tiket : " + getHarga() + "\n");

    }

}