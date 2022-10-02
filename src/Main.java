// Us hesabı yapan program.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int us;
        double taban, sonuc = 1, secondSonuc;
        System.out.print("taban: ");
        taban = input.nextDouble();
        System.out.print("üs (tam sayı): ");
        us = input.nextInt();

        if(us<0){
            for(int i =1; i<=(us*-1); i++){
                sonuc = sonuc * taban;

            }

        }else{

        for(int i =1; i<=us; i++){
            sonuc = sonuc * taban;
        }
        }

        secondSonuc = (1/sonuc);

        if(us>=0){
        System.out.println(taban+"^"+us+"= "+sonuc);}
        else{
            System.out.println(taban+"^"+us+"= "+secondSonuc);
        }
    }
}