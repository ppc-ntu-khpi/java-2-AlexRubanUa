public class Exercise {
    public static boolean Calculate(String word){
        if(word == null || word.isEmpty()){
            return false;
        }
        int left = 0;
        int right = word.length() - 1;
        while(left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String Reverse(String word){
        if(word == null || word.isEmpty()){
            return "error";
        }
        String reversedWord = new StringBuilder(word).reverse().toString();
        return reversedWord;
    }
}

