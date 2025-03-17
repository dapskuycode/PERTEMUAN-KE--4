/* Nama File    : Pegawai.java
 * Deskripsi    : class parent pegawai yang mencakup informasi informasi umum pegawai
 * Pembuat      : M. Daffa' Atstsaqif/24060123120039
 * Tanggal      : 16 Maret 2025
 */


package PEGAWAI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    public String NIP;
    public String NAMA;
    public LocalDate TanggalLahir;
    public LocalDate TMT;
    public int GajiPokok;
    
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("d MMM yyyy");

    public Pegawai() {
        this.NIP = "";
        this.NAMA = "";
        this.TanggalLahir = LocalDate.now(); 
        this.TMT = LocalDate.now();
        this.GajiPokok = 0;
    }

    public Pegawai(String NIP, String NAMA, String tanggalLahir, String TMT, int GajiPokok) {
        this.NIP = NIP;
        this.NAMA = NAMA;
        this.TanggalLahir = LocalDate.parse(tanggalLahir, DATE_FORMAT);
        this.TMT = LocalDate.parse(TMT, DATE_FORMAT);
        this.GajiPokok = GajiPokok;
    }


    public String getNip(){
        return this.NIP;
    }

    public String getNama(){
        return this.NAMA;
    }
    public LocalDate getTanggalLahir(){
        return this.TanggalLahir;
    }
    public LocalDate getTMT(){
        return this.TMT;
    }
    public int getGajiPokok(){
        return this.GajiPokok;
    }
    
    public void setNip(String nip){
        this.NIP = nip;
    }

    public void setNama(String nama){
        this.NAMA = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir){
        this.TanggalLahir = tanggalLahir;
    }

    public void setTMT(LocalDate tmt){
        this.TMT = tmt;
    }

    public void setGajiPokok(int gp){
        this.GajiPokok = gp;
    }

    public void printInfo() {
        System.out.println("NIP          : " + NIP);
        System.out.println("Nama         : " + NAMA);
        System.out.println("Tanggal Lahir: " + getTanggalLahir());
        System.out.println("TMT          : " + getTMT());
        System.out.println("Gaji Pokok   : Rp " + GajiPokok);
    }
}
