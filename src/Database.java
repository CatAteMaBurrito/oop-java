import java.util.Vector;

import Model.*;

public class Database {
    public static Vector<Course> allCourses = new Vector<Course>(0);
    public static Vector<AcademicOfficer> allAO = new Vector<AcademicOfficer>(0);
    public static Vector<Student> allStu = new Vector<Student>(0);
    public static Vector<Lecturer> allProfs = new Vector<Lecturer>(0);

    public Database() {
        allStu.add(new Student("Muhammad Hafiz", Faculty.ELECTRICAL, "A21EC4060"));
        allStu.add(new Student("Lee Mei Ling", Faculty.CIVIL, "A21EC4061"));
        allStu.add(new Student("Rajesh Kumar", Faculty.MECHANICAL, "A21EC4062"));
        allStu.add(new Student("Nurul Azizah", Faculty.BIOMEDICAL, "A21EC4063"));
        allStu.add(new Student("Lim Wei Jie", Faculty.AGRICULTURAL, "A21EC4064"));
        allStu.add(new Student("Tan Mei Hui", Faculty.CHEMICAL, "A21EC4065"));
        allStu.add(new Student("Shankar Nair", Faculty.PHYSICS, "A21EC4066"));
        allStu.add(new Student("Siti Aishah", Faculty.BIOLOGY, "A21EC4067"));
        allStu.add(new Student("Ahmad Iskandar", Faculty.MATHAMATICS, "A21EC4068"));
        allStu.add(new Student("Wong Li Yin", Faculty.ELECTRICAL, "A21EC4069"));
        allStu.add(new Student("Vijay Singh", Faculty.CIVIL, "A21EC4070"));
        allStu.add(new Student("Noraini Abdullah", Faculty.MECHANICAL, "A21EC4071"));
        allStu.add(new Student("Syed Amirul", Faculty.BIOMEDICAL, "A21EC4072"));
        allStu.add(new Student("Chin Yee Wen", Faculty.AGRICULTURAL, "A21EC4073"));
        allStu.add(new Student("Prakash Patel", Faculty.CHEMICAL, "A21EC4074"));
        allStu.add(new Student("Siti Aminah", Faculty.PHYSICS, "A21EC4075"));
        allStu.add(new Student("Zulkifli Mohd", Faculty.BIOLOGY, "A21EC4076"));
        allStu.add(new Student("Lau Siew Ling", Faculty.MATHAMATICS, "A21EC4077"));
        allStu.add(new Student("Ganesh Pillai", Faculty.ELECTRICAL, "A21EC4078"));
        allStu.add(new Student("Nurul Aisyah", Faculty.CIVIL, "A21EC4079"));
        allStu.add(new Student("Rahim Hamzah", Faculty.MECHANICAL, "A21EC4080"));
        allStu.add(new Student("Chong Mei Ling", Faculty.BIOMEDICAL, "A21EC4081"));
        allStu.add(new Student("Krishna Menon", Faculty.AGRICULTURAL, "A21EC4082"));
        allStu.add(new Student("Pooja Sharma", Faculty.CHEMICAL, "A21EC4083"));
        allStu.add(new Student("Ahmad Faizal", Faculty.PHYSICS, "A21EC4084"));
        allStu.add(new Student("Lim Su Yin", Faculty.BIOLOGY, "A21EC4085"));
        allStu.add(new Student("Ravi Chandran", Faculty.MATHAMATICS, "A21EC4086"));
        allStu.add(new Student("Norazura Ismail", Faculty.ELECTRICAL, "A21EC4087"));
        allStu.add(new Student("Kamarul Azman", Faculty.CIVIL, "A21EC4088"));
        allStu.add(new Student("Wong Li Na", Faculty.MECHANICAL, "A21EC4089"));
        allAO.add(new AcademicOfficer("Mohammad Kiwasa", Faculty.COMPUTING, "MohaKiwas23@admin.utm.my"));
        allAO.add(new AcademicOfficer("Siti Nurul Aini", Faculty.CHEMICAL, "sitinurulaini@admin.utm.my"));
        allAO.add(new AcademicOfficer("Ahmad bin Ismail", Faculty.ELECTRICAL, "ahmadismail@admin.utm.my"));
        allAO.add(new AcademicOfficer("Nurul Huda binti Abdullah", Faculty.CIVIL, "nurulhudaabdullah@admin.utm.my"));
        allAO.add(new AcademicOfficer("Muhammad Zulkarnain", Faculty.MECHANICAL, "mzulkarnain@admin.utm.my"));
        allProfs.add(new Lecturer("Ahmad bin Ismail", Faculty.COMPUTING, "FC001P"));
        allProfs.add(new Lecturer("Siti Nurul Aini", Faculty.CHEMICAL, "FC002N"));
        allProfs.add(new Lecturer("Muhammad Zulkarnain", Faculty.ELECTRICAL, "FC003I"));
        allProfs.add(new Lecturer("Nurul Huda binti Abdullah", Faculty.CIVIL, "FC004P"));
        allProfs.add(new Lecturer("Nurul Izzah binti Mohd", Faculty.COMPUTING, "FC011N"));
        allProfs.add(new Lecturer("Ahmad Zahir", Faculty.CHEMICAL, "FC012I"));
        allProfs.add(new Lecturer("Siti Maisarah", Faculty.ELECTRICAL, "FC013P"));
        allProfs.add(new Lecturer("Abdul Hadi", Faculty.CIVIL, "FC014N"));
        allProfs.add(new Lecturer("Norazlina binti Mohd", Faculty.COMPUTING, "FC015I"));
        allProfs.add(new Lecturer("Bob Williams", Faculty.CHEMICAL, "FC008N"));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 1, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 2, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 3, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 4, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 5, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 1, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Web Programming", "SECV2154", 1, Faculty.COMPUTING, 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 2, Faculty.COMPUTING, 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 3, Faculty.COMPUTING, 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 4, Faculty.COMPUTING, 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 5, Faculty.COMPUTING, 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 6, Faculty.COMPUTING, 3));
        allCourses.get(0).addStudent(allStu.get(0), false);
        allCourses.get(0).addStudent(allStu.get(1), false);
        allCourses.get(0).addStudent(allStu.get(2), false);
        allCourses.get(0).addStudent(allStu.get(3), false);
        allCourses.get(0).addStudent(allStu.get(4), false);
        allCourses.get(0).addStudent(allStu.get(5), false);
    }

    public static void Declare_All_Variables() {

    }
}
