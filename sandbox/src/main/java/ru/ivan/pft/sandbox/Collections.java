package ru.ivan.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args){
        String[] langsSilly = new String[4];
        langsSilly[0]="Java";
        langsSilly[1]="C#";
        langsSilly[2]="Python";
        langsSilly[3]="PHP";

        String[] langs = {"Java","C#","Python","PHP"};
        List<String> languges = Arrays.asList("Java","C#","Python","PHP");


        for (String l : languges){
            System.out.println("Я до сих пор не знаю " + l);
        }

    }
}
