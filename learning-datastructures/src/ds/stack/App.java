package ds.stack;

public class App {
    public static void main(String[] args) {
        Stack theStack = new Stack(3);
        /*theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);*/

        while(!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
        }

        System.out.println(reverseString("hello"));
        System.out.println(reverseString("dog"));
    }

    public static String reverseString(String str) {
        String reversedString = "";
        Stack charStack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            charStack.push(str.charAt(i));
        }
        while(!charStack.isEmpty()) {
            reversedString += charStack.pop();
        }
        return reversedString;
    }
}
