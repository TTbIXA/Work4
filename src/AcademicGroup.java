import java.util.List;

public class AcademicGroup {

    private Teacher teacher;
    private List<Student> students;

    public AcademicGroup(Teacher teacher, List<Student> students){
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Учебная группа:\n");
        sb.append(teacher.toString() + "\n");
        sb.append("Студенты:\n");
        for (Student student : students) {
            sb.append(student.toString() + "\n");
        }
        return sb.toString();
    }

}

