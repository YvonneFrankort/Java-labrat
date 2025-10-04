/**
 * Tehtävä 4 – Rectangle
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Kentät: width, height.
 *  2. Konstruktori.
 *  3. Ylikirjoita area(), toString(), equals().
 *
 * VINKIT:
 *  - Muista @Override.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task04;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }


    @Override
    public double area(){ 
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        //throw new UnsupportedOperationException("TODO: implement area()"); }
        return width * height;
    }

    @Override
    public String toString(){ 
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        //throw new UnsupportedOperationException("TODO: implement toString()"); }
        return "Rectangle{width=" + width + ", height=" + height + ", area=" + area() + "}";
    }


    @Override
    public boolean equals(Object o){ 
        //  Toteuta ja palauta merkkijono. Kun olet valmis, POISTA alla oleva rivi.
        //throw new UnsupportedOperationException("TODO: implement equals(Object)"); }
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
               Double.compare(rectangle.height, height) == 0;
    }
}