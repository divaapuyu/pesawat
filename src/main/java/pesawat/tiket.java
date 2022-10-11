
package pesawat;

public class tiket {

    String bookingID;
    public String nik, nama, jenis_kelamin, tglberangkat, tglkembali, kotaAsal;

    public tiket(String bookingID, String nik, String nama, String jenis_kelamin, String tglberangkat, String tglkembali, String kotaAsal) {
        this.bookingID = bookingID;
        this.nik = nik;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.tglberangkat = tglberangkat;
        this.tglkembali = tglkembali;
        this.kotaAsal = kotaAsal;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public String getTglberangkat() {
        return tglberangkat;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }
    
    
}
