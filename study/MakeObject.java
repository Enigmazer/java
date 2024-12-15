package study;

class University{
    public void uName(){
        System.out.println("University - MU");
    }
}
class Department extends University{
    public void dName(){
        System.out.println("Department - CSA");
    }
}
class Faculty extends Department{
    public void fName(){
        System.out.println("Faculty - Ashish kumar anand");
    }
}
public class MakeObject {
    public static void main(String[] args) {
        Faculty obj = new Faculty();
        obj.uName();
        obj.dName();
        obj.fName();
    }
}
