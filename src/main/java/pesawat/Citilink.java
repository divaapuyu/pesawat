
package pesawat;

public class Citilink extends tiket{
    private int jmlhPenumpang, harga;
    private String kotaTujuan, noPesawat, noKursi;

    public Citilink(int jmlhPenumpang, String kotaTujuan, String noPesawat, String noKursi, String bookingID, String nik, String nama, String jenis_kelamin, String tglberangkat, String tglkembali, String kotaAsal) {
        super(bookingID, nik, nama, jenis_kelamin, tglberangkat, tglkembali, kotaAsal);
        this.jmlhPenumpang = jmlhPenumpang;
        this.kotaTujuan = kotaTujuan;
        this.noPesawat = noPesawat;
        this.noKursi = noKursi;
    }

    public int getJmlhPenumpang() {
        return jmlhPenumpang;
    }

    public int getHarga() {
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
    
    
    //custom
    public int total(int getHarga, int getJmlhpenumpang){
        return getHarga*getJmlhpenumpang;
    }
}
