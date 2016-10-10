/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juchafernandez
 */
public class Threads1 extends Thread {
    
    public Threads1(String variable) {
        super(variable);
    }
    
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("error con la interrupción");
            }
            if (i == 9) {
                System.out.println("acabado 1");
                
            }
        }
    }
    
    public static void main(String[] args) {
        new Threads1("Manel").start();
        new Threads1("Joteruuuuu").start();
        System.out.println("acabado 2");
        
    }
    
}
