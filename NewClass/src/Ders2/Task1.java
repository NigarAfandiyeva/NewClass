package Ders2;

public class Task1 {

    byte b = 32;
    short sh = 235;
    int i = 56;
    long l = 890;
    float f = 4.5f;
    double d = 237.45;
    char c = 'a';
    boolean bool = true;

    public static void main(String[] args) {
        Task1 t = new Task1();
        System.out.println(t.b + t.i);
        System.out.println(t.f - t.d);
        System.out.println((double) (t.f * t.i));
        System.out.println((double) t.l / t.sh);

    }
}
