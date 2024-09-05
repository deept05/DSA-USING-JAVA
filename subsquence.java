public class subsquence {
    public static void subsquenceString(String str, int idx, String newString){

        if(idx == str.length())
        {
            System.out.println(newString);
            return;
        }
        // to do 
        char currchar = str.charAt(idx);

        subsquenceString(str, idx+1, newString + currchar);

        // to not do 
        subsquenceString(str, idx+1, newString);
    
    }

    public static void main(String[] args){
        String str = "abc";
        subsquenceString(str, 0, "");
    }
}
