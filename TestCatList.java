import java.util.*;
public class TestCatList{
    public static void main(String[] args){
        ArrayList<Cat> catList = new ArrayList<Cat>();
        for (int i = 0; i < 4; i++){
            catList.add(new Cat());
        }
        catList.get(0).setName("pumba");
        catList.get(1).setName("mufasa");
        catList.get(2).setName("simba");
        catList.get(3).setName("timon");
        for(Cat myCat: catList){
            myCat.setWeight(Math.random()*10+5);
        }
        System.out.println(catList.get(0).getName() + "'s weight is " + catList.get(0).getWeight());

    }
}