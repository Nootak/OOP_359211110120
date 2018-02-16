package ooplab9;

import jdk.nashorn.internal.scripts.JO;

public class personApp {

    public static void main(String[] args) {
        Person person = new Person("Jutharat Kaewpradit", 23,
                new Address("71", "Nakhornsithammarat",
                        "80000"),
                new Job("Student", 30000));
        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary(30000);
        System.out.println(person.getJob().getPosition());
        System.out.println(person.getJob().getSalary());








    }
}