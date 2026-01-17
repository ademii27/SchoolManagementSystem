import java.util.Objects;

public abstract class Person {
    private String name;
    private int id;


    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }


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


    public abstract void displayInfo();


    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && name.equals(person.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
