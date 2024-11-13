public class Pet {
    private String type;
    private int age;
    private String breed;
    private double weight;
    private boolean hasOwner;
    private String food;

    // конструктор
    public Pet(String type, int age, String breed, double weight, boolean hasOwner) {
        this.type = type;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        this.hasOwner = hasOwner;
        this.food = determineFood(type);
    }

    // геттры и сеттры
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public String getFood() {
        return food;
    }

    // метод для перевода в человеческие года
    public int calculateAgeInHumanYears() {
        int humanYears = 0;
        if (type.equals("Собака")) {
            humanYears = age * 7;
        } else if (type.equals("Кот")) {
            humanYears = age * 5;
        } else {
            humanYears = age * 3;
        }
        return humanYears;
    }

    // кормление
    public void feed() {
        System.out.println("Кормим " + '\'' + type + '\'' + " С помощью " + '\'' + food + '\'');
    }

    // метод для определения какую еду есть домашнее животное
    private String determineFood(String type) {
        if (type.equals("Собака")) {
            return "Собачья еда";
        } else if (type.equals("Кот")) {
            return "Кошачья еда";
        } else if (type.equals("Птица")) {
            return "Семечки";
        } else {
            return "Неизвестно";
        }
    }

    public String toString() {
        return "Животное{" +
                "Тип='" + type + '\'' +
                ", возраст=" + age +
                ", Порода='" + breed + '\'' +
                ", Размер=" + weight +
                ", Имеется ли хозяин=" + hasOwner +
                ", еда='" + food + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Pet dog = new Pet("Собака", 3, "Золотистый радвильер ", 20, true);
        System.out.println(dog.calculateAgeInHumanYears());
        dog.feed();
        Pet cat = new Pet("Кот", 2, "Сиамский", 10, false);
        System.out.println(cat.calculateAgeInHumanYears());
        cat.feed();
    }
}
