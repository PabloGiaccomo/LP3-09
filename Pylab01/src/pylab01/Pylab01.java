/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pylab01;
import java.util.Scanner;
/**
 *
 * @author giacc
 */
public class Pylab01 {

    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do{
            vida ++;
            System.out.println("Vida:"+ vida + "\t¿Cual es el numero secreto?");
            rp = sc.nextInt();
            if (rp == 1234)
                fl =true;
        }while(vida < 3 && ! fl );
        if (fl == true)
            System.out.println("Adivinaste!!!! ");
        else
            System.out.println("ups, perdiste...");
        System.out.println("Segundo commit");
        System.out.println("Tercer commit");
    }

}