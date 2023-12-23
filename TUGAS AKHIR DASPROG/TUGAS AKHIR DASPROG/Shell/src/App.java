import java.util.Scanner;

import controler.ShellController;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ShellController tc = new ShellController();

        tc.setup();
        boolean program = true;
        boolean programAdmin = true;
        boolean programPembeli = true;

        while (program) {
            int pilihanLogin = 0;
            int terpilih = tc.login(pilihanLogin);
            if (terpilih == 1) {
                while (programAdmin) {
                    tc.tampilanAdmin();
                    int pilihanAdmin = sc.nextInt();
                    switch (pilihanAdmin) {
                        case 1:
                            tc.tambahBensin(); 
                            break;

                        case 2:
                            tc.tampilDaftarBensin(); 
                            break;

                        case 3:
                            tc.laporanPenjualan();
                            break;

                        case 4:
                            programAdmin = false;
                            break;

                        default:
                            System.out.println("\nError, input dengan benar !");
                            break;
                    }
                }
            } else if (terpilih == 2) {
                programAdmin = true;
                tc.dataPembeli();
                while (programPembeli) {
                    tc.tampilanPembeli();
                    int pilihanPembeli = sc.nextInt();
                    switch (pilihanPembeli) {
                        case 1:
                            tc.isibensin();
                            break;
                        case 2:
                            programPembeli = tc.checkout(programPembeli);
                            break;
                        case 3:
                            System.out.println("Terima kasih sudah isi bensin! !");
                            programPembeli = false;
                            break;

                        default:
                            System.out.println("Error, Coba input dengan benar !");
                            break;
                    }
                }
            } else {
                System.out.println("\nTerima kasih sudah menggunakan program ini !");
                System.out.println("- Kelompok Ratu Syukur Yulia");
                program = false;
            }
        }
    }
}
