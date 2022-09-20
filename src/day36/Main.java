package day36;

public class Main {
    public static void main(String[] args) {
        Hayvan hayvan1 = new Hayvan();
        hayvan1.setIsim("hayvan 1");
        hayvan1.setYas(3);
        hayvan1.setAgırlık(50);
        Hayvan hayvan2 = new Hayvan("hayvan 2", 10, 3.5);
        hayvan1.sesVer();
        hayvan1.beslen();
        Hayvan hy=new Hayvan();
        Object obj=new Hayvan();
        Hayvan hy2=(Hayvan) obj;
        hy2.sesVer();
        hy2.beslen();



        Kedi kedi1=new Kedi();
        kedi1.yumaklaOyna();
        kedi1.beslen();
        Hayvan hayvan=new Kedi();

        Kedi k2=((Kedi)hayvan);
        kedi1.sesVer();
        Object obj4=new Kedi();

        Hayvan hayvan5=((Hayvan) obj4);
        Kedi k1=(Kedi) obj4;



        if(hayvan1.equals(hayvan2))
            System.out.println("iki hayvan aynı");
        else
            System.out.println("iki hayvan farklı");

        hayvan2.beslen();
        hayvan2.sesVer();
        System.out.println(hayvan2);
        System.out.println(hayvan1);




    }
}