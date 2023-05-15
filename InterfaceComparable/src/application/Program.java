package application;

import entities.Line;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        String path1 = "..\\input.txt";
        List<String> list1 = new ArrayList<>();
        Locale.setDefault(Locale.US);
        System.out.println();
        System.out.println("Ordenação de lista simples:");
        try (BufferedReader br = new BufferedReader(new FileReader(path1))){
            String simpleLine = br.readLine();

            while(simpleLine != null){
                list1.add(simpleLine);
                simpleLine = br.readLine();
            }

            Collections.sort(list1);

            for (String s : list1) { //trazer elemento String da lista
                System.out.println(s);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
