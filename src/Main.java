import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных для первого студента
        System.out.print("Enter Student 1 name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Student 1 ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();  // Поглощаем лишний символ новой строки
        System.out.print("Enter Student 1 grade: ");
        String studentGrade = scanner.nextLine();
        System.out.print("Enter Student 1 age: ");
        int studentAge = scanner.nextInt();

        // Создание студента
        Student student1 = new Student(studentName, studentId, studentGrade, studentAge);

        // Ввод данных для второго студента
        scanner.nextLine(); // Поглощаем лишний символ новой строки
        System.out.print("Enter Student 2 name: ");
        String studentName2 = scanner.nextLine();
        System.out.print("Enter Student 2 ID: ");
        int studentId2 = scanner.nextInt();
        scanner.nextLine();  // Поглощаем лишний символ новой строки
        System.out.print("Enter Student 2 grade: ");
        String studentGrade2 = scanner.nextLine();
        System.out.print("Enter Student 2 age: ");
        int studentAge2 = scanner.nextInt();

        // Создание второго студента
        Student student2 = new Student(studentName2, studentId2, studentGrade2, studentAge2);

        // Ввод данных для учителя
        scanner.nextLine();  // Поглощаем лишний символ новой строки
        System.out.print("Enter Teacher name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter Teacher ID: ");
        int teacherId = scanner.nextInt();
        scanner.nextLine();  // Поглощаем лишний символ новой строки
        System.out.print("Enter Teacher subject: ");
        String subject = scanner.nextLine();

        // Создание учителя
        Teacher teacher = new Teacher(teacherName, teacherId, subject);

        // Создание школы
        School school = new School("AITU School");

        // Добавление людей в школу
        school.addPerson(student1);
        school.addPerson(student2);
        school.addPerson(teacher);

        // Печать всех людей в школе
        school.displayAllPeople();

        // Сортировка людей по имени
        System.out.println("\nSorting people by name:");
        school.sortPeopleByName();
        school.displayAllPeople();

        // Фильтрация студентов по оценке
        System.out.println("\nFiltering students with grade A:");
        school.filterStudentsByGrade("A");

        scanner.close();
    }
}

