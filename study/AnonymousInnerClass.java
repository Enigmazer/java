package study;

class AAIC{
    public void show(){
        System.out.println("In AAIC show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AAIC obj = new AAIC(){
            public void show(){
                System.out.println("In AAIC show");
            }
        };
        obj.show(); 
    }
}
