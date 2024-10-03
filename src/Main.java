public class Main {
    public static void main(String[] args) {
        Animals[] objects = new Animals[3];
        objects[0] = createObject("2й");
        objects[1] = createObject("3й");
        objects[2] = createObject("4й");
        for (Animals object : objects) {
            if (object instanceof Printable) {
                Printable printable = (Printable) object;
                printable.print();
            }
        }
    }

  public static Animals createObject(String className){
      switch (className){
          case "2й":
              return new Dog("Pit",2,"decorDog",ColorEnum.RED,3.5);
          case "3й":
              return new Cat("Murka",3,"Sfinks",ColorEnum.BLACK,"friendly");
          case "4й":
              return new Horse("Rex",6,"sportHorse",ColorEnum.GREY,90);
          default:
              return null;
      }
        }

    }
