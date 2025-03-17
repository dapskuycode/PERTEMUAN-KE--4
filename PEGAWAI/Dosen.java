/* Nama File    : Dosen.java
 * Deskripsi    : class abstrak Dosen yang merupakan turunan dari Pegawai
 * Pembuat      : M. Daffa' Atstsaqif/24060123120039
 * Tanggal      : 16 Maret 2025
 */

 package PEGAWAI;

 public class Dosen extends Pegawai {
     public String fakultas;
     
     public Dosen() {
         super();
         this.fakultas = "";
     }
 
     public Dosen(String NIP, String NAMA, String tanggalLahir, String TMT, int GajiPokok, String fakultas) {
         super(NIP, NAMA, tanggalLahir, TMT, GajiPokok);
         this.fakultas = fakultas;
     }
 
     public String getFakultas() {
         return fakultas;
     }
 
     public void setFakultas(String fakultas) {
         this.fakultas = fakultas;
     }
 
     @Override
     public void printInfo() {
         super.printInfo();
         System.out.println("Fakultas     : " + fakultas);
     }
 }
 
