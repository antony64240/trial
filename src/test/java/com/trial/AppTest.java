package com.trial;

import com.trial.plane.Plane;
import com.trial.plane.beans.Triangle;
import com.trial.plane.beans.Square;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AppTest {


    @Test
    public void testApp() {

        final Square square1 = new Square.Builder()
                .addX(10)
                .addY(20)
                .build();

        Square square2 = new Square.Builder()
                .addX(20)
                .addY(40)
                .build();

        Square square3 = new Square.Builder()
                .addX(10)
                .addY(50)
                .build();

        Triangle shape = new Triangle.Builder()
                .addX(5)
                .addY(20)
                .build();

        Triangle shape2 = new Triangle.Builder()
                .addX(60)
                .addY(320)
                .build();


        // calculer l'aire pour les squares et les triangles et les afficher dans la console
        List<Plane> planeList = List.of(square1, square2, square3, shape, shape2);
        
        planeList.stream().map(Plane::areaCalc).forEach(System.out::println);


        // Ici je voudrais filtrer les éléments qui ont une aire > 250 et les ajouter dans une liste pour l'afficher dans leurs types
        List<Plane> expectedPlaneList = planeList.stream()
                .filter(plane -> plane.areaCalc() > 250)
                .toList();
        
        expectedPlaneList.forEach(this::displayPlaneWithTypeInConsole);
        
        List<Triangle> expectedTriangleList = new ArrayList<>();
        List<Square> expectedSquareList = new ArrayList<>();
        
        planeList.stream().filter(plane -> plane.areaCalc() > 250).forEach(plane -> {
            if (plane instanceof Triangle) {
                expectedTriangleList.add((Triangle) plane);
            } else {
                expectedSquareList.add((Square) plane);
            }
        });
    }
    
    private void displayPlaneWithTypeInConsole(Plane plane) {
        System.out.printf("type: %s - aire: %d%n",
		        plane.getType(),
		        plane.areaCalc());
    }
}
