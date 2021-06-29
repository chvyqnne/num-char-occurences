public class NumberCharacter {
    public static void main(String[] args) {
        System.out.println(numOccurences("Mississippi", 'S'));
    }

    public static int numOccurences(String s, char c) {
        // base case
        if (s.length() == 0) {
            return 0;
        }
        //  step
        else if (s.charAt(0) == Character.toLowerCase(c)) {
            return 1 + numOccurences(s.substring(1), c);
        }
        else {
            return numOccurences(s.substring(1), c);
        }
    }
}
