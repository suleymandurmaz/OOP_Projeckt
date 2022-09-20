package day36;

public class Hayvan {
    private String isim;
    private int yas;
    private double agırlık;

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
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas > 0)
            this.yas = yas;
    }

    public double getAgırlık() {
        return agırlık;
    }

    public void setAgırlık(double agırlık) {
        if (agırlık > 0)
            this.agırlık = agırlık;
    }

    public void sesVer() {
        System.out.println(getIsim() + "hayvan ses veriyor");

    }

    public void beslen() {
        System.out.println(getIsim() + "hayvan besleniyor");



    }
    @Override
    public boolean equals(Object obj) {
        Hayvan hayvan=(Hayvan) obj;
        boolean result = this.getIsim().equals(hayvan.getIsim());
        result &= this.getYas() == hayvan.getYas();
        result &= this.getAgırlık() == hayvan.getAgırlık();
        return result;
    }
    @Override
    public String toString() {
        return String.format("%s-%d-%5.2f", isim, yas, agırlık);
    }


    }

