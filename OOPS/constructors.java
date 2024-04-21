public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "deepak";
        s1.rollno = 121;
        

        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.rollno);
    }
}

class Student {
    String name;
    int rollno;
    int marks[] = new int[3];

    Student(Student s1) {
        this.name = s1.name;
        this.rollno = s1.rollno;
    }

    Student() {
        System.out.println("CONSRTUCTOR WAS CALLED");
    }
}
