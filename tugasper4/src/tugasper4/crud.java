/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasper4;

import java.util.Scanner;

/**
 *
 * @author Agus Ega
 */
public class crud {
    private static int length;
    private int brs = 10;
    private int klm = 3;
    private int raktif = 0;
    private String[][] BT = new String[brs][klm];
    
    Scanner dtIN = new Scanner(System.in);
    
    public void Storedata(){
        int idx = 0;
        raktif++;
        if(raktif > brs){
            System.out.println("Data Sudah Penuh");
            return;
        }
        if(raktif > 0){
            idx=raktif-1;    
        }
        System.out.println("Menambahkan Nama Teman");
        System.out.println("#======================#");
        System.out.print("Nama Teman : ");
        BT[idx][0] = dtIN.nextLine();
        
        System.out.print("Alamat     : ");
        BT[idx][1] = dtIN.nextLine();
        
        System.out.print("No Telp    : ");
        BT[idx][2] = dtIN.nextLine();
        
    }
    
    public void Update(int idx){
        if(idx >= raktif || idx < 0){
            System.out.println("Indeks tidak valid");
            return;
        }

        System.out.println("Mengubah Data Teman");
        System.out.println("#======================#");
        System.out.print("Nama Teman : ");
        BT[idx][0] = dtIN.nextLine();

        System.out.print("Alamat     : ");
        BT[idx][1] = dtIN.nextLine();

        System.out.print("No Telp    : ");
        BT[idx][2] = dtIN.nextLine();
    }

    public void Destroy(int idx){
        if(idx >= raktif || idx < 0){
            System.out.println("Indeks tidak valid");
            return;
        }

        for(int i = idx; i < raktif - 1; i++){
            BT[i][0] = BT[i + 1][0];
            BT[i][1] = BT[i + 1][1];
            BT[i][2] = BT[i + 1][2];
        }
        raktif--;
        System.out.println("Data Teman berhasil dihapus.");
    }

    public void Viewdata(){
        System.out.println("Data Teman");
        System.out.println("---------->");
        int no = 0;
        for(int i=0; i<raktif; i++){
            no++;
            System.out.println(no+". Nama : "+BT[i][0]);
            System.out.println("   Alamat  : "+BT[i][1]);
            System.out.println("   No Telp : "+BT[i][2]);
        }
    }
}
