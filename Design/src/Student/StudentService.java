package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface IStudentService {

    void addStudent(Student student);

    Student getStudentById(int id);

    Student getStudentByName(String name);

    List<Student> getStudentGreaterThanId(int id);

    void updateStudentName(int id, String name);

    void updateAllSalary(int salary);

    void updateSalaryById(int id, int salary);

    List<Student> getAllStudents();
}

class StudentServiceImpl implements IStudentService {

    ArrayList<Student> students = new ArrayList<>();

    public StudentServiceImpl() {
        students.add(new Student(21, "Krupal", 123));
        students.add(new Student(22, "Bhavesh", 123));
        students.add(new Student(23, "Hema", 123));
        students.add(new Student(24, "Sheryl", 123));
        students.add(new Student(25, "Aditi", 123));
        students.add(new Student(26, "Tejas", 123));
        students.add(new Student(27, "Mayur", 123));
        students.add(new Student(28, "Priyank", 123));
        students.add(new Student(29, "Deepesh", 123));
        students.add(new Student(30, "Ankit", 123));
        students.add(new Student(31, "Hitesh", 123));
        students.add(new Student(32, "Sairam", 123));
        students.add(new Student(33, "Jashwanth", 123));
        students.add(new Student(34, "Sukhjinder", 123));
        students.add(new Student(35, "Dharmil", 123));
        students.add(new Student(36, "Disha", 123));
        students.add(new Student(37, "Arman", 123));
        students.add(new Student(38, "Vishal", 123));
        students.add(new Student(39, "Rakshita", 123));
        students.add(new Student(40, "Manasa", 123));
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student getStudentById(int id) {
        return students.stream().filter(s -> s.getId() == id).findAny().orElse(null);
    }

    @Override
    public Student getStudentByName(String name) {
        return students.stream().filter(s -> s.getName().equals(name)).findAny().orElse(null);
    }

    @Override
    public List<Student> getStudentGreaterThanId(int id) {
        return students.stream().filter(s -> s.getId() > id).collect(Collectors.toList());
    }

    @Override
    public void updateStudentName(int id, String name) {
        Student student = students.stream().filter(s -> s.getId() == id).findAny().orElse(null);
        if(student != null)
            student.setName(name);
    }

    @Override
    public void updateAllSalary(int salary) {
        students.stream().forEach(s -> {
            s.setSalary(s.getSalary() + salary);
        });
    }

    @Override
    public void updateSalaryById(int id, int salary) {
        students.stream().filter(s -> s.getId() == id).findAny().ifPresent(s -> s.setSalary(s.getSalary() + salary));
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }
}
