package learning;

public class SearchInAString {
    public static void main(String[] args) {
        String name = "Taufeeq";
        char target = 'g';
        System.out.println(searchString(name, target));
    }
    static boolean searchString(String str, char target) {
        boolean found = false;
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                found = true;
            }
        }
        return found;
    }
}
