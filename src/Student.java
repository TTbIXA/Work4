public class Student {

    private String studentId;
    private String name;

    public Student(String studentId, String name){
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId(){
        return studentId;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
