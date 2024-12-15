package other_programs;
import java.util.Scanner;

class library1{

    Scanner sc = new Scanner(System.in);
    int shelf;
    String book[];
    public void setsize(){
        System.out.print("Set the shelf size = ");
        this.shelf = sc.nextInt();
        book = new String[shelf];
        sc.nextLine();
    }

    int n=0;
    public void addbook(){
        if (n==shelf) {
            System.out.println("Shelf is full");
        }else{
            System.out.print("Enter book name = ");
            String b = sc.nextLine();
            book[n] = b;
            n++;
        }
    }

    public void showbooks(){
        if (n==0) {
            System.out.println("Shelf is empty");
        }else{
            for(int i=0; i<n; i++){
                if (book[i] == "empty") {
                    continue;
                }
                System.out.println(i+". "+book[i]);
            }
        }
    }

    String bk;
    int n2=0;
    public void issubook(){
        if (n==0) {
            System.out.println("Shelf is empty");
        }else{
        if (n2>0){
            System.out.println("You can only issue one book at a time");
        }else{
            int n3;
            do{
            System.out.print("Enter the no. assigned to the book you want to isuue = ");
            n3 = sc.nextInt();
            if(n3<n && n3>=0){
                break;
            }
            System.out.println("No book found at the given number.");
            }while(true);
            System.out.println("You have succesfully issued "+book[n3]);
            bk=book[n3];
            book[n3] = "empty";
            n--;
            n2++;
        }}
    } 

    public void returnbook(){
        if(n2==0){
            System.out.println("You haven't issued any book yet");
        }
        for(int i=0; i<n; i++){
            if (book[i] == "empty"){
                book[i] = bk;
                System.out.println("You have succesfully returned the book");
                n2=0;
                n++;
                break;
            }
        }
    }
}

public class library {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        library1 libobj = new library1();
        System.out.println("1. Set shelf size\n2. Add book\n3. Show available books\n4. Issue book\n5. return book\n6. Exit library");
        byte option;
        do{
        option = sc.nextByte();
        switch (option) {
            case 1:
                libobj.setsize();
                break;
            case 2:
                libobj.addbook();
                break;
            case 3:
                libobj.showbooks();
                break;
            case 4:
                libobj.issubook();
                break;
            case 5:
                libobj.returnbook();
                break;
            case 6:
                System.out.println("EXITING the library");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }}while(option!=6);
    }
}
