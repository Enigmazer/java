package study.Oops;

class A{
    private int a = 20;  // Encapsulated field

    // Public getter method for 'a'
    public int getA() {
        return a;
    }

    // Public setter method for 'a'
    public void setA(int a) {
        this.a = a;
    }

    public void add(int b){
        System.out.println(a + b);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        A objA = new A();
        objA.setA(30); // Setting value using setter
        objA.add(20);
    }
}
