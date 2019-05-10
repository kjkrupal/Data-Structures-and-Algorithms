package Student;

public class Student implements Comparable{

    private int id;
    private String name;
    private int salary;

    public Student(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student) {
            if(this.id < ((Student) o).id)
                return -1;

            else if(this.id > ((Student) o).id)
                return 1;

            else return 0;
        }

        return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o instanceof Student){
            if(this.id == ((Student) o).id)
                return true;
        }
        return false;
    }


    @Override
    public int hashCode(){
        return this.id * 31;
    }

}
