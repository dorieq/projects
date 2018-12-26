import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Vector;

public class Teacher extends Employee implements Serializable {
    private TreeMap<Course,ArrayList<Student>> coursesStudInfo;
    private String typeOfDegree;
    Teacher(String name, String login)
    {
        this.name = name;
        this.login = login;
    }
    public void save(Vector<Teacher> v){
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

}
