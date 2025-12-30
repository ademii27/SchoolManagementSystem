import java.util.*;

public class School {
    private String schoolName;
    private List<Person> people;  // Храним студентов и учителей

    // Конструктор
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.people = new ArrayList<>();
    }

    // Геттер для schoolName
    public String getSchoolName() {
        return schoolName;
    }

    // Метод для добавления людей в школу
    public void addPerson(Person person) {
        people.add(person);
    }

    // Метод для отображения всех людей в школе
    public void displayAllPeople() {
        System.out.println("People in " + schoolName + ":");
        for (Person person : people) {
            person.displayInfo();  // Выводим информацию о человеке
        }
    }

    // Метод для поиска человека по ID
    public void searchPersonById(int id) {
        for (Person person : people) {
            if (person.getId() == id) {
                person.displayInfo();  // Если нашли, выводим информацию
                return;
            }
        }
        System.out.println("Person with ID " + id + " not found.");  // Если не нашли
    }

    // Сортировка людей по имени
    public void sortPeopleByName() {
        Collections.sort(people, Comparator.comparing(Person::getName));
    }

    // Фильтрация студентов по оценке
    public void filterStudentsByGrade(String grade) {
        for (Person person : people) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.getGrade().equals(grade)) {
                    student.displayInfo();  // Печать информации о студенте
                }
            }
        }
    }
}

