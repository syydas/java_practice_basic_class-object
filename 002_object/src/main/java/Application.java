import model.Student;
import model.Teacher;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        Student liLy = new Student("李莉", 20, "女");
        System.out.println(liLy.getName());
        System.out.println(liLy.getAge());
        System.out.println(liLy.getGender());
        liLy.study();
        liLy.rest();

        ArrayList<Student> studentList = new ArrayList<>();
        Student wangQi = new Student("王其", 21, "男");
        studentList.add(liLy);
        studentList.add(wangQi);
        Teacher zhangLong = new Teacher("张龙", studentList);
        Student zhaoYi = new Student("赵毅", 22, "男");
        zhangLong.addStudent(zhaoYi);
        zhangLong.getAllStudents();
    }
}
