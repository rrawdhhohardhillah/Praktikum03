import java.util.*;

class DataDosen {
    public static void dataSemuaDosen(Dosen[] arrayOfDosen) {
        for (Dosen d : arrayOfDosen) {
            System.out.println("Kode: " + d.kode);
            System.out.println("Nama: " + d.nama);
            System.out.println("Jenis Kelamin: " + d.jenisKelamin);
            System.out.println("Usia: " + d.usia);
            System.out.println("---------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen d : arrayOfDosen) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " + pria);
        System.out.println("Jumlah Dosen Wanita: " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;
        for (Dosen d : arrayOfDosen) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalPria += d.usia;
                countPria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totalWanita += d.usia;
                countWanita++;
            }
        }
        System.out.println("Rata-rata usia Dosen Pria: " + (countPria == 0 ? 0 : (double) totalPria / countPria));
        System.out.println("Rata-rata usia Dosen Wanita: " + (countWanita == 0 ? 0 : (double) totalWanita / countWanita));
    }

    public static void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        Dosen tertua = Arrays.stream(arrayOfDosen).max(Comparator.comparingInt(d -> d.usia)).orElse(null);
        if (tertua != null) {
            System.out.println("Dosen Paling Tua:");
            System.out.println("Nama: " + tertua.nama + ", Usia: " + tertua.usia);
        }
    }

    public static void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        Dosen termuda = Arrays.stream(arrayOfDosen).min(Comparator.comparingInt(d -> d.usia)).orElse(null);
        if (termuda != null) {
            System.out.println("Dosen Paling Muda:");
            System.out.println("Nama: " + termuda.nama + ", Usia: " + termuda.usia);
        }
    }
}
