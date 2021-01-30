import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SplitExamples {

    public static void main(String[] args) {

        /*
        String input = "john    - & + $ ?       . @ boy";
        input = input.replace(" ", "");
        String[] strArr = input.split("[-&+$?.@]");
         */

       // String[] strArr = new String[10];
        String myString = "   Horse         Cow\n\n.   \r Camel \t\t Sheep - & + $ ?       . @  \n Goat        ";

        myString = myString.replaceAll("[\\n\\r\\t\\s-&+$?.@]"," ");

        String[] strArr = myString.split(" ");

        System.out.println(myString);

        List<String> myList = new ArrayList<>();
        for (String str : strArr) {
            if (!str.equals(""))
                myList.add(str);
        }

        for (String str : myList)
            System.out.println(str);
    }
}
