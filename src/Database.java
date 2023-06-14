import java.util.Vector;

import Model.*;

public class Database {
    public static Vector<Course> allCourses = new Vector<Course>(0);
    public static Vector<AcademicOfficer> allAO = new Vector<AcademicOfficer>(0);
    public static Vector<Student> allStu = new Vector<Student>(0);
    public static Vector<Lecturer> allProfs = new Vector<Lecturer>(0);
    public Database(){
        allStu.add(new Student("Lim Sha Kai", "A21EC4058"));
        allStu.add(new Student("Muhammad Farhan", "A21EC4059"));
        allStu.add(new Student("Nurul Amani", "A21EC4060"));
        allStu.add(new Student("Ahmad bin Iskandar", "A21EC4061"));
        allStu.add(new Student("Siti Nurul Huda", "A21EC4062"));
        allStu.add(new Student("Abdul Rahman", "A21EC4063"));
        allStu.add(new Student("Norazlin binti Mohd", "A21EC4064"));
        allStu.add(new Student("Ahmad Nazri", "A21EC4065"));
        allStu.add(new Student("Nurul Aqilah", "A21EC4066"));
        allStu.add(new Student("Muhammad Azwan", "A21EC4067"));
        allStu.add(new Student("Nurul Huda", "A21EC4068"));
        allStu.add(new Student("Ahmad bin Ibrahim", "A21EC4069"));
        allStu.add(new Student("Siti Aisyah", "A21EC4070"));
        allStu.add(new Student("Abdul Hamid", "A21EC4071"));
        allStu.add(new Student("Noraziah binti Mohd", "A21EC4072"));
        allStu.add(new Student("Ahmad Zahir", "A21EC4073"));
        allStu.add(new Student("Nurul Izzah", "A21EC4074"));
        allStu.add(new Student("Muhammad Azim", "A21EC4075"));
        allStu.add(new Student("Nurul Amanina", "A21EC4076"));
        allStu.add(new Student("Ahmad bin Hassan", "A21EC4077"));
        allStu.add(new Student("Siti Norhafizah", "A21EC4078"));
        allStu.add(new Student("Abdul Ghani", "A21EC4079"));
        allStu.add(new Student("Norazlina binti Mohd", "A21EC4080"));
        allStu.add(new Student("Ahmad Faisal", "A21EC4081"));
        allStu.add(new Student("Nurul Fatin", "A21EC4082"));
        allStu.add(new Student("Muhammad Faris", "A21EC4083"));
        allStu.add(new Student("Nurul Aqilah", "A21EC4084"));
        allStu.add(new Student("Ahmad bin Hussain", "A21EC4085"));
        allStu.add(new Student("Siti Maisarah", "A21EC4086"));
        allStu.add(new Student("Abdul Hadi", "A21EC4087"));
        allStu.add(new Student("Norazlina binti Mohd", "A21EC4088"));
        allStu.add(new Student("Ahmad Zaidi", "A21EC4089"));
        allStu.add(new Student("Nurul Hidayah", "A21EC4090"));
        allStu.add(new Student("Muhammad Azri", "A21EC4091"));
        allStu.add(new Student("Nurul Aina", "A21EC4092"));
        allStu.add(new Student("Ahmad bin Jalaluddin", "A21EC4093"));
        allStu.add(new Student("Siti Mariam", "A21EC4094"));
        allStu.add(new Student("Abdul Hakim", "A21EC4095"));
        allStu.add(new Student("Norazlina binti Mohd", "A21EC4096"));
        allStu.add(new Student("Ahmad Rosli", "A21EC4097")); 
        allAO.add(new AcademicOfficer("Mohammad Kiwasa","MohaKiwas23@admin.utm.my"));
        allAO.add(new AcademicOfficer("Siti Nurul Aini", "sitinurulaini@admin.utm.my"));
        allAO.add(new AcademicOfficer("Ahmad bin Ismail", "ahmadismail@admin.utm.my"));
        allAO.add(new AcademicOfficer("Nurul Huda binti Abdullah", "nurulhudaabdullah@admin.utm.my"));
        allAO.add(new AcademicOfficer("Muhammad Zulkarnain", "mzulkarnain@admin.utm.my"));       
        allProfs.add(new Lecturer("Ahmad bin Ismail", "FC001P"));
        allProfs.add(new Lecturer("Siti Nurul Aini", "FC002N"));
        allProfs.add(new Lecturer("Muhammad Zulkarnain", "FC003I"));
        allProfs.add(new Lecturer("Nurul Huda binti Abdullah", "FC004P"));
        allProfs.add(new Lecturer("Nurul Izzah binti Mohd", "FC011N"));
        allProfs.add(new Lecturer("Ahmad Zahir", "FC012I"));
        allProfs.add(new Lecturer("Siti Maisarah", "FC013P"));
        allProfs.add(new Lecturer("Abdul Hadi", "FC014N"));
        allProfs.add(new Lecturer("Norazlina binti Mohd", "FC015I"));
        allProfs.add(new Lecturer("Bob Williams", "FC008N"));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 1, "Computing", 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 2, "Computing", 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 3, "Computing", 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 4, "Computing", 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 5, "Computing", 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 1, "Computing", 4));
        allCourses.add(new Course("Web Programming", "SECV2154", 1, "Computing", 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 2, "Computing", 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 3, "Computing", 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 4, "Computing", 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 5, "Computing", 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 6, "Computing", 3));
        allCourses.get(0).addStudent(allStu.get(0), false);
        allCourses.get(0).addStudent(allStu.get(1), false);
        allCourses.get(0).addStudent(allStu.get(2), false);
        allCourses.get(0).addStudent(allStu.get(3), false);
        allCourses.get(0).addStudent(allStu.get(4), false);
        allCourses.get(0).addStudent(allStu.get(5), false);
    }
    public static void Declare_All_Variables(){

    }
}
