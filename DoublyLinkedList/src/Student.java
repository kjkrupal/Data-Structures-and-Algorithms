import java.util.Objects;

public class Student {

    private String name;
    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }

    @Override
    public String toString() {
        return "Student {" +
                "Name = '" + name + '\'' +
                ", Student ID = " + id +
                '}';
    }

}
