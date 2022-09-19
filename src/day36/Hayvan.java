package day36;

public class Hayvan {
    public String isim;
    public int yas;
    public double agırlık;


    public Hayvan() {
    }

    public Hayvan(String isim, int yas, double agırlık) {
        this.isim = isim;
        this.setYas(yas);
        this.setAgırlık(agırlık);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        if(yas>0)
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
        if(agırlık>0)
        this.agırlık = agırlık;
    }

    public void sesVer(){
        System.out.println("hayvan ses veriyor");

    }
    public void beslen(){
        System.out.println("hayvan besleniyor");
    }
}
