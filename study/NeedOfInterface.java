package study;

interface Computer {
    public void code();    
}
class laptop implements Computer{
    public void code(){
        System.out.println("Coding on laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Coding on Desktop");
    }
}

class Devloper{
    public void devWorking(Computer obj){
        obj.code();
    }
}
public class NeedOfInterface {
    public static void main(String[] args) {
        Computer lap = new laptop();
        Computer desk = new Desktop();

        Devloper dev = new Devloper();
        dev.devWorking(lap);
        dev.devWorking(desk);
    }
}
