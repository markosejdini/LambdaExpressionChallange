import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {

        String[] names = {"Anna", "Bob", "John", "Berry"};

        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);

    }

    public static char getRandomChar(char startChar, char endChar) {

        return(char) random.nextInt((int)startChar,(int)endChar+1 );
    }
    private static String getReversedName (String firstname){
        return new StringBuilder(firstname).reverse().toString();
    }
}
