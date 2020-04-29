package getterSetter;

public class JavaDeveloper {
    private String name;
    private int age;
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Слишком молодой");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("м")) {
            this.sex = "мужской";
        } else if (sex.equals("ж")) {
            this.sex = "женский";
        } else
            System.out.println("Некорректный ввод, используй м или ж");
    }

    @Override
    public String toString() {
        return "Имя программиста: " + this.name + "\n" +
                "Возраст программиста: " + this.age + "\n" +
                "Пол программиста: " + this.sex;
    }
}
