import java.util.List;

public class AcademicGroupService {
    public AcademicGroup createAcademicGroup(Teacher teacher, List<Student> students){
        return new AcademicGroup(teacher, students);
    }
}
