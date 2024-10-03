public   class  Horse extends Animals implements Printable {
    private int speed;

    public int getSpeed() {
        return speed;
    }
    public Horse (String name,int age,String breed,ColorEnum color,int speed) {
        super(name,age,breed,color);
        this.speed = speed;
    }

    @Override
    public void print() {
        System.out.println("\nHorse:" +getName() +
                "\nage:" + getAge() +
                "\nBreed:" + getBreed() +
                "\nColor:" + getColor() +
                "\nSpeed:" + getSpeed());
    }
}
