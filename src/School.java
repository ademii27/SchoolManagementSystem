public class School {
    private String schoolName;
    private Student student;
    private Teacher teacher;

    public School(String schoolName, Student student, Teacher teacher) {
        this.schoolName = schoolName;
        this.student = student;
        this.teacher = teacher;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "School{name='" + schoolName + "', student=" + student + ", teacher=" + teacher + "}";
    }
}

