package aggregation;

public class Student {
    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        if(age > 16){
            this.age = age;
        } else {
            System.out.println("Не верно указан возраст");
        }
    }

}
