public class course {

    private int number;
    private String nameOfCourse;
    private int numOfStudents;
    private String nameOfManager;

    public course(int number, String nameOfCourse, int numOfStudents, String nameOfManager) {
        this.number = number;
        this.nameOfCourse = nameOfCourse;
        this.numOfStudents = numOfStudents;
        this.nameOfManager = nameOfManager;
    }

    public int getNumber() {
        return number;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public String getNameOfManager() {
        return nameOfManager;
    }

    @Override
    public String toString() {
        return "course{" +
                "number=" + number +
                ", nameOfCourse='" + nameOfCourse + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", nameOfManager=" + nameOfManager +
                '}';
    }

    public boolean equals(course course)
    {
        if (this.getNumber() == course.getNumber())
            return true;
        else return false;
    }
}
