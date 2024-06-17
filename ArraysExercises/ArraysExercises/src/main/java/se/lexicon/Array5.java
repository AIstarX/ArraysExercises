package se.lexicon;

public class Array5{
    public static void main(String[] args) {
        String[][] countriesAndCities = {
                {"France", "Paris"},
                {"Sweden", "Stockholm"}
        };

        for (String[] pair : countriesAndCities) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
