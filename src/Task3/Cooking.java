package Task3;


public class Cooking {

        String name;
        boolean gasOn;
        boolean sausePan;
        boolean ingredients;

        public Cooking(String name) {
            this.name = name;
        }


        public void gasOn() {
            System.out.println("Газ включен");
            this.gasOn = true;
        }

        public void haveSaucePan() {
            System.out.println("Имеется кастрюля!");
            this.sausePan = true;
        }

        public void haveIngredients() {
            System.out.println("Имеются все ингредиенты");
            this.ingredients = true;
        }

        public void cook() throws NotReadyToStartCookingException {
            if (gasOn && sausePan && ingredients) {
                System.out.println("Ура" + name + "может начинать готовить");
            } else {
                throw new NotReadyToStartCookingException(name + " не готова начинать готовить. Проверьте достают ли все составляющие (включен ли газ, имеется ли в наличии кастрюля и ингредиенты");
            }
        }

    }
