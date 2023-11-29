package com.l2s.calc;
import com.l2s.calc.vision.gui;
/**
 *
 * @author lukas2s
 */
public class Calc {

    public static void main(String[] args) {
        System.out.println("Por que voce esta rodando no terminal?");
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run(){
            new gui().setVisible(true);
        }
    });
    }
}
