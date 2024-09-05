import java.util.HashSet;


public class uniqueSubset {
    public static void subsquenceString(String str, int idx, String newString, HashSet<String>set){

        if(idx == str.length())
        {
            if(set.contains(newString)){
                return;
            }
            else
            {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        // to do 
        char currchar = str.charAt(idx);

        subsquenceString(str, idx+1, newString + currchar, set);

        // to not do 
        subsquenceString(str, idx+1, newString, set );
    
    }

    public static void main(String[] args){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsquenceString(str, 0, "", set);
    }
}
