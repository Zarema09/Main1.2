public  class Dog extends Animals implements Printable{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public Dog(String name , int age, String breed, ColorEnum color, double weight) {
        super(name,age,breed,color);
        this.weight= weight;
}

    @Override
    public void print() {
        System.out.println("\nDog:" +getName() +
                "\nage:" + getAge() +
        "\nBreed:" + getBreed() +
                "\nColor:" + getColor() +
                "\nWeight:" + getWeight());
    }
}
