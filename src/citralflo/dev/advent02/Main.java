package citralflo.dev.advent02;

import java.io.*;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file = new File("C:\\Users\\wojta\\IdeaProjects\\Advent02\\src\\input.txt");


        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st = null;

        int i = 0, k = 0, punkty = 0;
        while (true) {
            try {
                if (!((st = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }

           // System.out.println(st);
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

        }
        System.out.println("Liczba punktów zebranych: " + punkty);
        System.out.println("zczytywanie zakonczono, podaje i: " + i );

    }
}
