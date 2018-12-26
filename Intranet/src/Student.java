import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class Student extends User implements Serializable {
    private TreeMap<Course, Mark> studentInfo;
    private int yearOfStudy;
    private String faculty;
    private String speciality;
    private double gpa;

    Student() {
    }

    Student(String name, String faculty, String login) {
        this.faculty = faculty;
        this.name = name;
        this.login = login;
    }

    Student(String surname, String name, String login, String password, String id, int yearOfStudy, String faculty, String speciality, double gpa) {
        super(surname, name, login, password, id);
        this.faculty = faculty;
        this.speciality = speciality;
        this.gpa = gpa;
        this.studentInfo = studentInfo;
        this.yearOfStudy = yearOfStudy;
    }

    Student(User u, int yearOfStudy, String faculty, String speciality, double gpa) {
        super(u, u.getLogin(), u.getPassword(), u.getId());
        this.faculty = faculty;
        this.speciality = speciality;
        this.gpa = gpa;
        this.studentInfo = studentInfo;
    }

    public void viewCourses() {
        for (Map.Entry<Course, Mark> entry : this.studentInfo.entrySet()) {
            String course = entry.getKey().getName();
            System.out.println(course + " \n");
        }
    }

    public void save(Vector<Student> v) {
        try {
            FileOutputStream f = new FileOutputStream("textbooks.out");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(v);
            o.close();
            f.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public String viewTranscript() {
        return "";
    }
    public String getName()
    {
        return name;
    }
    public String getLogin()
    {
        return login;
    }
    public String getFaculty() {
        return faculty;
    }

}
