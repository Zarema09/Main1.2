public  class Cat extends Animals implements Printable {
    private String character;

    public String getCharacter() {
        return character;
    }

    public Cat (String name,int age,String breed,ColorEnum color,String character) {
        super(name,age,breed,color);
        this.character= character;
    }



    @Override
    public void print() {
        System.out.println("\nCat:" +getName() +
                "\nage:" + getAge() +
                "\nBreed:" + getBreed() +
                "\nColor:" + getColor() +
                "\nCharacter:" + getCharacter());

    }
}
