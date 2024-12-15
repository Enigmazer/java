package study;

import java.util.*;

public class MPCSSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Oxygen[][] = new int[3][3];
        double topTrainees[] = new double[3];
        for(int i=0; i<3; i++){
            System.out.printf("Round %d:-\n",i+1);
            for(int j=0; j<3; j++){
                do{
                    try{
                        System.out.printf("Oxygen value of trainee[1-100] %d = ",j+1);
                        Oxygen[i][j] = sc.nextInt();
                        if(Oxygen[i][j] >100 || Oxygen[i][j] <1){
                            System.out.println("Invalid Input");
                        }else{
                            break;
                        }
                    }catch(Exception e){
                        System.out.println("Please enter an integer value.");
                        @SuppressWarnings("unused")
                        String temp = sc.nextLine();
                    }
                }while(true);
            }
        }
        sc.close();
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
            topTrainees[i] += Oxygen[j][i];
            }
        }

        double average=0d,max=0d;
        for(int i=0; i<3; i++){
            topTrainees[i] /= 3d;
            if(topTrainees[i]>max){
               max=topTrainees[i]; 
            }
            average+=topTrainees[i];
        }
        if((average /= 3d) < 70d ){
            System.out.println("\nAll trainees are unfit.");
            System.out.printf("Calculated average Oxygen level of all trainees is = %.2f",average);
        }else{
            System.out.println("\nMost fit trainees:- ");
            for(int i=0; i<3; i++){
                if(max==topTrainees[i]){
                    System.out.printf("Top trainee : %d\t Oxeygen level = %.2f\n",i+1,max);
                }
            }
            System.out.printf("\nCalculated average Oxygen level of all trainees is = %.2f",average);
        }
        // System.out.println();
        // for (double d : topTrainees) {
        //     System.out.println(d);
        // }
    }
}
