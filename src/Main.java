import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student = new Student(1907,"John Doe",75);

        GenericBox<Integer> studentNo = new GenericBox<>();
        studentNo.setContent(student.getStudentNo());

        GenericBox<String> studentName = new GenericBox<>();
        studentName.setContent(student.getName());

        GenericBox<Integer> studentGrade = new GenericBox<>();
        studentGrade.setContent(student.getGrade());

        System.out.println(studentNo.getContent() + " " + studentName.getContent() + " " + studentGrade.getContent());
        System.out.println();
        System.out.println("*********************");
        System.out.println();
        List<String> text = Arrays.asList("ahmet", "mehmet", "serkan", "mahir");

        System.out.println("Arama Sonucu : " + FindElement(text,"mahir"));
    }

    public static String FindElement(List<String> searchedText, String searchCriteria) {
        return searchedText.stream()
                .filter(criteria -> criteria.equals(searchCriteria)).findFirst().orElse("-1");
    }
}