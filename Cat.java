public class Cat {
    private String name; //declaring private variable
    private double weight; //declaring private variable
    String getName(){
        return name; // allows user to access name
    }

    void setName(String newName){
        name = newName;
    }

    double getWeight(){
        return weight; // allows user to access weight
    }

    void setWeight(double newWeight){
        weight = newWeight;
    }

    public Cat (){

    }

    public Cat(String xName){
        name = xName;
    }

    public void meow(){
        if (weight < 4){
            System.out.println("meow");
        } else if ((weight >= 4) && (weight < 8)){
            System.out.println("meow meow");
        } else if ((weight >= 8) && (weight < 12)){
            System.out.println("meow meow meow. gimmme food");
        } else {
            System.out.println("MEOW MEOW MEOW MEOW I WANT FOOD HOOMAN");
        }
    }
}
