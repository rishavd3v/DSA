package String;

public class skip {
    public static void main(String[] args) {
        String str = "abcaacda";

        String newString = skipChar(str,'a');
        System.out.println(newString);

        String str2 = "pineapplecone";
        System.out.println(skipString(str2,"apple"));
    }


    public static String skipChar(String str, char k){
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);
        if(ch==k){
            return skipChar(str.substring(1),k);
        }
        else return ch + skipChar(str.substring(1),k);
    }

    public static String skipString(String str, String k){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith(k)){
            return skipString(str.substring(5),k);
        }
        else return str.charAt(0) + skipString(str.substring(1),k);
    }


}