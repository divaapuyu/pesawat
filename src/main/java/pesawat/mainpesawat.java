package pesawat;

import java.io.*;

public class mainpesawat {
public static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
public static String id, nama, jk, tglp,nik, nopes, nokur,tglb, x;
      
    public static void main(String[] args) {
        //deklarasi
        int kotat=0,harga=0, pilih=0, total=0;
        
        try{
            do{
                System.out.println("\n-------------PEMESANAN TIKET PESAWAT---------------");
                System.out.print("Masukkan jumlah penumpang : ");
                int jum = Integer.parseInt(br.readLine());
                LionAir l[] = new LionAir[jum];
                Citilink c[] = new Citilink[jum];
                System.out.print("Kota Asal Anda Adalah? ");
                String kotaa = br.readLine();
               
                if(kotaa.equalsIgnoreCase("surabaya")){
                    System.out.print("Terdapat pilihan rute yang dapat anda pilih yaitu : \n1. Bali\n2. Lombok\n3. Jakarta\n4. Yogyakarta\n5. Balikpapan\n6. Makassar\nPilih kota : ");
                kotat = Integer.parseInt(br.readLine());
                
                    if(kotat == 1){
                        x = "Bali";
                    }else if(kotat == 2){
                        x = "Lombok";
                    }else if (kotat == 3){
                        x = "Jakarta";
                    }else if(kotat == 4){
                        x = "Yogyakarta";
                    }else if(kotat == 5){
                        x = "Balikpapan";
                    }else if(kotat == 6){
                        x = "Makassar";
                    }
                    System.out.println("---------------------------------------------------");
                }
                if(kotaa.equals("jakarta")){
                    System.out.print("Terdapat pilihan rute yang dapat anda pilih yaitu :\n1. Bali\n2. Lombok\n3. Surabaya\n4. Yogyakarta\n5. Balikpapan\n6. Makassar\nPilih kota : ");
                kotat = Integer.parseInt(br.readLine());
                    if(kotat == 1){
                        x = "Bali";
                    }else if(kotat == 2){
                        x = "Lombok";
                    }else if (kotat == 3){
                        x = "Surabaya";
                    }else if(kotat == 4){
                        x = "Yogyakarta";
                    }else if(kotat == 5){
                        x = "Balikpapan";
                    }else if(kotat == 6){
                        x = "Makassar";
                    }
                }
                
                System.out.print("Apakah anda ingin memesan tiket untuk pulang dan pergi?(ya=1, tidak=0)");
                pilih = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Tanggal Keberangkatan : ");
                tglb = br.readLine();
                if(pilih==1){
                    System.out.print("Masukkan Tanggal Kembali : ");
                    tglp = br.readLine();
                }
                System.out.print("---------------------------------------------------\nTerdapat 2 pilihan maskapai yang sesuai dengan rute anda yaitu :\n1. Lion Air\n2. Citilink\nPilih Maskapai : ");
                int maskapai = Integer.parseInt(br.readLine());
                //Lion Air
                if(maskapai==1){
                    System.out.println("==<SELAMAT DATANG DI LION AIR>==");
                    for(int i=0;i<jum;i++){
                    datapenumpang();
                    // KotaTujuan, NoPesawat, no kursi, booking id, nik, nama, gender, tglberangkat, tgl kembali, kota asal
                    l[i] = new LionAir(x,nopes,nokur,id,nik,nama,jk,tglb,tglp,kotaa);
                        System.out.println("Harga tiket \t\t:"+ l[i].getHarga());
                        System.out.println("-------------");
                    }
                    for(int i=0; i<jum;i++){
                        total=total+l[i].getHarga();
                    }
                    for(int i= 0;i<jum;i++){
                        l[i].printSemua();
                    }
                    System.out.println("================================");
                    System.out.println("Total Harga = Rp"+total);
                    System.out.println("================================");
                }
                //Citilink
                if(maskapai==2){
                    System.out.println("==<SELAMAT DATANG DI CITILINK>==");
                    for(int i=0;i<jum;i++){
                    datapenumpang();
                    // KotaTujuan, NoPesawat, no kursi, booking id, nik, nama, gender, tglberangkat, tgl kembali, kota asal
                    c[i] = new Citilink(x,nopes,nokur,id,nik,nama,jk,tglb,tglp,kotaa);
                        System.out.println("Harga tiket \t\t:"+ c[i].getHarga());
                        System.out.println("-------------");
                    }
                    for(int i=0; i<jum;i++){
                        total=total+c[i].getHarga();
                    }
                    for(int i= 0;i<jum;i++){
                        c[i].printSemua();
                    }
                    System.out.println("================================");
                    System.out.println("Total Harga = Rp"+total);
                    System.out.println("================================");
                }
                
                System.out.print("Pesan tiket lagi?(ya=1, tidak=0) ");
                pilih = Integer.parseInt(br.readLine());
                total = 0;
            }while(pilih==1);
            System.exit(0);
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void datapenumpang()throws IOException{
        System.out.print("Booking ID \t\t: ");
         id = br.readLine();
        System.out.print("NIK \t\t\t: ");
         nik = br.readLine();
        System.out.print("Nama \t\t\t: ");
         nama = br.readLine();
        System.out.print("Jenis Kelamin(P/L) \t: ");
         jk = br.readLine();
        System.out.print("No.Pesawat \t\t: ");
         nopes = br.readLine();
        System.out.print("No.Kursi \t\t: ");
         nokur = br.readLine();
        
    }
}