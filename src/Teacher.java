public class Teacher extends Person {
    private String subject;

    // Конструктор
    public Teacher(String name, int id, String subject) {
        super(name, id);  // Вызов конструктора родительского класса
        this.subject = subject;
    }

    // Геттер и сеттер для subject
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Переопределение метода displayInfo() для учителей
    @Override
    public void displayInfo() {
        System.out.println("Teacher - " + toString() + ", Subject: " + subject);
    }
}


