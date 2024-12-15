package study;


// // enum is a class but we can't extend it from other classes
// enum Status{    // 'Status extends a' can't do this (but implements works)
//     Running, Failed, Pending, Sucess;
// }

// class a extends Status{} // can't do this too

// public class Enum {
//     public static void main(String[] args) {
//         Status s = Status.Running;
//         System.out.println(s);
//         System.out.println(s.ordinal()); // it will print the index of the enum
//         System.out.println(s.getClass().getSuperclass());   // class is status super class is enum
//         // System.out.println(s.getClass().getSuperclass().getSuperclass());  // class is enum super class is object

//         System.out.println();
//         Status sa[] = Status.values();  // it will return all the enums(int the form of an array)
//         for (Status status : sa) {
//             System.out.println(status);
//         }
//         System.out.println();
//         switch (s) {
//             case Running:
//                 System.out.println("Running");
//                 break;
//             case Failed:
//                 System.out.println("Failed");
//                 break;
//             case Pending:
//                 System.out.println("Pending");
//                 break;
//             case Sucess:
//                 System.out.println("Sucess");
//                 break;
//             default:
//                 System.out.println("Default");
//                 break;
//         }
//     }
// }

enum LaptopENM{
    MacBook(2000),HP(1000),Asus(1500);

    private int price;
    private LaptopENM(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enum {
        public static void main(String[] args) {
            LaptopENM l = LaptopENM.MacBook;
            System.out.println(l+" : "+l.getPrice());
        }
}

// go in gpt hstr for more info