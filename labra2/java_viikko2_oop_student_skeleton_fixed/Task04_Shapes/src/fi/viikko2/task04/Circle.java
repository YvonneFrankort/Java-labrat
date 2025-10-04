/**
 * Tehtävä 4 – Circle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kenttä radius.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Area = Math.PI * r * r.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Circle extends Shape {
    // TODO: private double radius;
    // TODO: public Circle(double radius) { ... }
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double area(){ 
        return Math.PI * (radius * radius);
    }


    @Override
    public String toString(){ 
        return "Circle{radius=" + radius + ", area=" + area() + "}";
    }

    @Override
    public boolean equals(Object o){ 
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }
}
