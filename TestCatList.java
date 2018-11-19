import java.util.*;
public class TestCatList{
    public static void main(String[] args){
        ArrayList<Cat> catList = new ArrayList<Cat>(); //creating list of cats
        for (int i = 0; i < 4; i++){
            catList.add(new Cat()); //creating 4 cat objects to add to the list
        }
        catList.get(0).setName("pumba"); //set the cat's name in index 0
        catList.get(1).setName("mufasa");//set the cat's name in index 1
        catList.get(2).setName("simba");//set the cat's name in index 2
        catList.get(3).setName("timon");//set the cat's name in index 3
        for(Cat myCat: catList){ //repeats for each cat in the cat list
            myCat.setWeight(Math.random()*10+5); //generates random number
            System.out.println(myCat.getName() + " weighs " + myCat.getWeight() + " lbs.");
            //prints name & weight of cat for each cat in list
            myCat.meow(); //does meow method for each cat in list
        }
       
    }
}