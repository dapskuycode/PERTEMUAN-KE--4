/* Nama File    : Main.java
* Deskripsi    : Program utama untuk menguji class Pegawai, Dosen, DosenTetap, DosenTamu, dan Tendik
* Pembuat      : M. Daffa' Atstsaqif/24060123120039
* Tanggal      : 16 Maret 2025
*/

package PEGAWAI;

public class Main {
    public static void main(String[] args) {
        // Membuat objek DosenTetap
        DosenTetap dosenTetap1 = new DosenTetap("345678", "9248923", "Pak Dosen X", "20 Jul 1970", "1 Aug 1995", 9000000, "Fakultas Sains Dan Matematika");
        System.out.println("=== Data Dosen Tetap ===");
        dosenTetap1.printInfo();

        // Membuat objek DosenTamu
        DosenTamu dosenTamu1 = new DosenTamu("456789", "293743892",  "Pak Dosen Y", "15 Oct 1985", "1 Feb 2010", 5000000, "Fakultas Ekonomi", "20 May 2030");
        System.out.println("=== Data Dosen Tamu ===");
        dosenTamu1.printInfo();

        // Membuat objek Tendik
        Tendik tendik1 = new Tendik("567890", "Bu Tendik Z", "30 Mar 1990", "1 Dec 2012", 4000000, "Administrasi Akademik");
        System.out.println("=== Data Tendik ===");
        tendik1.printInfo();
    }
}
