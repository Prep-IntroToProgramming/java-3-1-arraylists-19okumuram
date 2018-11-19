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
        System.out.println("meow meow meow meow");
    }
}
