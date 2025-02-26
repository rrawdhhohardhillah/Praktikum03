
import java.util.Scanner;

public class MatakuliahDemo16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();
        Matakuliah16[] arrayOfMataKuliah = new Matakuliah16[3];

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("\nMasukkan Data Mata Kuliah ke-" + (i + 1));

            System.out.println("Kode           : ");
            String kode = sc.nextLine();

            System.out.println("Nama           : ");
            String nama = sc.nextLine();

            System.out.println("SKS            : ");
            int sks = sc.nextInt();

            System.out.println("Jumlah Jam     : ");
            int jumlahJam = sc.nextInt();
            sc.nextLine();

            arrayOfMataKuliah[i] = new Matakuliah16(kode, nama, sks, jumlahJam);
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            arrayOfMataKuliah[i].cetakinfo();
        }

        sc.close();
    }
}
