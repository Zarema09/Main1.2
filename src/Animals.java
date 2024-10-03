public class Animals {
    private String name;
    private int age;
    private String breed;
    private ColorEnum color;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public ColorEnum getColor() {
        return color;
    }
public Animals(String name, int age, String breed, ColorEnum color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
}
}
