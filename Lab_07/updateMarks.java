class Student {
    int marks;
}


public class updateMarks {


    // method to update marks
    static void updateMarks(Student s) {
        s.marks = 90;   // modifying object data
    }


    public static void main(String[] args) {


        Student s1 = new Student();
        s1.marks = 50;


        System.out.println("Before update: " + s1.marks);


        updateMarks(s1);


        System.out.println("After update: " + s1.marks);
    }
}
