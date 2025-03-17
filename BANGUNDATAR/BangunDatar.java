public class BangunDatar{
    private int jmlsisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlsisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }
    public int getJmlSisi(){
        return jmlsisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlsisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("jumlah sisi : " + jmlsisi);
        System.out.println("warna : " + warna);
        System.out.println("Border : " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("jumlah objek bangun datar : " + counterBangunDatar);
    }
}


//JAWABAN
/*Tidak bisa karena pada class BangunDatar, Atribut atributnya bersifat private, 
  Jadi tidak bisa diakses secara langsung. Jika ingin mengaksesnya harus menggunakan konstruktor super() */
