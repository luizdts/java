package curso_programacao;

import model.entities.EmployeeComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramToComparable {
    public static void main(String[] args){
        List<EmployeeComparable> list = new ArrayList<>();
        String path = "/home/luizhenrique/IdeaProjects/in2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String employeeCsv = br.readLine();
            while(employeeCsv != null){
                String[] fields = employeeCsv.split(",");
                list.add(new EmployeeComparable(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (EmployeeComparable emp : list){
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
