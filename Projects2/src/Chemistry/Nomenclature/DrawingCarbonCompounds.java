/*
Author: Zoran Savic
Date: March 10/2017
Description: Draws carbon compounds given user input.
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
        System.out.println("Enter a name.");
        String name = input.nextLine();
        System.out.println("");
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
        } else if(name.contains("pent")){
            carbonCount = 5;
            drawChain(carbonCount, name);
        } else if(name.contains("hex")){
            carbonCount = 6;
            drawChain(carbonCount, name);
        } else if(name.contains("hept")){
            carbonCount = 7;
            drawChain(carbonCount, name);
        } else if(name.contains("oct")){
            carbonCount = 8;
            drawChain(carbonCount, name);
        } else if(name.contains("non")){
            carbonCount = 9;
            drawChain(carbonCount, name);
        } else if(name.contains("dec")){
            carbonCount = 10;
            drawChain(carbonCount, name);
        }
        if(name.contains("yl")){
            System.out.println("in yl");
            int chainLocation = -1;
            System.out.println(name.substring(name.indexOf("yl") - 4, name.indexOf("yl")));
            if(name.substring(name.indexOf("yl") - 4, name.indexOf("yl")) .equalsIgnoreCase("meth")){
                System.out.println("in meth");
                chainLocation = Integer.parseInt(name.substring(name.indexOf("yl") - 6, name.indexOf("yl")-5));
                System.out.println("chainLocation = " + chainLocation);
            } else if(name.substring(name.indexOf("yl") - 3, name.indexOf("yl")) == "eth"){
                
            } else if(name.substring(name.indexOf("yl") - 3, name.indexOf("yl")) == "rop"){
                
            } else if(name.substring(name.indexOf("yl") - 3, name.indexOf("yl")) == "but"){
                
            } else if(name.substring(name.indexOf("yl") - 3, name.indexOf("yl")) == "ent"){
                
            } else if(name.substring(name.indexOf("yl") - 3, name.indexOf("yl")) == "hex"){
                
            } else if(name.substring(name.indexOf("yl") - 3, name.indexOf("yl")) == "ept"){
                
            } else if(name.substring(name.indexOf("yl") - 3, name.indexOf("yl")) == "oct"){
                
            } else if(name.substring(name.indexOf("yl") - 3, name.indexOf("yl")) == "non"){
                
            } else if(name.substring(name.indexOf("yl") - 3, name.indexOf("yl")) == "dec"){
                
            }
        }

    }
    public static void drawSideChain(int chainLength, int carbonNum){
        
    }

    public static void drawChain(int carbonNum, String name) {
        int doubleAt = -1;
        int tripleAt = -1;
        if(name.contains("ene")){
            doubleAt = Integer.parseInt(name.substring(name.length() - 5, name.length() - 4));
        } else if(name.contains("yne")){
            tripleAt = Integer.parseInt(name.substring(name.length() - 5, name.length() - 4));
        }
        System.out.print("C");
        for (int i = 1; i < carbonNum; i++) {
            if(i == doubleAt){
                System.out.print("=");
            }else if(i == tripleAt){
                System.out.print("=-");
            }else{
                System.out.print("-");
            }
            System.out.print("C");
        }
        System.out.println("");
    }
}
