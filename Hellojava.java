package com.company;



import java.util.Random;



public class Main {



    public static void main(String[] args) {

	// write your code here

        Random rand = new Random();

        int rand_int1 = rand.nextInt(1000);

        int rand_int2 = rand.nextInt(1000);

        System.out.println("Random Integers: " + rand_int1);

        System.out.println("Random Integers: " + rand_int2);

        // Generate Random doubles

        double rand_dub1 = rand.nextDouble();

        double rand_dub2 = rand.nextDouble();

        // Print random doubles

        System.out.println("Random Doubles: " + rand_dub1);

        System.out.println("Random Doubles: " + rand_dub2);

    }

}


