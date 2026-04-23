public class Program8_RemoveSpaces {
    public static void main(String[] args) {
        String text = "This   is   test";
        System.out.println(text.replaceAll("\\s+", " "));
    }
}