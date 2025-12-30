import java.util.Objects;

public abstract class Person {
    private String name;
    private int id;

    // Конструктор
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Абстрактный метод для вывода информации
    public abstract void displayInfo();

    // Переопределение метода toString() для представления объекта в виде строки
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }

    // Переопределение метода equals() для сравнения объектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && name.equals(person.name);
    }

    // Переопределение метода hashCode() для хеширования
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
