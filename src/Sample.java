import java.text.DecimalFormat;

public class Sample {

    int c;
    static final double PI = 3.141592;

    public static void main(String[] args){
        int x = 5;
        x += 5;
        int y = 3;

    }

    public static void mainSecond(String[] args){
        int a;
        a = 2;

        int b = 3;
        String nazwa = "";
        System.out.println(nazwa);

        Sample sample = new Sample();

        System.out.println(sample.c);

        String name = "Arek", surname = "Sordyl";

        float f = 1.4F;
        double d = 2345.677545556;
        char e = 't';

        final String user;
        user = "Arek";

        System.out.println(PI);

        //literał
        long x = 500_000;  //500000
        double y = 12e21;
        double z = 19E-95;

        DecimalFormat df = new DecimalFormat("#.####################");

        System.out.println(z);
    }
}
