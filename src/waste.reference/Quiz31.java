class Student {
    String stName;
    int crHrs;
    double stGpa;

    public Student(String stName, int crHrs, double stGpa) {
        this.stName = stName;
        this.crHrs = crHrs;
        this.stGpa = stGpa;
    }

}

public class Quiz31 {
    public static void main(String[] args) {
        Student s1 = new Student("John Smith", 9, 3.30);

        System.out.println(s1);
    }
}
