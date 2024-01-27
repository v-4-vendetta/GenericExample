public class Student {
    private int studentNo;
    private String name;
    private int grade;

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public Student(int studentNo, String name, int grade){
        this.studentNo=studentNo;
        this.name=name;
        this.grade=grade;
    }
}
