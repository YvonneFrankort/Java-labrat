/**
 * Tehtävä 5 – HourlyEmployee
 *
 * MITÄ TEET TÄHÄN TIEDOSTOON:
 *  1. Perii Employee; kentät hourlyRate, hoursPerMonth.
 *  2. monthlyPay() = rate * hours.
 *  3. toString() kuvaava.
 *
 * VINKIT:
 *  - Muista super(name).
 *
 * HUOM:
 *  - Älä käytä ArrayListiä tai muita kokoelmia.
 *  - Ei käyttäjän syötteitä metodeissa; testaa `main()`ista.
 */

package fi.viikko2.task05;

public class HourlyEmployee extends Employee {
    // TODO: private double hourlyRate; private double hoursPerMonth;
    // TODO: public HourlyEmployee(String name, double hourlyRate, double hoursPerMonth){ super(name); ... }
    private double hourlyRate;
    private double hoursPerMonth;

    public HourlyEmployee(String name, double hourlyRate, double hoursPerMonth){
        super(name);
        this.hoursPerMonth = hoursPerMonth;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double monthlyPay(){ 
        //throw new UnsupportedOperationException("TODO: implement monthlyPay()"); 
        return hourlyRate * hoursPerMonth;
        }

    @Override
    public String toString(){ 
        //throw new UnsupportedOperationException("TODO: implement toString()"); 
        return "HourlyEmployee{name='" + getName() + 
               "', hourlyRate=" + hourlyRate + 
               ", hoursPerMonth=" + hoursPerMonth + 
               ", monthlyPay=" + monthlyPay() + "}";
    }
}