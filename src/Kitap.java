public class Kitap {
    private String adSoyad;
    public String yazar;
    private int sayfaAdedi;

    public Kitap(String adSoyad, String yazar, int sayfaAdedi) {
        this.adSoyad = adSoyad;
        this.yazar = yazar;
        this.sayfaAdedi = sayfaAdedi;
    }

    public String getIsim() {
        return adSoyad;
    }

    public void setIsim(String isim) {
        this.adSoyad= isim;
    }

    public int getSayfaAdedi() {
        return sayfaAdedi;
    }

    public void setSayfaAdedi(int sayfaAdedi) {
        if (sayfaAdedi > 0) {
            this.sayfaAdedi = sayfaAdedi;
        }

    }
}
