public class Student extends Person {
    int StudyLevel;
    String specialization;
    double GPA;

    public Student(int studyLevel, String specialization, double GPA) {
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

        Student student1 = new Student();


    }

}

