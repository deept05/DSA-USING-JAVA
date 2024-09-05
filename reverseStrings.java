public class reverseStrings {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Hello");
        for(int i =0; i<sb.length()/2 ; i++){
            int front = i;
            int back = sb.length() - i - 1;

            char fronChar = sb.charAt(front);
            char BackChar = sb.charAt(back);

            sb.setCharAt(front,BackChar);
            sb.setCharAt(back, fronChar);
        }
        System.out.println(sb);
    }
}
