package day37;

public class Hayvan {
    private String isim;
    private int yas;
    private double agırlık;

    public Hayvan(String isim, int yas, double agırlık) {
        this.isim = isim;
        this.yas = yas;
        this.agırlık = agırlık;

    }

    public Hayvan() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getAgırlık() {
        return agırlık;
    }

    public void setAgırlık(double agırlık) {
        this.agırlık = agırlık;
    }
    public void uyu(){
        System.out.println("hayvan uyuyor");

    }
    public void beslen(){
        System.out.println("hayvan besleniyor");
    }
    public void hareketEt(){
        System.out.println("hayvan hareket ediyor");
    }
}
