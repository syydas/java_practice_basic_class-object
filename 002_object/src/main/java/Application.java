import model.Student;

public class Application {

    public static void main(String[] args) {

        Student lily = new Student("李莉", 20, "女");
        System.out.println(lily.getName());
        System.out.println(lily.getAge());
        System.out.println(lily.getGender());
        lily.study();
        lily.rest();
    }
}
