public class Program {
    public static void main(String[] args) {
        /*
        public
        protected:aynı paketten ve kendisini alt sınıflarından
        private:sadece kendi sınıfından ulasılır
        default:aynı paket içinden
         */

        //encapsulation: kodlarımızı verilerimizi
        // kontrol altına almak için
        Kitap kitap1=new Kitap("kasagı","ömer seyfettin",-300
        );
        kitap1.setIsim("kasagı");
        kitap1.yazar="ömer seyfettin" ;
        kitap1.getSayfaAdedi();
         // kitap1.sayfaAdedi=-300;
        System.out.println(kitap1.getSayfaAdedi());
        System.out.println(kitap1.getIsim());
    }
}
