/**
 * Created by opilane on 21.10.2016.
 */
public class NewLine {

    public static String nimi = "Part";
    public static String argument = "Never say never.";

    public static void newLine() {
        System.out.println();
    }
    public static void threeLine() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("First line.");
        newLine();
        threeLine();
        System.out.println("Second line.");
    }

}

