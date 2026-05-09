import java.util.Scanner;

public class Student extends Person {
    int StudyLevel;
    String specialization;
    double GPA;

    Scanner sr = new Scanner(System.in);

    public Student() {
        int studyLevel;
        StudyLevel = studyLevel;
        this.specialization = specialization;
        this.GPA = GPA;
    }

    public Student(String name, Double age, String address, String nationality, int studyLevel, String specialization, double GPA) {
        super(name, age, address, nationality);
        StudyLevel = studyLevel;
        this.specialization = specialization;
        this.GPA = GPA;
    }


    public static void main(String[] args){

       // Student student1 = new Student("Ahmed", 21.3, "Muscat", "Omani", 2, "IT", 3.44);

        Student student1 = new Student();
        student1

        System.out.println(student1.getName());


    }

}

