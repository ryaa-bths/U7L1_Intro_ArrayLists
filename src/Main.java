import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*
//q#1
        ArrayList<String> trees = new ArrayList<String>();
        trees.add("pine");
        trees.add("maple");
        trees.add("frasier fir");
        System.out.println(trees + "\n" + trees.size());
//q#2
        System.out.println(trees.get(1));
//q#4
        ArrayList<String> names = new ArrayList<String>();
        names.add("Benji");
        names.add("Andy");
        String[] moreNames = {"Crystal", "Monica", "Toby"};
        int lengths =  names.size() + moreNames.length + names.get(0).length() + moreNames[0].length();
        System.out.println(lengths);
//q#5 cat&dog class
        Cat koopa = new Cat("Koopa");
        ArrayList<Cat> cat = new ArrayList<Cat>();
        cat.add(koopa);
        cat.add(new Cat("tails"));
        cat.add(new Cat("bag"));
        cat.add(new Cat("fly"));
        Cat newCat = new Cat("Twotails");
        cat.set(2, newCat);//actually returns something (an element of type e) (.set(index, E element))
        //q#6
        cat.get(1).setName("Archie");
        System.out.println(cat.toString());

        //q#7

        ArrayList<Dog> dogList = new ArrayList();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.get(0).bark();

 */
        Integer num1 = new Integer(5);
        Integer num2 = 10;
        int num3 = 15;

        ArrayList<Integer> numList = new ArrayList<Integer>();

        numList.add(num1);
        numList.add(num2);
        numList.add(num3);

        int sum = num1 + num2 + num3;

        numList.add(sum);

        System.out.println(numList);


    }
}