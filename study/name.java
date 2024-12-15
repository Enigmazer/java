package study;
import java.util.*;
public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name = ");
        String vowels = "";
        String cons = "";
        String name = sc.nextLine();
        name = name.toLowerCase();
        // System.out.println("Output :-");
        
        System.out.println("Vowels:- ");
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels += ch+" ";
            }else{
                cons += ch+" ";
            }
        }
        System.out.println(vowels +"\n Consonents:- \n"+ cons);
        System.out.println("Size of name = "+name.length());
        sc.close();
    }
}
