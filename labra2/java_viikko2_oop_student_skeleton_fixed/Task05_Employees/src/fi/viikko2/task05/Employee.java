/**
 * Tehtävä 5 – Employee
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perusluokka name-kentällä.
 *  2. monthlyPay() palauttaa 0.
 *  3. toString() ja equals(Object).
 *
 * VINKIT:
 *  - equals: sama nimi + sama alatyyppi.
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class Employee {
    // TODO: protected String name;
    // TODO: public Employee(String name){ ... }
    protected String name;

    public Employee(String name){
        this.name = name;
    }

    public double monthlyPay(){ 
        return 0.0; 
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){ 
        //throw new UnsupportedOperationException("TODO: implement toString()"); 
        return "Employee{name='" + name + "', monthlyPay=" + monthlyPay() + "}";
    }

    @Override
    public boolean equals(Object o){ 
        //throw new UnsupportedOperationException("TODO: implement equals(Object)");
            if (this == o) return true;              // sama viite
        if (o == null || getClass() != o.getClass()) return false; // sama alatyyppi
        Employee other = (Employee) o;
        return name != null && name.equals(other.name);
    }
}