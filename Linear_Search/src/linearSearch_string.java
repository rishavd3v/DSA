public class linearSearch_string {
    public static void main(String[] args) {

        String s = "Rishav";
        char target = 'a';
        System.out.println(search(s, target));


    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
