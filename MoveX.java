public class MoveX {
    public static void moveAllX(String str, int idx, int count, String newStr){
        if(idx == str.length()){
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x')
        {
            count++;
        }
        else
        {
            newStr += currChar;
        }
        moveAllX(str, idx+1, count, newStr);
    }

    public static void main(String args[]){
        String str = "axbxcxxd";
        moveAllX(str, 0, 0, "");

    }
}
