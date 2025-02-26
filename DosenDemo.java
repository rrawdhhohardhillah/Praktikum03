import java.util.*;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Dosen> daftarDosen = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kode = scanner.next();
            System.out.print("Nama: ");
            String nama = scanner.next();
            scanner.nextLine(); // Menyerap newline agar tidak terbaca oleh nextLine()

            String jenisKelamin;
            while (true) {
                System.out.print("Jenis Kelamin (L/W): ");
                jenisKelamin = scanner.nextLine().toUpperCase();
                if (jenisKelamin.equals("L") || jenisKelamin.equals("W")) {
                    break;
                }
                System.out.println("Input salah! Masukkan L untuk Laki-laki atau W untuk Wanita.");
            }

            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            System.out.println("---------------------------");

            daftarDosen.add(new Dosen(kode, nama, jenisKelamin, usia));
        }

        scanner.close();

        System.out.println("Data Semua Dosen:");
        DataDosen.dataSemuaDosen(daftarDosen.toArray(new Dosen[0])); // Konversi ke array

        System.out.println("Jumlah Dosen Berdasarkan Jenis Kelamin:");
        DataDosen.jumlahDosenPerJenisKelamin(daftarDosen.toArray(new Dosen[0]));

        System.out.println("Rata-rata Usia Dosen Berdasarkan Jenis Kelamin:");
        DataDosen.rerataUsiaDosenPerJenisKelamin(daftarDosen.toArray(new Dosen[0]));

        System.out.println("Dosen Paling Tua:");
        DataDosen.infoDosenPalingTua(daftarDosen.toArray(new Dosen[0]));

        System.out.println("Dosen Paling Muda:");
        DataDosen.infoDosenPalingMuda(daftarDosen.toArray(new Dosen[0]));
    }
}
