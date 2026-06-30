class Karyawan {
    String nama;
    int umur;

    public Karyawan(String namaAwal, int umurAwal) {
        this.nama = namaAwal;
        this.umur = umurAwal;
    }

    public void tampilkanProfil() {
        System.out.println("Nama: " + this.nama + ", Umur: " + this.umur + " tahun");
    }

    public int dapatkanTahunLahir(int tahunSekarang) {
        int tahunLahir = tahunSekarang - this.umur;
        return tahunLahir;
    }

    public void ubahNama(String namaBaru) {
        this.nama = namaBaru;
    }
}

public class ACT6 {

    public static void cekKelayakanKerja(int usia) {
        if (usia >= 17) {
            System.out.println("Status: Layak Bekerja.");
        } else {
            System.out.println("Status: Belum Layak Bekerja.");
        }
    }

    public static void ujiPassByValue(int angka) {
        angka = 99;
    }

    public static void ujiPassByReference(Karyawan karyawanObj) {
        karyawanObj.umur = 25;
    }

    public static void main(String[] args) {
        System.out.println("=== METHOD KELAS (STATIC) ===");
        ACT6.cekKelayakanKerja(21);

        System.out.println("\n=== INSTANSIASI KELAS & OBJEK ===");
        Karyawan staff = new Karyawan("Mychele", 21);
        staff.tampilkanProfil();

        System.out.println("\n=== METHOD DENGAN PARAMETER & RETURN VALUE ===");
        staff.ubahNama("Mychele Ponamon");
        int tahunLahirStaff = staff.dapatkanTahunLahir(2026);
        System.out.println("Nama Baru: " + staff.nama);
        System.out.println("Tahun Lahir: " + tahunLahirStaff);

        System.out.println("\n=== PASS-BY-VALUE ===");
        int nilaiPrimitif = 10;
        System.out.println("Nilai awal sebelum method: " + nilaiPrimitif);
        ujiPassByValue(nilaiPrimitif);
        System.out.println("Nilai setelah method: " + nilaiPrimitif);

        System.out.println("\n=== PASS-BY-REFERENCE ===");
        System.out.println("Umur awal staff sebelum method: " + staff.umur);
        ujiPassByReference(staff);
        System.out.println("Umur staff setelah method: " + staff.umur);

        System.out.println("\n=== OPERATOR INSTANCEOF ===");
        boolean isKaryawan = staff instanceof Karyawan;
        System.out.println("Apakah variabel 'staff' instansi dari kelas Karyawan? " + isKaryawan);
    }
}