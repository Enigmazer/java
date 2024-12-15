package study.Oops;
//open practset 10 for more
class A1{
    int a=10;
}
class B extends A1{
    int b=10;
}
class C extends B{
    int c=10;
    public void cMeth(){
    System.out.println(a+b+c);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        C objc = new C();
        objc.a=30;
        objc.cMeth();
    }
}
