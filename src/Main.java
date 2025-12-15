public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Aruzhan", 16);
        Student student2 = new Student(2, "Dias", 17);

        Teacher teacher = new Teacher("Mr. Ivanov", "Mathematics");

        School school1 = new School("AITU School", student1, teacher);
        School school2 = new School("AITU School", student2, teacher);

        System.out.println(school1);
        System.out.println(school2);

        if (student1.getAge() > student2.getAge()) {
            System.out.println(student1.getName() + " is older");
        } else {
            System.out.println(student2.getName() + " is older");
        }
    }
}

