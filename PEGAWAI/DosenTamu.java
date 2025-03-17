/* Nama File    : DosenTamu.java
* Deskripsi    : class DosenTamu yang merupakan turunan dari Dosen
* Pembuat      : M. Daffa' Atstsaqif/24060123120039
* Tanggal      : 16 Maret 2025
*/

package PEGAWAI;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DosenTamu extends Dosen {
    private LocalDate tanggalAkhirKontrak;
    private int tunjangan;
    private String NIDK;
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("d MMM yyyy");

    public DosenTamu() {
        super();
        this.tanggalAkhirKontrak = LocalDate.now();
        this.tunjangan = 0;
        this.NIDK = " ";
    }

    public DosenTamu(String NIP, String NIDK, String NAMA, String tanggalLahir, String TMT, int GajiPokok, String fakultas, String tanggalAkhirKontrak) {
        super(NIP, NAMA, tanggalLahir, TMT, GajiPokok, fakultas);
        this.tanggalAkhirKontrak = LocalDate.parse(tanggalAkhirKontrak, DATE_FORMAT);
        int masaKontrak = this.tanggalAkhirKontrak.getYear() - LocalDate.now().getYear();
        this.tunjangan = (int) (0.025 * masaKontrak * GajiPokok);
        this.NIDK = NIDK;
    }

    public LocalDate getTanggalAkhirKontrak() {
        return tanggalAkhirKontrak;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTanggalAkhirKontrak(String TAK){
    this.tanggalAkhirKontrak = LocalDate.parse(TAK, DATE_FORMAT);
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
        System.out.println("NIDK         : " + this.NIDK);
        System.out.println("Jabatan      : Dosen tamu");
        System.out.println("Masa Kerja   : " + tahunKerja + " tahun " + bulanKerja + " bulan");
        System.out.println("Akhir Kontrak: " + tanggalAkhirKontrak);
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("==================================");
    }
}
