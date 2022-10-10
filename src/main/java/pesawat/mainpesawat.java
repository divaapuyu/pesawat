
package pesawat;

import java.io.*;

public class mainpesawat {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        //deklarasi
        int kotat=0;
        //bali, lombok, jakarta, jogja, balikpapan, makassar, surabaya;
        //objek subclass
        //jumlahpenumpang, kotatujuan, nopesawat, nokursi, bookingID, nik, nama, jenis_kelamin, tglberangkat, tglkembali, kotaasal
        LionAir l = new LionAir(0,"","","","","","","","","","");
        Citilink c = new Citilink(0,"","","","","","","","","","");
        
        
        try{
            System.out.print("\n-------------PEMESANAN TIKET PESAWAT---------------");
            System.out.print("Masukkan jumlah penumpang : ");
            int jum = Integer.parseInt(br.readLine());
            System.out.print("Kota Asal Anda Adalah? ");
            String kotaa = br.readLine();
            if(kotaa.equals("surabaya")){
                System.out.print("Terdapat pilihan rute yang dapat anda pilih yaitu : \n 1. Bali\n2. Lombok\n3. Jakarta\n4. Yogyakarta\n5. Balikpapan\n6. Makassar\nPilih kota : ");
            kotat = Integer.parseInt(br.readLine());
            }
            if(kotaa.equals("jakarta")){
                System.out.print("Terdapat pilihan rute yang dapat anda pilih yaitu : \n 1. Bali\n2. Lombok\n3. Surabaya\n4. Yogyakarta\n5. Balikpapan\n6. Makassar\nPilih kota : ");
            kotat = Integer.parseInt(br.readLine());
            }
            System.out.print("Apakah anda ingin memesan tiket untuk pulang dan pergi?(ya=1, tidak=0)");
            int pilih = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Tanggal Keberangkatan : ");
            int tglb = Integer.parseInt(br.readLine());
            if(pilih==1){
                System.out.print("Masukkan Tanggal Kembali : ");
                int tglp = Integer.parseInt(br.readLine());
            }
            System.out.print("Terdapat 2 pilihan maskapai yang sesuai dengan rute anda yaitu :\n1. Lion Air\n2. Citilink\nPilih Maskapai : ");
            int maskapai = Integer.parseInt(br.readLine());
            //Lion Air
            if(maskapai==1){
                System.out.println("==<SELAMAT DATANG DI LION AIR>==");
                //Surabaya
                if (kotaa.equals("surabaya")){
                    if(kotat==1||kotat==2){
                        int hargat=500000;
                    }
                    if(kotat==3||kotat==4){
                        int hargat=600000;
                    }
                    if(kotat==5||kotat==6){
                        int hargat=700000;
                    }
                }
                //Jakarta
                if (kotaa.equals("jakarta")){
                    if(kotat==1||kotat==2){
                        int hargat=700000;
                    }
                    if(kotat==3||kotat==4){
                        int hargat=750000;
                    }
                    if(kotat==5||kotat==6){
                        int hargat=800000;
                    }
                }
                
                
            }
            //Citilink
            if(maskapai==2){
                System.out.println("==<SELAMAT DATANG DI CITILINK>==");
                //Surabaya
                if (kotaa.equals("surabaya")){
                    if(kotat==1||kotat==2){
                        int hargat=700000;
                    }
                    if(kotat==3||kotat==4){
                        int hargat=800000;
                    }
                    if(kotat==5||kotat==6){
                        int hargat=850000;
                    }
                }
                //Jakarta
                if (kotaa.equals("jakarta")){
                    if(kotat==1||kotat==2){
                        int hargat=1000000;
                    }
                    if(kotat==3||kotat==4){
                        int hargat=750000;
                    }
                    if(kotat==5||kotat==6){
                        int hargat=900000;
                    }
                }
            }
            
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void datapenumpang()throws IOException{
        System.out.println("");
    }
    
}
