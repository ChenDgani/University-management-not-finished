public class Tester {

    public static void main  (String[] args)
    {
        Univer univer = new Univer();
       Student chen = new Student(318422946,"chen",25,"Computers");
       Student edo = new Student(318511664,"edo",25,"economics");

       chen.insertCourse(new course(2014,"Infi",50,"Vadim"));
       chen.insertCourse(new course(123,"Lin",100,"Nati"));
       chen.insertCourse(new course(1244,"Bsisi",30,"yehuran"));

        univer.insert(chen);
        univer.insert(edo);
        univer.delete(chen);
        System.out.println(univer);
        System.out.println(univer.numOfStu());

        System.out.println(chen.getCourses());



    }
}
