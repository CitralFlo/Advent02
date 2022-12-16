package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file = new File("C:\\Users\\wojta\\Desktop\\SKRYPTY\\studia\\Advent02\\src\\input.txt");

        String runda[] = new String[2500];
        int j;

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st = null;


        String bufor[] = new String[2];
        int i = 0, k = 0, punkty = 0;
        while (true) {
            try {
                if (!((st = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }


            /*

             */
            System.out.println(st);
           // runda[i] = st;
            k=0;
            if(Objects.equals(st, "A X"))punkty = punkty + 0 + 3;
            if(Objects.equals(st, "A Y"))punkty = punkty + 3 + 1;
            if(Objects.equals(st, "A Z"))punkty = punkty + 6 + 2;
            if(Objects.equals(st, "B X"))punkty = punkty + 0 + 1;
            if(Objects.equals(st, "B Y"))punkty = punkty + 3 + 2;
            if(Objects.equals(st, "B Z"))punkty = punkty + 6 + 3;
            if(Objects.equals(st, "C X"))punkty = punkty + 0 + 2;
            if(Objects.equals(st, "C Y"))punkty = punkty + 3 + 3;
            if(Objects.equals(st, "C Z"))punkty = punkty + 6 + 1;
            i++;

            /*
            if (st.isEmpty()) i++;
            else{
                kcal[i] = kcal[i] + Integer.parseInt(st);
            }

             */

        }
        System.out.println("Liczba punktów zebranych: " + punkty);
        System.out.println("zczytywanie zakonczono, podaje i: " + i );

        /*
        int max = 0;
        int number_elf = 0;
        for(int k = 0; k <= 254 ; k++)
        {

            if( kcal[k] >= max )
            {
            //    System.out.println(kcal[k]);
                max = kcal[k];
                number_elf = k;
            }
        }
        System.out.println("Ilosc kcal  " + max + "  numer elfa: " + number_elf);

        max = 0;
        number_elf = 0;
        for(int k = 0; k <= 254 ; k++)
        {
            if(k != 34) {
                if (kcal[k] >= max) {
                //    System.out.println(kcal[k]);
                    max = kcal[k];
                    number_elf = k;
                }
            }
        }
        System.out.println("Ilosc kcal  " + max + "  numer elfa: " + number_elf);

        max = 0;
        number_elf = 0;
        for(int k = 0; k <= 254 ; k++)
        {
            if(k != 224 && k !=34) {
                if (kcal[k] >= max) {
                //    System.out.println(kcal[k]);
                    max = kcal[k];
                    number_elf = k;
                }
            }
        }
        System.out.println("Ilosc kcal  " + max + "  numer elfa: " + number_elf);

         */
    }
}
