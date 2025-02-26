import java.util.Scanner;

public class MatakuliahDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mata kuliah yang akan diinput: ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();

        Matakuliah16[] arrayOfMatakuliah = new Matakuliah16[jmlMatkul];

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            System.out.print("Kode           : ");
            String kode = sc.nextLine();
            System.out.print("Nama           : ");
            String nama = sc.nextLine();
            System.out.print("SKS            : ");
            int sks = sc.nextInt();
            sc.nextLine();
            System.out.print("Jumlah jam     : ");
            int jumlahJam = sc.nextInt();
            sc.nextLine();

            arrayOfMatakuliah[i] = new Matakuliah16(kode, nama, sks, jumlahJam);

            System.out.println("-----------------------------------------------");
        }

        sc.close();
    }
}
