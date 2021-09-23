//public class Main {
//    public static void main(String[] args) {
//
//        Course mat = new Course("Matematik", "MAT101", "MAT");
//        Course fizik = new Course("Fizik", "FZK101", "FZK");
//        Course kimya = new Course("Kimya", "KMY101", "KMY");
//
//        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
//        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
//        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");
//
//        mat.addTeacher(t1);
//        fizik.addTeacher(t2);
//        kimya.addTeacher(t3);
//
//        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
//        s1.addBulkExamNote(50,20,40);
//        s1.isPass();
//
//        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
//        s2.addBulkExamNote(100,50,40);
//        s2.isPass();
//
//        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
//        s3.addBulkExamNote(50,20,40);
//        s3.isPass();
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
//        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
//        Ring r = new Ring(marc,alex , 90 , 100);
//        r.run();
//    }
//}


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("esra", 2000.0,45, 1985);
        employee.bonus();
        employee.riseSalary();
        employee.tax();
        employee.showInfo();

        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[]{215, 234, 218, 189, 221, 290};

        for (int score : scores) {
            System.out.print(score + "  ");
        }
    }
}