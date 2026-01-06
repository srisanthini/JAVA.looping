public class Firstdigit {
    public static void main(String[] args) {
        int number = 12345;
        String numStr = String.valueOf(Math.abs(number));
        int firstDigit = Integer.parseInt(numStr.substring(0, 1));
        
        System.out.println("First digit: " + firstDigit);
    }
}