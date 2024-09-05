public class advRec1 {
    public static void printPer(String str, String permutation)
    {
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i = 0; i<str.length(); i++){
            char currChar = str.charAt(i);

            String newstr = str.substring(0,i)+str.substring(i+1);
            printPer(newstr, permutation+currChar);


        }

    }
    public static void main(String[] args) {
        String str = "abc";
        printPer(str, "");
    }
}
