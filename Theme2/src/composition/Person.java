package composition;

public class Person {
    Arms arms;
    Body body;
    Head head;
    Legs legs;

    Person() {
        this.arms = new Arms();
        this.body = new Body();
        this.head = new Head();
        this.legs = new Legs();
    }

    @Override
    public String toString() {
        return "Человек";
    }

    public void printPerson() {
        System.out.println(this + "\n" + this.legs + "\n" + this.head + "\n" + this.body + "\n" + this.arms);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.printPerson();

    }
}
