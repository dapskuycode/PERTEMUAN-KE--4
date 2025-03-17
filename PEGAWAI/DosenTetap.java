/* Nama File    : DosenTetap.java
 * Deskripsi    : class DosenTetap yang merupakan turunan dari Dosen
 * Pembuat      : M. Daffa' Atstsaqif/24060123120039
 * Tanggal      : 16 Maret 2025
 */

package PEGAWAI;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DosenTetap extends Dosen {
    private LocalDate BUP;
    private int tunjangan;
    private String NIDN;
    private static final int BATAS_USIA_PENSIUN = 65;
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("d MMM yyyy");

    public DosenTetap() {
        super();
        this.BUP = LocalDate.now();
        this.tunjangan = 0;
    }

    public DosenTetap(String NIP, String NIDN, String NAMA, String tanggalLahir, String TMT, int GajiPokok, String fakultas) {
        super(NIP, NAMA, tanggalLahir, TMT, GajiPokok, fakultas);
        this.BUP = LocalDate.parse(tanggalLahir, DATE_FORMAT).plusYears(BATAS_USIA_PENSIUN);
        int masaKerja = LocalDate.now().getYear() - LocalDate.parse(TMT, DATE_FORMAT).getYear();
        this.tunjangan = (int) (0.02 * masaKerja * GajiPokok);
        this.NIDN = NIDN;
    }

    public LocalDate getBUP() {
        return BUP;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setBUP(String BUP){
        this.BUP = LocalDate.parse(BUP, DATE_FORMAT);
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
        System.out.println("NIDN         : " + this.NIDN);
        System.out.println("Jabatan      : Dosen tetap");
        System.out.println("Masa Kerja   : " + tahunKerja + " tahun " + bulanKerja + " bulan");
        System.out.println("BUP          : " + BUP);
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("==================================");
    }
}
