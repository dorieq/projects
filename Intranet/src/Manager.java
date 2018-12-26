

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;

public class Manager extends Employee implements Serializable {
    private TreeMap<Teacher, TreeMap<Course, ArrayList<Student>>> pack;
    public void addCourse(Course course,int x){

    }
    public void viewInfo(){

    }
    public void sendMessage(String message){

    }
}
