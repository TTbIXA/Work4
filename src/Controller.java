import java.util.List;
import java.util.stream.Collectors;

public class Controller extends AcademicGroupService {

    private AcademicGroupService academicGroupService;

    public Controller(AcademicGroupService academicGroupService){
        this.academicGroupService = academicGroupService;
    }

    public List<String> getStudentId(List<Student> students){
        return students.stream()
                .map(Student :: getStudentId)
                .collect(Collectors.toList());
    }

    public String getTeacherId(Teacher teacher){
        return teacher.getTeacherId();
    }
}
