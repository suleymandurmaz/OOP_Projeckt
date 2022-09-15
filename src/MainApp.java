public class MainApp {
    public static void main(String[] args) {

        LazerYazıcı yazıcı=new LazerYazıcı(100,500,
                true);
        /*System.out.println(yazıcı.tonerEkle(20));
        System.out.println(yazıcı.tonerEkle(35));
        System.out.println(yazıcı.tonerEkle(100));*/
        System.out.println(yazıcı.kagıtYukle(400));
        System.out.println(yazıcı.yazdır(-11));
    }
}
