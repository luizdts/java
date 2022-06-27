package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("Quantos alunos a turma A possui?");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.println("Quantos alunos a turma B possui?");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.println("Quantos alunos a turma C possui?");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            int number = sc.nextInt();
            a.add(number);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();
    }
}
