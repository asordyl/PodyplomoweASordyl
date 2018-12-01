public class IncDec {
    public static void main(String[] args){
        int x = 42;
        int y,z;

        y = x++;
        System.out.println("y = " + y);
        z = --x;
        System.out.println("z = " + z);
    }
}
