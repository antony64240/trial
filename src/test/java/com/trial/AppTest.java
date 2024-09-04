package com.trial;

import com.trial.plane.Plane;
import com.trial.plane.beans.Triangle;
import com.trial.plane.beans.Square;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AppTest {

    private static final int MAXIMAL_AREA = 250;

    @Test
    void testApp() {
        List<Plane> planes = initializePlanes();

        displayAreas(planes);
        displayPlanesWithLargeAreas(planes);
    }

    private List<Plane> initializePlanes() {
        List<Plane> planes = new ArrayList<>();

        planes.add(new Square.Builder().addX(10).addY(20).build());
        planes.add(new Square.Builder().addX(20).addY(40).build());
        planes.add(new Square.Builder().addX(10).addY(50).build());
        planes.add(new Triangle.Builder().addX(5).addY(20).build());
        planes.add(new Triangle.Builder().addX(60).addY(320).build());

        return planes;
    }

    // calculer l'air pour les squares et les triangles et les afficher dans la console
    private void displayAreas(List<Plane> planes) {
        System.out.println("----- Début des logs -----");
        planes.forEach(plane -> System.out.println(plane.areaCalc()));
    }

    // Ici je voudrais filtrer les éléments qui ont une aires > 250 et les ajouter dans une listes pour l'afficher dans leurs types
    private void displayPlanesWithLargeAreas(List<Plane> planes) {
        planes.stream()
                .filter(plane -> plane.areaCalc() > MAXIMAL_AREA)
                .forEach(plane -> System.out.println(plane.getType()));
        System.out.println("----- Fin des logs -----");
    }
}
