package ClassWork;

public class Replace {

    public static void replaceString(String s){
    int stringLenght = s.length();
        if(stringLenght< 30)

    {
        System.out.println(quoteLetters(s));
    } else

    {
        System.out.println("Ваша строка больше 30 символов");
    }

}


    public static String quoteLetters(String s)
    {
        return s.replace("A", "@").replace("o", "0").replace("O", "0").replace("a", "@");
    }
}
