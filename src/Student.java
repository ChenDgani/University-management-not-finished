import java.util.HashMap;
import java.util.HashSet;

public class Student {


    HashSet<course> courses;
    private long id;
    private String name;
    private int age;
    private String degree;

    public int getAge() {
        return age;
    }


    public Student(long id, String name, int age, String degree)
    {
        this.id=id;
        this.name=name;
        this.degree=degree;
        this.age=age;

        courses = new HashSet<>();
    }



    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }

    public boolean equals(Student student)
    {
        if (this.getId() ==student.getId() )
            return true;
        else return false;
    }

    public void insertCourse(course course)
    {
        boolean exist=false;
        for (course num : courses)
        {
            if (num.getNumber() ==course.getNumber())
                exist=true;
        }
        if (exist==false);

        courses.add(course);
    }

    public void deleteCourse(course course)
    {
        boolean exist=false;
        for (course num : courses)
        {
            if (num.getNumber() ==course.getNumber())
                exist=true;
        }
        if (exist==true)
        {
            courses.remove(course);
        }
    }

    public String getCourses()
    {
        String list="";
        int i=1;
        for (course course : courses)
        {
            list += i++ + ". " +  course.getNameOfCourse() + "\n";
        }

        return list;
    }
}
