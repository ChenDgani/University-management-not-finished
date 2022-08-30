import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Univer {

    HashSet<Student> students;

    public Univer()
    {
        students = new HashSet<Student>();
    }

    public void insert(Student student)
    {

            students.add(student);

    }

    public int numOfStu()
    {
        int sum=0;
        for (Student student1 : students)
        {
            sum++;
        }
        return sum;
    }

    public String toString() {
        String uni = "";

            int i = 1;
            for (Student student1 : students) {
                uni += i++ + "." + student1.toString() + "\n";
            }

        return uni;
    }

    public void delete(Student student)
    {
            for (Student student1 : students) {
                if (student.getId() == student1.getId())
                    students.remove(student);
            }

    }




}
