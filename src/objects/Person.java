package objects;

/**
 * Created by Kyle on 5/28/2017.
 *
 * Create a person object with a name, age, and height
 * Create 3 people: Joe, Kyle, Zach with a random age and height
 * Ages range from 20-40
 * Heights range from 5-7
 * Store all people in an array
 * Print the person with the largest age and height
 * Eg: Kyle is the tallest (7)
 */
public class Person {
    
    private final String name;
    private final int age;
    private final double height;
    
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getHeight() {
        return height;
    }
}

class Main {
    public static void main(String[] args) {
        Person kyle = makePerson("Kyle");
        Person joe = makePerson("Joe");
        Person zach = makePerson("Zach");
        
        Person[] people = new Person[]{kyle, joe, zach};
        Person oldest = getLargestAge(people);
        Person tallest = getLargestHeight(people);
        
        System.out.println(
                "The oldest person is " + oldest.getName() + " (" + oldest.getAge() + ")");
        System.out.println(
                "The tallest person is " + tallest.getName() + " (" + tallest.getHeight() + ")");
    }
    
    private static Person makePerson(String name) {
        return new Person(name, (int) (Math.random() * 20 + 20), Math.random() * 2 + 5);
    }
    
    private static Person getLargestAge(Person[] people) {
        Person oldest = people[0];
        for (int i = 1; i < people.length; i++) {
            Person temp = people[i];
            if (temp.getAge() > oldest.getAge()) {
                oldest = temp;
            }
        }
        return oldest;
    }
    
    private static Person getLargestHeight(Person[] people) {
        Person tallest = people[0];
        for (int i = 1; i < people.length; i++) {
            Person temp = people[i];
            if (temp.getHeight() > tallest.getHeight()) {
                tallest = temp;
            }
        }
        return tallest;
    }
}
