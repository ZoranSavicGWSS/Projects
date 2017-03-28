/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneticAlgorithm;

import java.util.ArrayList;

/**
 *
 * @author zokiw
 */
public class EvolveWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TARGET WORD
        String TARGET = "HELLO";
        int targetKeyCode = CalcKeyCode(TARGET);
        System.out.println(targetKeyCode);
        //number hello == 372
        
        //INITIAL SIZE OF POPULATION
        int popSize = 20;
        //MAX GENERATIONS
        int maxGenerations = 1000; //idk so far
        //MUTATION RATIO
        double mutationRatio = 0.2;
        //CROSSOVER RATIO
        double crossRatio = 0.8;
        //ELITISM RATIO
        double elitismRatio = 0.1;

        String[] population = createPopulation(popSize, TARGET);
        int[] popInt = toInt(population);

        int generationCounter = 1;
        //BEST 
        String best = "";
        while (generationCounter < maxGenerations && best != TARGET) {
            Evolve();
            generationCounter++;
        }

        sort(popInt, population);
        //deleteWorst(population, fractionDeleted);
    }
    public static int CalcKeyCode(String word){
        char[] wordChar = word.toCharArray();
        int sum = 0;
        for(int i = 0; i < wordChar.length; i++){
            sum += wordChar[i];
        }
        return sum;
    }

    public static String[] createPopulation(int size, String target) {
        String[] returnable = new String[size];
        int rand;
        String temp = "";
        for (int i = 0; i < size; i++) {
            temp = "";
            for (int j = 0; j < target.length(); j++) {
                rand = (int) (Math.random() * 26) + 65;
                temp = temp + ((char) rand);
            }
            returnable[i] = temp;
        }
        return returnable;
    }

    public static int[] toInt(String[] population) {
        int[] returnable = new int[population.length];
        int sum = 0;
        char[] tempCharAr = new char[population[0].length()];
        for (int i = 0; i < population.length; i++) {
            sum = 0;
            tempCharAr = population[i].toCharArray();
            for (int j = 0; j < tempCharAr.length; j++) {
                sum += tempCharAr[j];
            }
            returnable[i] = sum;
        }
        return returnable;
    }

    public static void sort(int[] popInt, String[] population) { //number hello == 372
        int temp;
        String tempS;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < popInt.length - 1; i++) {
                if (Math.abs(popInt[i] - 372) > Math.abs(popInt[i + 1] - 372)) {
                    // SWAP
                    swapFwd(popInt, population, i);
                    flag = true;
                }
            }

        }
    }
    
    public static void swapFwd(int[] popInt, String[] population, int i){
        // TEMP VARIABLES
        int tempInt;
        String tempString;
        
        // INT
        tempInt = popInt[i];
        popInt[i] = popInt[i+1];
        popInt[i+1] = tempInt;
        
        // STRING
        tempString = population[i];
        population[i] = population[i+1];
        population[i+1] = tempString;
    }

    public static void Evolve(ArrayList<String> population, double mutationRatio, double crossRatio, double elitismRatio) {
        
    }

}
