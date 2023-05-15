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

//PARTE 2 DO EXERCICIO COMPARABLE

        String path2 = "..\\input2.csv";

        List<Line> list2 = new ArrayList<>();
        System.out.println();
        System.out.println("Ordenação de lista composta");
        try (BufferedReader br2 = new BufferedReader(new FileReader(path2))){
            String compostLine = br2.readLine();

            while (compostLine != null){
                String[] fields = compostLine.split(",");
                String name = fields[0];
                double num = Double.parseDouble(fields[1]);
                list2.add(new Line(name,num));
                compostLine = br2.readLine();
            }

            Collections.sort(list2);

            for (Line line : list2) {
                System.out.println(line.getName() + "," +line.getNum());
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }




    }
}
