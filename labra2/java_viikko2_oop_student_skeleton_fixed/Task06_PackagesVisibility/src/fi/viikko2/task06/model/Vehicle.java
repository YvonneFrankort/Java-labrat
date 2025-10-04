/**
 * Tehtävä 6 – Vehicle (paketointi ja näkyvyys)
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. protected String brand; int mileage (package-private).
 *  2. Konstruktori ja getBrand().
 *  3. toString().
 *
 * VINKIT:
 *  - protected näkyy aliluokille eri paketissa; package-private ei.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task06.model;

public class Vehicle {
    // TODO: protected String brand;
    // TODO: int mileage;

    // TODO: public Vehicle(String brand, int mileage){ ... }
    // TODO: public String getBrand(){ ... }
    protected String brand;
    int mileage;

    public Vehicle(String brand, int mileage){
        this.brand = brand;
        this.mileage = mileage;
    }

    public String getBrand(){
        return brand;
    }


    @Override
    public String toString(){
        //throw new UnsupportedOperationException("TODO: implement toString()"); 
        return "Vehicle{brand=" + brand + ", mileage=" + mileage + "}";
        }
}