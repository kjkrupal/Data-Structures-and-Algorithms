package Student;

import java.util.*;

public class Implementation {

    public static void main(String[] args) {

        IStudentService ss = new StudentServiceImpl();

        System.out.println(ss.getStudentGreaterThanId(30));

        ss.updateAllSalary(10);
    }

}
