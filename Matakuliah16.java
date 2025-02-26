

public class Matakuliah16 {
    
    public String kode, nama;
    public int sks, jumlahJam;

    public Matakuliah16(){  

    }    

    public Matakuliah16 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        System.out.println("------------------------");
        System.out.println("Tambah Data Mata Kuliah");
        System.out.println("------------------------");
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void cetakinfo(){
        System.out.println("Kode        : " + this.kode);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Sks         : " + this.sks);
        System.out.println("Jumlah Jam  : " + this.jumlahJam);
        System.out.println("------------------------------------");
    }



}


