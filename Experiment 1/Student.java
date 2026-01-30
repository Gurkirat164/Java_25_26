public class Student {
    int rollno;
    String name;
    int age;

    Student(int roll, String namee, int agee) {
        rollno = roll;
        name = namee;
        age = agee;
    }

    Student() {
        rollno = 10;
        name = "Raman";
        age = 20;
    }

    public void display(int rollno, String name, int age) {
        System.out.println(rollno + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Student s1 = new Student(1, "Gagan", 21);
        Student s2 = new Student();

        s1.display(s1.rollno, s1.name, s1.age);
        s2.display(s2.rollno, s2.name, s2.age);
    }
}
