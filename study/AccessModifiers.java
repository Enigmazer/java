package study;

import study.Oops.test;
class AA extends test{
    private int a=20;
    public void methA(int b){
        System.out.println("A = "+a*b);
    }
    protected void methAPro(int bPro){
        bPro = a-bPro;
        System.out.println("A = "+bPro);
    }
    void methDef(int bDef){
        bDef = a+bDef;
        System.out.println("A = "+bDef);
    }
    public void callMethOPro() {
        methOPro(); // now accessible since AA extends test
    }
    
}
public class AccessModifiers{
    public static void main(String[] args) {
        AA objAA = new AA();
        objAA.methA(5);
        objAA.methAPro(5);
        objAA.methDef(5);
        // AccessModifiers obj = new AccessModifiers();
        // obj.methOPro();
        objAA.callMethOPro(); // now accessible since it is public
        
    }
}
