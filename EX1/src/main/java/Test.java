public class Test {
    public static void main(String args[]) {

        fonctionnelle<Integer> addition_int = (a, b) -> a + b;
        fonctionnelle<Double> addition_Double = (a, b) -> a + b;
        fonctionnelle<String> addition_String = (a, b) -> a + b;
        fonctionnelle<Long> addition_Long= (a, b) -> a + b;


        System.out.println(" 11 + 3 = " + addition_int.somme(11, 3));

    }

}
