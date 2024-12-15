package study;

abstract class NA{
    public static int a = 10;
    final int b = 20;

    abstract public void meth();
}
class NB extends NA{
    public void meth(){
        System.out.println(a+b);
    }

}
public class NonAccessModifiers {
    public static void main(String[] args) {
        NA.a=20;
        NB objb = new NB();
        objb.meth();
    }
}
