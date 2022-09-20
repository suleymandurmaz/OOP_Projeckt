package day37;

public class Main {
    public static void main(String[] args) {
/*        Hayvan hayvan=new Hayvan("hayvan",5,12);
        hayvan.beslen();
        Aslan aslan=new Aslan();
        aslan.avlan();
        Kaplan kaplan=new Kaplan();
        Balina balina=new Balina();
        balina.yuz();

        Yuzucu yuzucu=new Balina();
        Yuzucu yuzucu1=new Kaplan();*/
        Yuzucu[]yuzuculer=new Yuzucu[3];
        yuzuculer[0]=new Balina();
        yuzuculer[1]=new Kaplan();
        yuzuculer[2]=new Balina();
    }
}
        //soyut sınıflsr:ornekleri olusturulamaz.
        //Kalıtım yoluyla extend alt  sınıflar olusturulabilir.
        //içerisinde gövdeli govdesiz metotlar bulunabilir.
        //gövdesiz metotlar alt sınıflara  ne yapması  gerektiğini söyler fakat nasıl yapacagını söylemez.
        /*
        interface:Çok biçimliliği saglamak için kullanılan sınıf benzeri yapılardır.
        bütün metotları abstraktır.Kendisini implemente edecek sınıflara
        ne yapacaklarını söyler fakat nasıl yapılacagını söylemez.
         */


