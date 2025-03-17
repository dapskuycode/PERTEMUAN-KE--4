public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jariJari = diameter/2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(1);
    }

    public double getJari(){
        return this.jariJari;
    }

    public void setJari(double jari){
        this.jariJari = jari;
    }

    public double getLuas(){
        return this.jariJari*this.jariJari*Math.PI;
    }

    public double getKeliling(){
        return Math.PI*jariJari;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("jari-jari: " + jariJari);
    }
}
