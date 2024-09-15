import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("1", "Петров Иван");

        List<Student> students = new ArrayList<>();
        students.add(new Student("1", "Иванов Илья"));
        students.add(new Student("2", "Курицын Евгений"));
        students.add(new Student("3", "Кузнецова Ольга"));

        AcademicGroupService academicGroupService = new AcademicGroupService();
        AcademicGroup group = academicGroupService.createAcademicGroup(teacher, students);

        System.out.println(group);
    }

}