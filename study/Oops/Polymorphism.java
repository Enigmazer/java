package study.Oops;

class ap{
    public void a1(int a,char b){
        System.out.println("A1");
    }
    public void a1(int a,float b){
        System.out.println("A1 second");
    }
    public void ovrm(int a,int m,char c){
        System.out.println("class A "+a);
        System.out.println("multi = "+a*m);
    }
}

class bp extends ap{
    public void overm(int a,int n, char d){
        System.out.println("Class B "+a);
        a = a+n;
        System.out.println("addi = "+a);
    }
}
class cp extends bp{
    cp(){
        System.out.println("Constructor of class c");
    }
    cp(int a){
        System.out.println("a = "+a);
    }
    cp(int a,int b){
        a=a+b;
        System.out.println("Add = "+a);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        ap obja = new ap();
        obja.a1(0, 1f);
        obja.a1(0, 'a');
        obja.ovrm(8,8,'m');
        bp objb = new bp();
        objb.overm(8,8,'v');
        cp objc = new cp();
        cp objc1 = new cp(3);
        cp objc2 = new cp(3,4);

    }
}
