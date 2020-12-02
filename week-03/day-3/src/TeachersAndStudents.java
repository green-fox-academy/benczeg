public class TeachersAndStudents {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        var student = new Student();

        student.question(teacher);
        teacher.teach(student);
    }
}
