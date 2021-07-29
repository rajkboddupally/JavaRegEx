import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitExamples {
    private static Pattern pattern = Pattern.compile("(\\d+)-(\\d+)");

    public static void main(String[] args) {

        /*
        String input = "john    - & + $ ?       . @ boy";
        input = input.replace(" ", "");
        String[] strArr = input.split("[-&+$?.@]");
         */

        // String[] strArr = new String[10];
        String myString = "   Horse         Cow\n\n.   \r Camel \t\t Sheep - & + $ ?       . @  \n Goat        ";

        //myString = myString.replaceAll("[\\n\\r\\t\\s-&+$?.@]"," ");

        /*myString = myString.replaceAll("[^A-Za-z]", " ");

        String[] strArr = myString.split(" ");

        //System.out.println(myString);

        List<String> myList = new ArrayList<>();
        for (String str : strArr) {
            if (!str.equals(""))
                myList.add(str);
        }

        for (String str : myList)
            System.out.println(str);

         */
        split("1123-4567");
        split("ab-cde");
    }

    private static void split(String input) {
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("GROUP-1 " + matcher.group(1) + " GROUP-2 " + matcher.group(2));
        } else
            System.out.println("Pattern does not match");
    }
}
