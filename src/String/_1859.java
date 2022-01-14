package String;

public class _1859 {
    public String sortSentence(String s) {

        String[] words = s.split(" ");
        String[] arr = new String [words.length];

        for(String word : words) {
            int i = word.length() - 1;
            arr[word.charAt(i) - '1'] = word.substring(0,i);
            System.out.println(word.charAt(i) - '1');
        }
        return String.join(" ", arr);
    }
}
