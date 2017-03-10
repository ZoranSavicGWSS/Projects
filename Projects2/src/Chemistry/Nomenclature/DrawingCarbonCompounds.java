/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chemistry.Nomenclature;

import java.util.Scanner;

/**
 *
 * @author zokiw
 */
public class DrawingCarbonCompounds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        String name = "";

        System.out.println("Enter a name.");
        name = input.nextLine();
        identifyLongestChain(name);

    }

    public static void identifyLongestChain(String name) {
        int carbonCount = 0;

        if (name.contains("meth")) {
            carbonCount = 1;
            drawChain(carbonCount, name);
        } else if (name.contains("eth")) {
            carbonCount = 2;
            drawChain(carbonCount, name);
        } else if(name.contains("prop")){
            carbonCount = 3;
            drawChain(carbonCount, name);
        } else if(name.contains("but")){
            carbonCount = 4;
            drawChain(carbonCount, name);
        }

    }

    public static void drawChain(int carbonNum, String name) {

        System.out.println("");
        System.out.print("C");
        for (int i = 1; i < carbonNum; i++) {
            System.out.print("-C");
        }
        System.out.println("");
    }
}
