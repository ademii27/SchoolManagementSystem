public class Student extends Person {
    private String grade;
    private int age;


    public Student(String name, int id, String grade, int age) {
        super(name, id);  // Вызов конструктора родительского класса
        this.grade = grade;
        this.age = age;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void displayInfo() {
        System.out.println("Student - " + toString() + ", Grade: " + grade + ", Age: " + age);
    }
}
