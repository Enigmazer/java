package study;

public class CalcGst {
    public static void main(String[] args) {
        int percahse = 20000;
        // percahse ^= 20000;   // ^ - xor, && - and, || - or, ! - not,  
        double gst = (18*percahse)/100;
        double BA = (double)percahse+gst;
        System.out.printf("Gst : %.2f Bill Amount : %.2f\n",gst,BA);

        //table using while loop 
        int i=1;
        while (i<11) {
            System.out.println(2*i);
            i++;
        }
    }
}
