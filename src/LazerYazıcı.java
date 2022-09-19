public class LazerYazıcı {
    private final int MAX_TONER_SEVIYESI = 100;
    private final int MAX_KAGIT_MIKTARI = 500;
    private int tonerSeviyesi;
    private int kagıtAdedi;
    private boolean ciftYonlu;

    public LazerYazıcı(int tonerSeviyesi, int kagıtAdedi, boolean ciftYonlu) {
        tonerEkle(tonerSeviyesi);
        this.kagıtAdedi = kagıtAdedi;
        this.ciftYonlu = ciftYonlu;
    }

    public int tonerEkle(int miktar) {
        if (miktar > 0 && miktar <= MAX_TONER_SEVIYESI && tonerSeviyesi + miktar <= MAX_TONER_SEVIYESI) {
            tonerSeviyesi += miktar;
        } else if (tonerSeviyesi + miktar > MAX_TONER_SEVIYESI) {
            tonerSeviyesi = MAX_TONER_SEVIYESI;
        }
        return tonerSeviyesi;
    }

    public int kagıtYukle(int miktar) {
        if (miktar > 0 && kagıtAdedi + miktar <= MAX_KAGIT_MIKTARI) {
            kagıtAdedi += miktar;
        } else if (kagıtAdedi + miktar > MAX_KAGIT_MIKTARI) {
            kagıtAdedi = MAX_KAGIT_MIKTARI;
        }
        return kagıtAdedi;
    }

    public int yazdır(int sayfaadedi) {
        if (sayfaadedi < 0) return 0;
        return ciftYonlu ? sayfaadedi / 2 + sayfaadedi % 2 : sayfaadedi;
    }
}
