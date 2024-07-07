public class Permutation {

    public static void main(String[] args) {
        String str = "abcd";

        permutation(str,"");
        System.out.println(noOfPermutation(str,""));
    }


    static void permutation(String str, String newString){
        if(str.isEmpty()){
            System.out.print(newString+" ");
            return;
        }

        char ch = str.charAt(0);
        for(int i=0;i<=newString.length();i++){
            String first = newString.substring(0,i);
            String second = newString.substring(i);
            permutation(str.substring(1),first+ch+second);
        }

    }

    static int noOfPermutation(String str, String newString){
        if(str.isEmpty()){
            return 1;
        }

        int count = 0;

        char ch = str.charAt(0);
        for(int i=0;i<=newString.length();i++){
            String first = newString.substring(0,i);
            String second = newString.substring(i);
            count += noOfPermutation(str.substring(1),first+ch+second);
        }

        return count;

    }


}
