package Task3;

public class Main {
    public static void main(String[] args) throws NotReadyToStartCookingException {

        Cooking anna = new Cooking("Anna");
        anna.haveIngredients();
        anna.haveSaucePan();
        anna.cook();
    }
}
