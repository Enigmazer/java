package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    public static void main(String[] args) throws NumberFormatException, IOException {  /*  not a good practice
                                 cause we are saying jvm to handle the exeption here 
                                 and jvm will just terminate the program on error (but ok for this code)*/
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(i);
    
        int num = Integer.parseInt(bf.readLine());

        System.out.println(num);
        
        bf.close();

        // this one is old and the other and batter way to do this is scanner class
    }

}
