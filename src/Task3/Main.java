package Task3;

public class Main {
    public static void main(String[] args) throws NotReadyToStartCookingException {

        Cooking anna = new Cooking("Anna");
        anna.haveIngredients();
        anna.haveSaucePan();
        try {
            anna.cook();
        } catch (NotReadyToStartCookingException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем достают ли все составляющие. Есть ли кастрюля?  " + anna.sausePan + "\r\n Имеются ли все ингредиенты? "
                    + anna.ingredients + "\r\n Включен ли газ? " + anna.gasOn);
        }
        }
    }
