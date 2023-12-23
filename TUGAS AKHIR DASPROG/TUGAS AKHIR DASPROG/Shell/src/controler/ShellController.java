package controler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Bensin;
import model.Pembeli;
import model.Penjual;
import model.Histori;
import model.Struk;

public class ShellController {

    ArrayList<Struk> struks = new ArrayList<>();
    ArrayList<Histori> historis = new ArrayList<>();
    HashMap<String, Bensin> bensins = new HashMap<>();
    static HashMap<String, Penjual> penjuals = new HashMap<>();
    static HashMap<String, Pembeli> pembelis = new HashMap<>();
    
    public Penjual getPenjual(String idPenjual){
        return this.getPenjual(idPenjual);
    }

    public Pembeli getPembeli(String idPembeli){
        return this.getPembeli(idPembeli);
    }

    public Bensin getBensin(String idBensin){
        return this.getBensin(idBensin);
    }
    public void setup(){
        Bensin bensin1 = new Bensin();
        Bensin bensin2 = new Bensin();
        Bensin bensin3 = new Bensin();
        Bensin bensin4 = new Bensin();
        Bensin bensin5 = new Bensin();
        
        bensin1.setIdBensin("01").setNamaBensin("Super         ").setHargaBensin(14000).setStokBensin(200);
        bensin2.setIdBensin("02").setNamaBensin("V-Power       ").setHargaBensin(15200).setStokBensin(0);
        bensin3.setIdBensin("03").setNamaBensin("V-Power Diesel").setHargaBensin(16400).setStokBensin(100);
        bensin4.setIdBensin("04").setNamaBensin("Diesel Extra  ").setHargaBensin(15700).setStokBensin(150);
        bensin5.setIdBensin("05").setNamaBensin("V-Power Nitro+").setHargaBensin(15500).setStokBensin(50);

        bensins.put(bensin1.getIdBensin(""), bensin1);
        bensins.put(bensin2.getIdBensin(""), bensin2);
        bensins.put(bensin3.getIdBensin(""), bensin3);
        bensins.put(bensin4.getIdBensin(""), bensin4);
        bensins.put(bensin5.getIdBensin(""), bensin5);
    }

    public int login(int pilihan){

        Scanner sc = new Scanner(System.in);
        Penjual admin1 = new Penjual();

        admin1.setIdPenjual("A01")
        .setPassword("1223")
        .setEmail("petugas@gmail.com")
        .setNama("Petugas");

        penjuals.put(admin1.getIdPenjual(""), admin1);

        System.out.println("\nSelamat Datang di Shell !");
        System.out.println("=============================");
        System.out.println("Pilih role atau kedudukan anda :");
        System.out.println("1. Admin / Penjual");
        System.out.println("2. Pembeli");
        System.out.println("3. Keluar");
        System.out.print("\nMasukkan angka 1 / 2 / 3 sesuai dengan pilihan anda : ");

        pilihan = sc.nextInt();
        sc.nextLine();

        while (pilihan == 1) {

            System.out.print("\nMasukkan ID admin : ");
            String idAdmin = sc.nextLine();
            System.out.print("Masukkan password admin : ");
            String passwordAdmin = sc.nextLine();
    
            if (idAdmin.equals(admin1.getIdPenjual("A01")) && passwordAdmin.equals(admin1.getPassword("1223"))) {

                System.out.println("\nLogin berhasil !");
                return 1;

            } else {

                System.out.println("\nLogin gagal, coba lagi !");
                System.out.println("\nPilih role atau kedudukan anda :");
                System.out.println("1. Admin / Penjual");
                System.out.println("2. Pembeli");
                System.out.println("3. Keluar");
                System.out.print("\nMasukkan angka 1 / 2 / 3 sesuai dengan pilihan anda : ");

                pilihan = sc.nextInt();
                sc.nextLine();
            }
        }
        switch (pilihan) {
            case 2:

                pilihan = 2;
                break;

            default:

                pilihan = 3;
                break;

        }
        return pilihan;
    }

    public  static void tampilanAdmin(){

        Penjual admin1 = new Penjual();

        admin1.setIdPenjual("A01")
        .setPassword("1223")
        .setEmail("rizkipunya@gmail.com")
        .setNama("Syukur");

        penjuals.put(admin1.getIdPenjual(""), admin1);

        System.out.println("\nSelamat datang admin !");
        System.out.println("Nama : " + admin1.getNama(""));
        System.out.println("Email : " + admin1.getEmail(""));
        System.out.println("============================");
        System.out.println("Apa yang akan anda lakukan ? :");
        System.out.println("1. Menambahkan stok bensin");
        System.out.println("2. Melihat daftar bensin");
        System.out.println("3. Melihat laporan penjualan");
        System.out.println("4. Keluar");
        System.out.print("Masukan pilihan anda : ");
    }

    public void dataPembeli(){

        Scanner sc = new Scanner(System.in);
        Pembeli pembeli1 = new Pembeli();
        pembeli1.setIdPembeli("P001");

                System.out.println("\nSelamat datang! !");
                System.out.println("=============================");

                System.out.print("Masukkan Nama anda : ");
                String namaPembeli = sc.nextLine();
                pembeli1.setNama(namaPembeli);

                System.out.print("Masukkan Jenis Kendaraan anda (mobil/motor) : ");
                String jeniskendaraanPembeli = sc.nextLine();
                pembeli1.setJeniskendaraan(jeniskendaraanPembeli);

                System.out.print("Masukkan Plat Nomor Anda : ");
                String platPembeli = sc.nextLine();
                pembeli1.setPlat(platPembeli);
                
                pembelis.put(pembeli1.getIdPembeli(""), pembeli1);
    }

    public  static void tampilanPembeli(){

        System.out.println("\nSelamat datang !");
        System.out.println("Apa yang akan anda lakukan :");
        System.out.println("1. Isi Bensin");
        System.out.println("2. Checkout");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan anda : ");

    }

    public void tambahBensin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("ID Bensin\tNama Bensin\tHarga\tStok");
            System.out.println("--------------------------------------------");
            
            for (Map.Entry<String, Bensin> entry : bensins.entrySet()) {
                Bensin bensin = entry.getValue();

                System.out.println(bensin.getIdBensin("") + 
                "\t\t" + bensin.getNamaBensin("") +
                "\t\t" + bensin.getHargaBensin(0) + 
                "\t" + bensin.getStokBensin(0));

            }
    
        System.out.println("\nBensin mana yang akan di re-stock?");
        System.out.println("=======================");
            
            int pilihanbensin = sc.nextInt();
            sc.nextLine();            
            
            System.out.println("Masukan stok (*satuan liter)");
                    int tambahStok = sc.nextInt();
                    sc.nextLine();

            switch (pilihanbensin){
                
                case 01:
                    int sisaBensin1 = bensins.get("01").getStokBensin(0);
                    bensins.get("01").setStokBensin(sisaBensin1+tambahStok);
                    System.out.println("Stok Berhasil Ditambahkan!");
                    break;
                case 02:
                    int sisaBensin2 = bensins.get("02").getStokBensin(0);
                    bensins.get("02").setStokBensin(sisaBensin2+tambahStok);
                    System.out.println("Stok Berhasil Ditambahkan!");
                    break;
                case 03:
                    int sisaBensin3 = bensins.get("03").getStokBensin(0);
                    bensins.get("03").setStokBensin(sisaBensin3+tambahStok);
                    System.out.println("Stok Berhasil Ditambahkan!");
                    break;
                case 04:
                    int sisaBensin4 = bensins.get("04").getStokBensin(0);
                    bensins.get("04").setStokBensin(sisaBensin4+tambahStok);
                    System.out.println("Stok Berhasil Ditambahkan!");
                    break;
                case 05:
                    int sisaBensin5 = bensins.get("05").getStokBensin(0);
                    bensins.get("05").setStokBensin(sisaBensin5+tambahStok);
                    System.out.println("Stok Berhasil Ditambahkan!");
                    break;
                default:
                
            }


        }


    public void tampilDaftarBensin() {
        System.out.println("\nDaftar Bensin");
        System.out.println("============");
    
    
        if (bensins.isEmpty()) {
            System.out.println("Belum ada bensin yang ditambahkan.");
        } else {
            System.out.println("ID Bensin\tNama Bensin\tHarga\tStok");
            System.out.println("--------------------------------------------");
            
            for (Map.Entry<String, Bensin> entry : bensins.entrySet()) {
                Bensin bensin = entry.getValue();

                System.out.println(bensin.getIdBensin("") + 
                "\t\t" + bensin.getNamaBensin("") +
                "\t\t" + bensin.getHargaBensin(0) + 
                "\t" + bensin.getStokBensin(0));

            }
        }
    }
    
    
    public int totalBelanja(ArrayList<Struk> st){
        int total = 0;
        for (Struk struks : st){
            total += struks.getSubTotal(0);
        }
        return total;
    }
    
    public void daftarBelanja(ArrayList<Struk> st){
        for (Struk struks : st){

            System.out.println("Nama Bensin\t : " + struks.getBensin().getNamaBensin(""));
            System.out.println("Harga\t : " + struks.getHargaJual(0));
            System.out.println("Jumlah\t : " + struks.getKuantitas(0));
            System.out.println("");
        }
    }

    public void isibensin() {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        if (bensins.isEmpty()) {
            System.out.println("Maaf, belum ada bensin yang tersedia untuk dibeli.");
            return;
        }

        System.out.println("\nDaftar Bensin yang Tersedia");
        System.out.println("============================");
        System.out.println("ID Bensin\tNama Bensin\tHarga\tStok");
        System.out.println("--------------------------------------------");

        for (Map.Entry<String, Bensin> entry : bensins.entrySet()) {
            Bensin bensin = entry.getValue();

            System.out.println(bensin.getIdBensin("") + 
            "\t\t" + bensin.getNamaBensin("") + 
            "\t\t" + bensin.getHargaBensin(0) + 
            "\t" + bensin.getStokBensin(0));
        }


        System.out.print("\nMasukkan ID Bensin yang ingin Anda beli (Ketik 'selesai' untuk selesai belanja) : ");
        String idBensinDibeli = sc.nextLine();

        while (!idBensinDibeli.equalsIgnoreCase("selesai")) {

            Bensin bensinDibeli = bensins.get(idBensinDibeli);

            if (bensinDibeli != null && bensinDibeli.getStokBensin(0) > 0) {

                System.out.println("Bensin yang Anda pilih : " + bensinDibeli.getNamaBensin(""));
                System.out.print("Masukkan jumlah yang ingin Anda beli (satuan liter) : ");

                int jumlahBeli = sc.nextInt();
                sc.nextLine();

                if (jumlahBeli > bensinDibeli.getStokBensin(0)) {

                    System.out.println("Maaf, stok tidak mencukupi.");

                } else {

                    count ++;

                    bensinDibeli.setStokBensin(bensinDibeli.getStokBensin(0) - jumlahBeli);

                    Struk struk = new Struk();

                    struk.setBensin(bensinDibeli)
                    .setKuantitas(jumlahBeli)
                    .setHargaJual(bensinDibeli
                    .getHargaBensin(0))
                    .setSubTotal(jumlahBeli * struk.getHargaJual(0))
                    .setIdStruk("Shell" + count);

                    struks.add(struk);

                    Histori histori = new Histori();

                    histori.setTanggal(LocalDate.now())
                    .setIdProsesJual("lp" + count);

                    historis.add(histori);

                    System.out.println("Anda berhasil isi bensin");
                }
            } else {

                System.out.println("Bensin tidak ditemukan atau stok habis.");

            }
   
            System.out.print("\nMasukkan ID Bensin selanjutnya yang ingin Anda beli (Ketik 'selesai' untuk selesai belanja): ");
            idBensinDibeli = sc.nextLine();

        }
    }

    public void tampilkanKeranjangPembeli() {

        if (struks.isEmpty()) {

            System.out.println("Keranjang belanja Anda kosong.");

        } else {

            System.out.println("\nIsi Keranjang Belanja Anda");
            System.out.println("===========================");
            System.out.println("Tanggal\t\tNama Bensin\tHarga Satuan\tJumlah\tSubtotal");
            System.out.println("-----------------------------------------------------------------");

            for (int i = 0; i < struks.size() && i < historis.size(); i++) {

                Struk struk = struks.get(i);
                Histori histori = historis.get(i);

                System.out.println(histori.getTanggal() + 
                "\t" + struk.getBensin().getNamaBensin("") + 
                "\t\t" + struk.getHargaJual(0) + 
                "\t\t" + struk.getKuantitas(0) + 
                "\t" + struk.getSubTotal(0));

            }
        }
    }

    public boolean checkout(boolean programCo) {

        Scanner sc = new Scanner(System.in);

        programCo = true;

        System.out.println("\n=== Checkout ===");


        if (struks.isEmpty()) {

            System.out.println("Tidak ada bensin dalam keranjang.");

        } else {

            System.out.println("=== Detail Belanja ===");
            System.out.println("ID struk : " + struks.get(0).getIdStruk(null));
            System.out.println("Admin : " + penjuals.get("A01").getNama(""));
            System.out.println("Tanggal Pembelian : " + historis.get(0).getTanggal());

            for (int i = 0; i < struks.size() && i < historis.size(); i++) {

                Struk struk = struks.get(i);
                Histori histori = historis.get(i);
                
                System.out.println("Nama Bensin: " + struk.getBensin().getNamaBensin(""));
                System.out.println("Harga Satuan: " + struk.getHargaJual(0));
                System.out.println("Jumlah: " + struk.getKuantitas(0)+ "Liter");
                System.out.println("Subtotal: " + struk.getSubTotal(0));
                System.out.println("=====================");
    
                histori.setTotal(totalBelanja(struks));
            }

            int totalBelanja = totalBelanja(struks);
            System.out.println("Total Belanja: " + totalBelanja);
            System.out.print("\nKonfirmasi pesanan (y/n) :");
            String pilihan = sc.nextLine();

            if(pilihan.equals("y")){

                programCo = false;

            }
        }

        return programCo;
    }
    
    public void laporanPenjualan(){

        System.out.println("\n====Laporan Penjualan====");
        System.out.println("Id Penjualan : " + historis.get(0).getIdProsesJual(""));
        System.out.println("Tanggal\t : " + historis.get(0).getTanggal());
        System.out.println("Admin\t : " + penjuals.get("A01").getNama(""));
        System.out.println("=========================\n");

            System.out.println("Tanggal\t\tNama Bensin\t   Harga Satuan\t      Jumlah\t      Subtotal Pembeli");
            System.out.println("--------------------------------------------------------------------------------");
            
                for (int i = 0; i < struks.size() && i < historis.size(); i++) {

                Struk struk = struks.get(i);
                Histori histori = historis.get(i);

                System.out.println(histori.getTanggal() + 
                "\t" + struk.getBensin().getNamaBensin("") + 
                "\t\t" + struk.getHargaJual(0) + 
                "\t\t" + struk.getKuantitas(0) + 
                "\t\t" + struk.getSubTotal(0)+ 
                "\t" + pembelis.get("P001").getNama(""));
                }
            
    }
}
