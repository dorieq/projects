//package realization;
import com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages_zh_CN;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;

public class Course implements Serializable {
    private String name;
    private String id;
    private int credits;
    private String faculty;
    private Vector<Teacher> teachers;
    private Vector<Student> students;
    private Vector<CourseFile> courseFiles;
    public void save(Vector<Course> v){
        try {
            FileOutputStream f = new FileOutputStream("textbooks.out");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(v);
            o.close();
            f.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    Course(String name, Vector<Student> students, Vector<Teacher> teachers)
    {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }
    Course(){}
    Course(String name, String id, int credits, String faculty, Vector<Teacher> teachers,Vector<Student> students){
        this.name = name;
        this.id = id;
        this.credits = credits;
        this.faculty = faculty;
        this.teachers = teachers;
        this.students = students;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public void setTeachers(Vector<Teacher> teachers){
        this.teachers = teachers;
    }
    public void setStudents(Vector<Student> students){
        this.students = students;
    }
    public void setCourseFiles(Vector<CourseFile> courseFiles){
        this.courseFiles = courseFiles;
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public int getCredits(){
        return this.credits;
    }
    public String getFaculty(){
        return this.faculty;
    }
    public Vector<Teacher> getTeachers(){
        return this.teachers;
    }
    public Vector<Student> getStudents(){
        return this.students;
    }
    public Vector<CourseFile> getCourseFiles(){
        return this.courseFiles;
    }
    public String toString(){
        return this.id + " " + this.name + " " +this.credits + " " +this.faculty;
    }
    public boolean equals(Object o){
        Course c = (Course)o;
        boolean ok = false;
        if(c.getName().equals(this.name) && c.getId().equals(this.id) && c.getCredits() == this.credits && c.getFaculty().equals(this.faculty) && c.getCourseFiles().equals(this.courseFiles) && c.getTeachers().equals(this.teachers) && c.getStudents().equals(this.students)){
            ok = true;
        }
        return ok;
    }
}
