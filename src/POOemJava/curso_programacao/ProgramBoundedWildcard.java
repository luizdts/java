package application;

import model.entities.CircleBoundedWildcard;
import model.entities.RectangleBoundedWildcard;
import model.entities.ShapeInterface;

import java.util.ArrayList;
import java.util.List;

public class ProgramBoundedWildcard {
    public static void main(String[] args){
        List<ShapeInterface> myShapes = new ArrayList<>();
        myShapes.add(new RectangleBoundedWildcard(3.0, 2.0));
        myShapes.add(new CircleBoundedWildcard(2.0));

        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<ShapeInterface> list){
        double sum = 0.0;
        for (ShapeInterface s : list){
            sum += s.area();
        }
        return sum;
    }
}
