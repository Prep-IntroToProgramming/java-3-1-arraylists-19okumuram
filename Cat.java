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
        if (newWeight < 0.0){
            weight = newWeight; //you cant have a negative weight
        } else {
            throw new RuntimeException();
        }
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
