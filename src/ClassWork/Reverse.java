package ClassWork;

public class Reverse {
    public   void main(String[] args) {

    }
    public void reverse(String input) {

        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }
}
