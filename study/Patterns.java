package study;

public class Patterns {
    public static void main(String[] args) {

        System.out.println("P1");
        for(int i=1; i<6; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("P2");
        for(int i=1; i<6; i++){
            for(int j=1; j<=i; j++){
                if(i%2==0)
                System.out.print("# ");
                else
                System.out.print("$ ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("P3");
        for(int i=5; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("P4");
        for(int i=1; i<6; i++){
            for(int j=5; j>=i; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("P5");
        for(int i=5; i>0; i--){
            for(int j=5; j>=i; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("P6");
        for(int i=1; i<11; i++){
            for(int j=10; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=9; i>0; i--){
            for(int j=9; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("P7");
        for(int i=1; i<7; i++){
            for(int j=1; j<=i; j++){
                if(i%2==0){
                    if(j%2==0)
                    System.out.print("$ ");
                    else
                    System.out.print("* ");
                }
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
