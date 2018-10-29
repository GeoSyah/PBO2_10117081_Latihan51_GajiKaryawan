/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan51_gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan Gaji Karyawan Tergantung dari Golongan,
 *          Jabatan dan Kehadiran
 */
public class PBO2_10117081_Latihan51_GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner baca = new Scanner(System.in);
        Manager mngr1 = new Manager();
        System.out.println("=== Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan Nik : ");
        mngr1.setNik(baca.nextLine());
        System.out.print("Masukkan Nama : ");
        mngr1.setNama(baca.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        mngr1.setGolongan(baca.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mngr1.setJabatan(baca.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mngr1.setKehadiran(baca.nextInt());
        System.out.println("");

        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK : " + mngr1.getNik());
        System.out.println("Nama : " + mngr1.getNama());
        System.out.println("Golongan : " + mngr1.getGolongan());
        System.out.println("Jabatan : " + mngr1.getJabatan());
        System.out.println("");

        System.out.println("TUNJANGAN GOLONGAN : " + mngr1.tunjanganGolongan
                           (mngr1.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : " + mngr1.tunjanganJabatan
                           (mngr1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " + mngr1.tunjanganKehadiran
                           (mngr1.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL " + mngr1.totalGaji());

    }
    
}
