package study;

// every class extends Object class impicitly
class Laptop1{
    String name;
    int prize;

    @Override
    public String toString(){   // now if we print the obj then it will call this method
        return "Hello";
    }

    // public boolean equals(Laptop1 objTemp){      // overriding the method
    //     return (this.name.equals(objTemp.name) && this.prize == objTemp.prize);
    // }
    /*Don't need to explicitly do this we can just right click then select 'source action' and
    select 'genrate hashcode() and equals()' */ 

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + prize;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop1 other = (Laptop1) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (prize != other.prize)
            return false;
        return true;
    }

}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop1 obj = new Laptop1();
        obj.name = "Lenovo";
        obj.prize = 200;

        System.out.println(obj);    // will print hash code of the object 
        // every time we print the object it will call the toString() method

        Laptop1 obj2 = new Laptop1();
        obj2.name = "Lenovo";
        obj2.prize = 200;

        // boolean result = obj == obj2;    // return false cause comparing with hash values
        boolean result = obj.equals(obj2);    // initialy return false cause comparing with hash values
        //but after overriding th method it will return true

        System.out.println(result);
    }
}
