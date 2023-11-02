public class Main {
    public static void main(String[] args) {
        String s = null;
        try {
            boolean exc = s.equals("Hello");
        } catch (NullPointerException e) {
            System.out.println("Ошибка");
        }
    }
}