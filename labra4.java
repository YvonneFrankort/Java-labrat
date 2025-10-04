import java.util.HashMap;
import java.util.Map

//Osa 1: Listat
//Tehtävä L1: Luo lista ja lisää alkio
//Luo List<String>, lisää yksi alkio (esim. "Omena") ja tulosta lista. Vinkki: muista että listan indeksi alkaa nollasta.
ArrayList<String> fruits= new ArrayList<String>();
fruits.add("Omena");
System.out.println(fruits);

//Tehtävä L2: Lisää useita lukuja listaan
//Luo List<Integer>, lisää luvut 10 ja 20, ja tulosta lista. Huom: autoboxing muuntaa int-tyypin automaattisesti Integer-olioksi.
ArrayList<Integer> luku= new ArrayList<Integer>();
luku.add(10);
luku.add(20);
System.out.println(luku);

//Tehtävä L3: Hae alkio listasta
//Luo List<String>, jossa arvot "Kissa" ja "Koira". Tulosta ensimmäinen alkio.
ArrayList<String> pets= new ArrayList<String>();
pets.add("kissa");
pets.add("koira");
System.out.println(pets.get(0));

//Tehtävä L4: Poista alkio listasta
//Luo List<String>, jossa alkiot A, B, C. Poista B ja tulosta lista. Vinkki: ole tarkkana remove(Object) vs. remove(index).
ArrayList<String> letters= new ArrayList<String>();
letters.add("A");
letters.add("B");
letters.add("C");
letters.remove("B");
System.out.println(letters);

//Tehtävä L5: Listan koko
//Luo List<String>, lisää kolme alkiota ja tulosta listan koko.
ArrayList<String> cities= new ArrayList<String>();
cities.add("Lexington");
cities.add("Louisville");
cities.add("Frankfort");
System.out.println(cities.size());

//Tehtävä L6: Listan läpikäynti
//Luo List<Integer>, jossa arvot 1, 2, 3. Tulosta jokainen arvo omalle rivilleen ensin perinteisellä for-silmukalla ja sen jälkeen for-each -silmukalla.
ArrayList<Integer> numbers= new ArrayList<Integer>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
for (int i= 0; i < numbers.size(); i++){
    System.out.println(numbers.get(i));
}

ArrayList<Integer> numbers= new ArrayList<Integer>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
for (int num:numbers){
    System.out.println(num);
}


//Osa 2: Setit
//Tehtävä S1: Luo Set
//Luo Set<String>, lisää kaksi alkiota (esim. "Aurinko" ja "Kuu") ja tulosta setti. Huom: Set ei takaa järjestystä.
HashSet<String> univers= new HashSet<String>();
univers.add("Aurinko");
univers.add("Kuu");
System.out.println(univers);

//Tehtävä S2: Duplikaatti Setissä
//Luo Set<Integer>, lisää luku 4 kahdesti ja tulosta setti. Huom: duplikaatit hylätään.
HashSet<Integer> numbers= new HashSet<Integer>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(4);
numbers.add(4);
System.out.println(numbers);

//Tehtävä S3: TreeSet ja järjestys
//Luo TreeSet<Integer>, lisää luvut 3, 1, 2 ja tulosta setti. Huom: TreeSet pitää alkiot nousevassa järjestyksessä.
TreeSet<Integer> sortedNumbers= new TreeSet<Integer>();
sortedNumbers.add(3);
sortedNumbers.add(1);
sortedNumbersr.add(2);
System.out.println(sortedNumbers);



//Osa 3: Mapit
//Tehtävä M1: Perustoiminnot Mapilla
//Luo Map<String,Integer>, lisää parit ("A",1) ja ("B",2). Tulosta arvo avaimella "A".
HashMap<String, Integer> pairs= new HashMap<String, Integer>();
pairs.put("A", 1);
pairs.put("B", 2);
System.out.println(pairs.get("A"));

//Tehtävä M2: Mapin läpikäynti
//Luo Map<String,Integer> ja lisää muutama arvo. Käy läpi entrySet()-menetelmällä ja tulosta avain=arvo -tyyliin.
HashMap<Integer, String> animals= new HashMap<Integer, String>();
animals.put(1, "Fox");
animals.put(2, "Tiger");
animals.put(3, "Flamingo");
for (Map.Entry<Integer, String> entry:animals.entrySet()){
    System.out.println(entry.getKey() + "=" + entry.getValue());
}

//Tehtävä M3: Tulosta vain avaimet
//Luo Map<Integer,String>, jossa (1, "Punainen"), (2, "Sininen"). Tulosta kaikki avaimet samalla rivillä välilyönnein eroteltuna.
HashMap<Integer, String> insects= new HashMap<Integer, String>();
insects.put(1, "firefly");
insects.put(2, "dragonfly");
insects.put(3, "bumblebee");
for (Integer key: insects.keySet()){
    System.out.println(key + " ");
}


//Osa 4: Yhdistelmätehtävät
//Tehtävä C1: Opiskelijalista
//Tee ohjelma, joka käyttää List<String>-rakennetta opiskelijoiden nimien tallentamiseen. Lue nimet Scannerilla kunnes käyttäjä kirjoittaa "stop". Tulosta lopuksi kaikki nimet.
public static void main(String[] args){
ArrayList<String> students= new ArrayList<String>();
Scanner scanner= new Scanner(System.in);
String typed;
System.out.println("Enter students name, 'stop' to finnish");
while (true){
    typed= scanner.nextLine();
    if(typed.equals("stop")){
        break;
    }
    students.add(typed);
}
scanner.close();

System.out.println(students);
}

//Tehtävä C2: Uniikit sanat
//Kirjoita ohjelma, joka lukee Scannerilta sanoja kunnes käyttäjä kirjoittaa "stop". Tallenna sanat Set<String>-rakenteeseen ja tulosta lopuksi uniikkien sanojen lukumäärä.
public static void main(String[] args){
HashSet<String> students= new HashSet<String>();
Scanner scanner= new Scanner(System.in);
String typed;
System.out.println("Enter students name, 'stop' to finnish");
while (true){
    typed= scanner.nextLine();
    if(typed.equals("stop")){
        break;
    }
    students.add(typed);
}
scanner.close();

System.out.println(students.size());
}

//Tehtävä C3: Puhelinluettelo Mapilla
//Luo Map<String,String>, jossa avain on henkilön nimi ja arvo puhelinnumero. Lisää vähintään kolme merkintää. Toteuta haku, jossa käyttäjä antaa nimen ja saa numeron.
public static void main(String[] args){
    HashMap<String, String> people= new HashMap<String, String>();
    people.put("Tom", "1234");
    people.put("Jerry", "456");
    people.put("Spike", "789");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter name, get phonenumber");
    String name = scanner.nextLine();

    String number = people.get(name);
    System.out.println(name + "'s number is " + number);

    scanner.close();
}

//Tehtävä C4: Sanojen frekvenssilaskuri
//Kirjoita ohjelma, joka lukee Scannerilta lauseen. Laske kuinka monta kertaa kukin sana esiintyy Map<String,Integer>-rakenteella. Tulosta lopuksi kaikki sanat ja niiden määrät. Vinkki: muunna sanat pieniksi kirjaimiksi ennen laskemista.
public static void main(String[] args){
    HashMap<String, Integer> word= new HashMap<String, Integer>()

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String sentence = scanner.nextLine();
    scanner.close();

    String[] words = sentence.toLowerCase().split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String w : words) {
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }

        System.out.println("Word count:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }


//Osa 5: Lajittelu ja edistyneet tehtävät
//Tehtävä A1: Listan lajittelu
//Luo List<String>, jossa arvot ["b", "a", "c"]. Lajittele lista ja tulosta se nousevassa järjestyksessä. Vinkki: Collections.sort tai list.sort toimii.
ArrayList<String> letters= new ArrayList<String>();
letters.add("b");
letters.add("a");
letters.add("c");

Collections.sort(letters);
System.out.println(letters);


//Tehtävä A2: Mukautettu lajittelu
//Luo List<String>, jossa on eri pituisia sanoja. Lajittele lista pituuden mukaan lyhimmästä alkaen. Best practice: käytä Comparator.comparingInt.
ArrayList<String> moreWords = new ArrayList<String>();
moreWords.add("gas");
moreWords.add("electricity");
moreWords.add("water");

moreWords.sort(Comparator.comparingInt(String::length));
System.out.println(moreWords);


//Tehtävä A3: TreeMap
//Luo TreeMap<Integer,String>, lisää muutama pari ja tulosta map. Havainnoi, että avaimet tulostuvat järjestyksessä.
TreeMap<Integer, String> kitties= new TreeMap<Integer, String>();
kitties.put(1, "Midnight");
kitties.put(2, "Shadow");
kitties.put(3, "Fluffy");

for (Integer key : kitties.keySet()) {
    System.out.println(key + " = " + kitties.get(key));
}


//https://www.w3schools.com/java/java_arraylist.asp