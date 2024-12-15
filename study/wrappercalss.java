package study;
    //each 8 primetive datatype have there one wrapper class (for ex. int have a wrapper class named Integer os followed float have Float)
public class wrappercalss {
    public static void main(String[] args) {
      //class  obj = value
        Integer a = 5; // autoboxing
        Integer b = 10; // autoboxing

        int sum = a+b; // unboxing happens here
        Integer result = a*b; // autoboxing after multiplication

        System.out.println(sum);
        System.out.println(result);

    }
}
