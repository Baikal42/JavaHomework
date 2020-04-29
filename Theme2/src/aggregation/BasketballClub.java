package aggregation;

public class BasketballClub {

    Student student;

    public BasketballClub(Student someStudent) {
        student = someStudent;
    }

    public static void main(String[] args) {
        Student boy = new Student("Вася", 21);
        BasketballClub rangers = new BasketballClub(boy);

    }
}
