public class Student {
    // - `learn()` -> prints the student is learning something new
    //        - `question(teacher)` -> calls the teachers answer method

    public void learn() {
        System.out.println("Learning something new...");
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }
}
