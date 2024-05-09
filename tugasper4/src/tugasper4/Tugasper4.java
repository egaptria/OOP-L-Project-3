/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasper4;

import java.util.Scanner;

/**
 *
 * @author Agus Ega
 */
public class Tugasper4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        crud crd = new crud();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Teman");
            System.out.println("2. Lihat Data Teman");
            System.out.println("3. Edit Data Teman");
            System.out.println("4. Hapus Data Teman");
            System.out.println("0. Keluar");

            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    crd.Storedata();
                    break;
                case 2:
                    crd.Viewdata();
                    break;
                case 3:
                    System.out.print("Masukkan nomor teman yang ingin diubah: ");
                    int idxUpdate = input.nextInt();
                    crd.Update(idxUpdate - 1);
                    break;
                case 4:
                    System.out.print("Masukkan nomor teman yang ingin dihapus: ");
                    int idxDelete = input.nextInt();
                    crd.Destroy(idxDelete - 1);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Pilih nomor yang tertera pada menu.");
            }
        }
    }
    
}
