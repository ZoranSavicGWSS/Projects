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
        int targetKeyCode = 0;
        char[] targetChar = TARGET.toCharArray();
        for(int i = 0; i < targetChar.length; i++){
            targetKeyCode += targetChar[i];
        }
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
 //       ArrayList<String> population = createPopulation(popSize,TARGET);
//        ArrayList<Integer> popInt = toInt(population);
        int[] popInt  = toInt(population);
        int generationCounter = 1;
        //BEST 
        String best = "";
        while(generationCounter < maxGenerations && best != TARGET){
            Evolve();
            generationCounter++;
        }
        
        sort(popInt, population);
        //deleteWorst(population, fractionDeleted);
    }
    
    public static String[] createPopulation(int size, String target){
        String[] returnable = new String[size];
        int rand;
        String temp = "";
        for(int i = 0; i < size; i++){
            temp = "";
            for(int j = 0; j < target.length(); j++){
                rand = (int) (Math.random() * 26) + 65;
                temp = temp + ((char) rand);
            }
            returnable[i] = temp;
        }
        return returnable;
    }
    
    public static int[] toInt(String[] population){
        int[] returnable = new int[population.length];
        int sum = 0;
        char[] tempCharAr = new char[population[0].length()];
        for(int i = 0 ; i < population.length; i++){
            sum = 0;
            tempCharAr = population[i].toCharArray();
            for(int j = 0; j < tempCharAr.length; j++){
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
                if (Math.abs(popInt[i] - 372) > Math.abs(popInt[i+1]- 372)) {
                    //swap
                    //int
                    temp = popInt.get(i);
                    popInt.set(i, popInt.get(i + 1));
                    popInt.set(i + 1, temp);
                    //string
                    tempS = population.get(i);
                    population.set(i, population.get(i+1));
                    population.set(i+1, tempS);
                    flag = true;
                }
            }

        }
        //printing for troubleshooting
//        for (int i = 0; i < popInt.size(); i++) {
//            System.out.println(popInt.get(i));
//        }
//        for(int i = 0; i < population.size();i++){
//            System.out.println(population.get(i));
//        }
    }
    public static void sort1 (int[] popInt, String[] population){
        int temp;
        String tempS;
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0; i < popInt.length - 1; i++){
                if(Math.abs(popInt[i] - 372))
            }
        }
    }

    public static void Evolve(ArrayList<String> population, double mutationRatio, double crossRatio, double elitismRatio) {
        
    }

}
