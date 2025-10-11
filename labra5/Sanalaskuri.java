public class Sanalaskuri{

    public static int countWords(String text){
        if(text==0 || text.isEmpty()){
        return 0;
        }
    
    String[] words= text.trim().split("\\s+");
    return words.length;
    }
}
    

