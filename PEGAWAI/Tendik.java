/* Nama File    : Tendik.java
* Deskripsi    : class Tendik yang merupakan turunan dari Pegawai
* Pembuat      : M. Daffa' Atstsaqif/24060123120039
* Tanggal      : 16 Maret 2025
*/

package PEGAWAI;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Tendik extends Pegawai {
    private String bidang;
    private LocalDate BUP;
    private int tunjangan;
    private static final int BATAS_USIA_PENSIUN = 55;
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("d MMM yyyy");

    public Tendik() {
        super();
        this.bidang = "";
        this.BUP = LocalDate.now();
        this.tunjangan = 0;
    }

    public Tendik(String NIP, String NAMA, String tanggalLahir, String TMT, int GajiPokok, String bidang) {
        super(NIP, NAMA, tanggalLahir, TMT, GajiPokok);
        this.bidang = bidang;
        this.BUP = LocalDate.parse(tanggalLahir, DATE_FORMAT).plusYears(BATAS_USIA_PENSIUN);
        int masaKerja = LocalDate.now().getYear() - LocalDate.parse(TMT, DATE_FORMAT).getYear();
        this.tunjangan = (int) (0.01 * masaKerja * GajiPokok);
    }

    public String getBidang() {
        return bidang;
    }

    public LocalDate getBUP() {
        return BUP;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setBidang(String bidang){
    this.bidang = bidang;
    }

    public void setBUP(String Bup){
    this.BUP = LocalDate.parse(Bup, DATE_FORMAT);
    }

    public void setTunjangan(int tunjangan){
    this.tunjangan = tunjangan;
    }

    @Override
    public void printInfo() {
        LocalDate sekarang = LocalDate.now();
        Period masaKerja = Period.between(getTMT(), sekarang);
        int tahunKerja = masaKerja.getYears();
        int bulanKerja = masaKerja.getMonths();

        super.printInfo();
        System.out.println("Bidang       : " + bidang);
        System.out.println("Masa Kerja   : " + tahunKerja + " tahun " + bulanKerja + " bulan");
        System.out.println("BUP          : " + BUP);
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("==================================");
    }
}
