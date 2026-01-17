public class Teacher extends Person {
    private String subject;


    public Teacher(String name, int id, String subject) {
        super(name, id);  // Вызов конструктора родительского класса
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    @Override
    public void displayInfo() {
        System.out.println("Teacher - " + toString() + ", Subject: " + subject);
    }
}


